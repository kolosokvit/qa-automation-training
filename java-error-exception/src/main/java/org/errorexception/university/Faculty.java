package org.errorexception.university;

import org.example.exceptions.FacultyWithNoGroupsException;
import org.example.exceptions.NoStudentsWithSubjectException;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String name;
    private List<Group> groups = new ArrayList<>();

    public Faculty(String name) {
        this.name = name;
    }

    public double getAverageGradeBySubject(Subject subject) {
        if (groups == null || groups.isEmpty()) {
            throw new FacultyWithNoGroupsException();
        }
        int totalStudentsWithSubject = 0;
        double totalAverageGradeBySubjectOnFaculty = 0;
        for (Group group : groups) {
            for (Student student : group.getStudents()) {
                if (student.getGrades().containsKey(subject)) {
                    totalStudentsWithSubject++;
                    totalAverageGradeBySubjectOnFaculty += student.getAverageGradeOneSubject(subject);
                }
            }
        }
        if (totalStudentsWithSubject == 0) {
            throw new NoStudentsWithSubjectException();
        }
        return totalAverageGradeBySubjectOnFaculty / totalStudentsWithSubject;
    }

    public String getName() {
        return name;
    }

    public List<Group> getGroups() {
        return groups;
    }
}
