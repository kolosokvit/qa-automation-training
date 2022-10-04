package org.errorexception.university;

import org.example.exceptions.NoStudentsWithSubjectException;
import org.example.exceptions.UniversityWithNoFacultiesException;

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
            throw new UniversityWithNoFacultiesException();
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
            throw new NoStudentsWithSubjectException();
        }
        return totalAverageGradeBySubject / totalStudentsWithSubject;
    }

    public String getName() {
        return name;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }
}
