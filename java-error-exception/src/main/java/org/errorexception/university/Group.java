package org.errorexception.university;

import org.example.exceptions.GroupWithNoStudentsException;
import org.example.exceptions.NoStudentsWithSubjectException;

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
            throw new GroupWithNoStudentsException();
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
            throw new NoStudentsWithSubjectException();
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
