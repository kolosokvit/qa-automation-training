package org.errorexception.university;

import org.errorexception.exceptions.GradeOutOfRangeException;
import org.errorexception.exceptions.StudentWithNoSubjectsException;
import org.errorexception.exceptions.StudentWithNoSuchSubjectException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    private Student student;

    @BeforeEach
    void init() {
        student = new Student("Bob Black", 1001);
        student.addGradesBySubject(Subject.PROGRAMMING_LANGUAGES_AND_LOGIC, new ArrayList<>(Arrays.asList(8, 9, 10, 9)));
        student.addGradesBySubject(Subject.COMPUTER_ARCHITECTURE_AND_ORGANISATION, new ArrayList<>(Arrays.asList(8, 8, 8, 8)));
    }

    @Test
    void getAverageGradeOneSubject() {
        Assertions.assertEquals(9.0, student.getAverageGradeOneSubject(Subject.PROGRAMMING_LANGUAGES_AND_LOGIC));
    }

    @Test
    void getAverageGradeAllSubjects() {
        Assertions.assertEquals(8.5, student.getAverageGradeAllSubjects());
    }

    @Test
    void addNewGradeBySubject() {
        student.addNewGradeBySubject(Subject.PROGRAMMING_LANGUAGES_AND_LOGIC, 7);
        ArrayList<Integer> expectedGrades = new ArrayList<>(Arrays.asList(8, 9, 10, 9, 7));
        assertEquals(expectedGrades, student.getGrades().get(Subject.PROGRAMMING_LANGUAGES_AND_LOGIC));
    }

    @Test
    void addGradesBySubject() {
        ArrayList<Integer> gradesToAdd = new ArrayList<>(Arrays.asList(7, 8, 9));
        student.addGradesBySubject(Subject.PROGRAMMING_LANGUAGES_AND_LOGIC, gradesToAdd);
        ArrayList<Integer> expectedGrades = new ArrayList<>(Arrays.asList(8, 9, 10, 9, 7, 8, 9));
        assertEquals(expectedGrades, student.getGrades().get(Subject.PROGRAMMING_LANGUAGES_AND_LOGIC));
    }

    @Test
    void shouldThrowStudentWithNoSubjectsException() {
        Student studentWithNoSubjects = new Student("Dave Clamp", 1002);
        Assertions.assertThrows(StudentWithNoSubjectsException.class, () -> studentWithNoSubjects.getAverageGradeAllSubjects());
    }

    @Test
    void shouldThrowStudentWithNoSuchSubjectException() {
        Assertions.assertThrows(StudentWithNoSuchSubjectException.class, () -> student.getAverageGradeOneSubject(Subject.COMPUTER_GRAPHICS));
    }

    @Test
    void shouldThrowGradeOutOfRangeException() {
        Assertions.assertThrows(GradeOutOfRangeException.class, () -> student.addNewGradeBySubject(Subject.PROGRAMMING_LANGUAGES_AND_LOGIC, 11));
    }
}