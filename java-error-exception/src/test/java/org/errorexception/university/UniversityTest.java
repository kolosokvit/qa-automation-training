package org.errorexception.university;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

class UniversityTest {
    private University testUniversity;
    private Faculty testFaculty1;
    private Faculty testFaculty2;

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

        Group testGroup1 = new Group(1);
        testGroup1.addStudentToGroup(student1);
        Group testGroup2 = new Group(2);
        testGroup2.addStudentToGroup(student2);

        testFaculty1 = new Faculty("TestFaculty1");
        testFaculty1.addGroupToFaculty(testGroup1);
        testFaculty2 = new Faculty("TestFaculty2");
        testFaculty2.addGroupToFaculty(testGroup2);

        testUniversity = new University("TestUniversity");
    }

    @Test
    void getAverageGradeBySubject() {
        testUniversity.addFacultyToUniversity(testFaculty1);
        testUniversity.addFacultyToUniversity(testFaculty2);
        Assertions.assertEquals(8, testUniversity.getAverageGradeBySubject(Subject.PROGRAMMING_LANGUAGES_AND_LOGIC));
    }

    @Test
    void addFacultyToUniversity() {
        testUniversity.addFacultyToUniversity(testFaculty1);
        Assertions.assertTrue(testUniversity.getFaculties().contains(testFaculty1));
    }
}