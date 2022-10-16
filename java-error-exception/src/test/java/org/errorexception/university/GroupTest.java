package org.errorexception.university;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

class GroupTest {
    private Group testGroup;
    private Student student1;
    private Student student2;

    @BeforeEach
    void init() {
        student1 = new Student("Bob Black", 1001);
        student1.addGradesBySubject(Subject.PROGRAMMING_LANGUAGES_AND_LOGIC, new ArrayList<>(Arrays.asList(8, 9, 10, 9)));
        student1.addGradesBySubject(Subject.COMPUTER_ARCHITECTURE_AND_ORGANISATION, new ArrayList<>(Arrays.asList(9, 9, 10, 7)));
        student1.addGradesBySubject(Subject.DATA_STRUCTURES_AND_ALGORITHMS, new ArrayList<>(Arrays.asList(7, 9, 8, 9)));
        student1.addGradesBySubject(Subject.SOFTWARE_ENGINEERING, new ArrayList<>(Arrays.asList(10, 10, 8, 9)));
        student1.addGradesBySubject(Subject.THEORY_OF_COMPUTATION, new ArrayList<>(Arrays.asList(9, 9, 8, 9)));

        student2 = new Student("Kate Wind", 1002);
        student2.addGradesBySubject(Subject.PROGRAMMING_LANGUAGES_AND_LOGIC, new ArrayList<>(Arrays.asList(7, 6, 7, 8)));
        student2.addGradesBySubject(Subject.COMPUTER_ARCHITECTURE_AND_ORGANISATION, new ArrayList<>(Arrays.asList(10, 9, 10, 7)));
        student2.addGradesBySubject(Subject.DATA_STRUCTURES_AND_ALGORITHMS, new ArrayList<>(Arrays.asList(7, 8, 8, 9)));
        student2.addGradesBySubject(Subject.SOFTWARE_ENGINEERING, new ArrayList<>(Arrays.asList(7, 7, 8, 9)));
        student2.addGradesBySubject(Subject.THEORY_OF_COMPUTATION, new ArrayList<>(Arrays.asList(6, 9, 8, 9)));

        testGroup = new Group(1);
    }

    @Test
    void getAverageGradeBySubject() {
        testGroup.addStudentToGroup(student1);
        testGroup.addStudentToGroup(student2);
        Assertions.assertEquals(8, testGroup.getAverageGradeBySubject(Subject.PROGRAMMING_LANGUAGES_AND_LOGIC));
    }

    @Test
    void addStudentToGroup() {
        testGroup.addStudentToGroup(student1);
        Assertions.assertTrue(testGroup.getStudents().contains(student1));
    }
}