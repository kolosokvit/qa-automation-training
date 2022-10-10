package org.errorexception.university;


import org.errorexception.exceptions.GradeOutOfRangeException;
import org.errorexception.exceptions.StudentWithNoSubjectsException;
import org.errorexception.exceptions.StudentWithNoSuchSubjectException;
import org.errorexception.utils.ResultRounder;

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

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public double getAverageGradeOneSubject(Subject subject) {
        if (grades == null || grades.isEmpty()) {
            throw new StudentWithNoSubjectsException("This student hasn't any subjects.");
        }
        if (!grades.containsKey(subject)) {
            throw new StudentWithNoSuchSubjectException("This student doesn't study this subject.");
        }
        List<Integer> subjectGrades = grades.get(subject);
        int totalGrade = 0;
        for (Integer grade : subjectGrades) {
            if (grade < 0 || grade > 10) {
                throw new GradeOutOfRangeException();
            }
            totalGrade += grade;

        }
        return ResultRounder.round(totalGrade / (subjectGrades.size() * 1.0));
    }

    public double getAverageGradeAllSubjects() {
        if (grades == null || grades.isEmpty()) {
            throw new StudentWithNoSubjectsException("This student hasn't any subjects.");
        }
        double totalGrade = 0;
        for (Map.Entry<Subject, ArrayList<Integer>> entry : grades.entrySet()) {
            totalGrade += getAverageGradeOneSubject(entry.getKey());
        }
        return ResultRounder.round(totalGrade / grades.size());
    }

    public void addNewGradeBySubject(Subject subject, int newGrade) {
        if (newGrade < 0 || newGrade > 10) {
            throw new GradeOutOfRangeException("Grade must be in 0-10 range.");
        }
        grades.get(subject).add(newGrade);
    }

    public void addGradesBySubject(Subject subject, ArrayList<Integer> gradesToAdd) {
        if (!grades.containsKey(subject)) {
            grades.put(subject, gradesToAdd);
        } else {
            grades.get(subject).addAll(gradesToAdd);
        }
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

    public void setName(String name) {
        this.name = name;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", group=" + group.getNumber() +
                ", faculty=" + faculty.getName() +
                ", university=" + university.getName() +
                ", grades=" + grades +
                '}';
    }
}
