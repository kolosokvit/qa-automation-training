package org.errorexception.university;

import org.errorexception.exceptions.NoStudentsWithSubjectException;
import org.errorexception.exceptions.UniversityWithNoFacultiesException;
import org.errorexception.utils.ResultRounder;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private List<Faculty> faculties = new ArrayList<>();

    public University(String name) {
        this.name = name;
    }

    public double getAverageGradeBySubject(Subject subject) {
        if (faculties == null || faculties.isEmpty()) {
            throw new UniversityWithNoFacultiesException("There are no faculties in this university.");
        }
        int totalStudentsWithSubject = 0;
        double totalAverageGradeBySubject = 0;
        for (Faculty faculty : faculties) {
            for (Group group : faculty.getGroups()) {
                for (Student student : group.getStudents()) {
                    if (student.getGrades().containsKey(subject)) {
                        totalStudentsWithSubject++;
                        totalAverageGradeBySubject += student.getAverageGradeOneSubject(subject);
                    }
                }
            }
        }
        if (totalStudentsWithSubject == 0) {
            throw new NoStudentsWithSubjectException("There are no students studying this subject in this university.");
        }
        return ResultRounder.round(totalAverageGradeBySubject / totalStudentsWithSubject);
    }

    public void addFacultyToUniversity(Faculty faculty) {
        faculties.add(faculty);
        for (Group group : faculty.getGroups()) {
            for (Student student : group.getStudents()) {
                student.setUniversity(this);
            }
        }
    }

    public String getName() {
        return name;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }
}
