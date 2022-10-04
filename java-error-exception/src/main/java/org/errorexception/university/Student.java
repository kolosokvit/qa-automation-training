package org.errorexception.university;

import org.example.exceptions.GradeOutOfRangeException;
import org.example.exceptions.StudentWithNoSubjectsException;
import org.example.exceptions.StudentWithNoSuchSubjectException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {
    private String name;
    private int id;
    private Group group;
    private Faculty faculty;
    private University university;
    private Map<Subject, ArrayList<Integer>> grades = new HashMap<>();

    public Student(String name, int id, Group group, Faculty faculty, University university) {
        this.name = name;
        this.id = id;
        this.group = group;
        this.faculty = faculty;
        this.university = university;
    }

    public double getAverageGradeOneSubject(Subject subject) {
        if (grades == null || grades.isEmpty()) {
            throw new StudentWithNoSubjectsException();
        }
        if (!grades.containsKey(subject)) {
            throw new StudentWithNoSuchSubjectException();
        }
        List<Integer> subjectGrades = grades.get(subject);
        int totalGrade = 0;
        for (Integer grade : subjectGrades) {
            if (grade < 0 || grade > 10) {
                throw new GradeOutOfRangeException();
            }
            totalGrade += grade;

        }
        return totalGrade / (subjectGrades.size() * 1.0);
    }

    public double getAverageGradeAllSubjects() {
        if (grades == null || grades.isEmpty()) {
            throw new StudentWithNoSubjectsException();
        }
        double totalGrade = 0;
        for (Map.Entry<Subject, ArrayList<Integer>> entry : grades.entrySet()) {
            totalGrade += getAverageGradeOneSubject(entry.getKey());
        }
        return totalGrade / grades.size();
    }

    public void addNewGradeBySubject(Subject subject, int newGrade) {
        if (newGrade < 0 || newGrade > 10) {
            throw new GradeOutOfRangeException();
        }
        grades.get(subject).add(newGrade);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Group getGroup() {
        return group;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public University getUniversity() {
        return university;
    }

    public Map<Subject, ArrayList<Integer>> getGrades() {
        return grades;
    }
}
