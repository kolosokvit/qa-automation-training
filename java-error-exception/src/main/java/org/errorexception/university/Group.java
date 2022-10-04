package org.errorexception.university;


import org.errorexception.exceptions.GroupWithNoStudentsException;
import org.errorexception.exceptions.NoStudentsWithSubjectException;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private int number;
    private List<Student> students = new ArrayList<>();

    public Group(int number) {
        this.number = number;
    }

    public double getAverageGradeBySubject(Subject subject) {
        if (students == null || students.isEmpty()) {
            throw new GroupWithNoStudentsException("There are no students in this group.");
        }
        int totalStudentsWithSubjectInGroup = 0;
        double totalAverageGradeBySubjectInGroup = 0;
        for (Student student : students) {
            if (student.getGrades().containsKey(subject)) {
                totalAverageGradeBySubjectInGroup += student.getAverageGradeOneSubject(subject);
                totalStudentsWithSubjectInGroup++;
            }
        }
        if (totalStudentsWithSubjectInGroup == 0) {
            throw new NoStudentsWithSubjectException("There are no students studying this subject in this group.");
        }
        return totalAverageGradeBySubjectInGroup / totalStudentsWithSubjectInGroup;
    }

    public int getNumber() {
        return number;
    }

    public List<Student> getStudents() {
        return students;
    }
}
