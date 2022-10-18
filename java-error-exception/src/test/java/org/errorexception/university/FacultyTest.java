package org.errorexception.university;

import org.errorexception.exceptions.FacultyWithNoGroupsException;
import org.errorexception.exceptions.GroupWithNoStudentsException;
import org.errorexception.exceptions.NoStudentsWithSubjectException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FacultyTest {
    private Faculty testFaculty;
    private Group testGroup1;
    private Group testGroup2;

    @BeforeEach
    void init() {
        Student student1 = new Student("Bob Black", 1001);
        student1.addGradesBySubject(Subject.PROGRAMMING_LANGUAGES_AND_LOGIC, new ArrayList<>(Arrays.asList(8, 9, 10, 9)));
        student1.addGradesBySubject(Subject.COMPUTER_ARCHITECTURE_AND_ORGANISATION, new ArrayList<>(Arrays.asList(9, 9, 10, 7)));
        student1.addGradesBySubject(Subject.DATA_STRUCTURES_AND_ALGORITHMS, new ArrayList<>(Arrays.asList(7, 9, 8, 9)));
        student1.addGradesBySubject(Subject.SOFTWARE_ENGINEERING, new ArrayList<>(Arrays.asList(10, 10, 8, 9)));
        student1.addGradesBySubject(Subject.THEORY_OF_COMPUTATION, new ArrayList<>(Arrays.asList(9, 9, 8, 9)));

        Student student2 = new Student("Kate Wind", 1002);
        student2.addGradesBySubject(Subject.PROGRAMMING_LANGUAGES_AND_LOGIC, new ArrayList<>(Arrays.asList(7, 6, 7, 8)));
        student2.addGradesBySubject(Subject.COMPUTER_ARCHITECTURE_AND_ORGANISATION, new ArrayList<>(Arrays.asList(10, 9, 10, 7)));
        student2.addGradesBySubject(Subject.DATA_STRUCTURES_AND_ALGORITHMS, new ArrayList<>(Arrays.asList(7, 8, 8, 9)));
        student2.addGradesBySubject(Subject.SOFTWARE_ENGINEERING, new ArrayList<>(Arrays.asList(7, 7, 8, 9)));
        student2.addGradesBySubject(Subject.THEORY_OF_COMPUTATION, new ArrayList<>(Arrays.asList(6, 9, 8, 9)));

        testGroup1 = new Group(1);
        testGroup1.addStudentToGroup(student1);
        testGroup2 = new Group(2);
        testGroup2.addStudentToGroup(student2);

        testFaculty = new Faculty("TestFaculty");
    }

    @Test
    void getAverageGradeBySubject() {
        testFaculty.addGroupToFaculty(testGroup1);
        testFaculty.addGroupToFaculty(testGroup2);
        Assertions.assertEquals(8, testFaculty.getAverageGradeBySubject(Subject.PROGRAMMING_LANGUAGES_AND_LOGIC));
    }

    @Test
    void addGroupToFaculty() {
        testFaculty.addGroupToFaculty(testGroup1);
        Assertions.assertTrue(testFaculty.getGroups().contains(testGroup1));
    }

    @Test
    void shouldThrowFacultyWithNoGroupsException() {
        Assertions.assertThrows(FacultyWithNoGroupsException.class, () -> testFaculty.getAverageGradeBySubject(Subject.PROGRAMMING_LANGUAGES_AND_LOGIC));
    }

    @Test
    void shouldThrowNoStudentsWithSubjectException() {
        testFaculty.addGroupToFaculty(testGroup1);
        testFaculty.addGroupToFaculty(testGroup2);
        Assertions.assertThrows(NoStudentsWithSubjectException.class, () -> testFaculty.getAverageGradeBySubject(Subject.COMPUTER_GRAPHICS));
    }
}