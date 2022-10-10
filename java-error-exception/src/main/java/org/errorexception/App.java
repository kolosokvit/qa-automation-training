package org.errorexception;


import org.errorexception.university.*;

import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main( String[] args ) {
        Student student1 = new Student("Bob Black", 1001);
        student1.addGradesBySubject(Subject.PROGRAMMING_LANGUAGES_AND_LOGIC, new ArrayList<>(Arrays.asList(8, 9, 10, 9)));
        student1.addGradesBySubject(Subject.COMPUTER_ARCHITECTURE_AND_ORGANISATION, new ArrayList<>(Arrays.asList(9, 9, 10, 7)));
        student1.addGradesBySubject(Subject.DATA_STRUCTURES_AND_ALGORITHMS, new ArrayList<>(Arrays.asList(7, 9, 8, 9)));
        student1.addGradesBySubject(Subject.SOFTWARE_ENGINEERING, new ArrayList<>(Arrays.asList(10, 10, 8, 9)));
        student1.addGradesBySubject(Subject.THEORY_OF_COMPUTATION, new ArrayList<>(Arrays.asList(9, 9, 8, 9)));

        Student student2 = new Student("Kate Wind", 1002);
        student2.addGradesBySubject(Subject.PROGRAMMING_LANGUAGES_AND_LOGIC, new ArrayList<>(Arrays.asList(7, 6, 8, 9)));
        student2.addGradesBySubject(Subject.COMPUTER_ARCHITECTURE_AND_ORGANISATION, new ArrayList<>(Arrays.asList(10, 9, 10, 7)));
        student2.addGradesBySubject(Subject.DATA_STRUCTURES_AND_ALGORITHMS, new ArrayList<>(Arrays.asList(7, 8, 8, 9)));
        student2.addGradesBySubject(Subject.SOFTWARE_ENGINEERING, new ArrayList<>(Arrays.asList(7, 7, 8, 9)));
        student2.addGradesBySubject(Subject.THEORY_OF_COMPUTATION, new ArrayList<>(Arrays.asList(6, 9, 8, 9)));

        Student student3 = new Student("John Green", 1003);
        student3.addGradesBySubject(Subject.PROGRAMMING_LANGUAGES_AND_LOGIC, new ArrayList<>(Arrays.asList(8, 9, 8, 9)));
        student3.addGradesBySubject(Subject.COMPUTER_ARCHITECTURE_AND_ORGANISATION, new ArrayList<>(Arrays.asList(8, 9, 10, 7)));
        student3.addGradesBySubject(Subject.DATA_STRUCTURES_AND_ALGORITHMS, new ArrayList<>(Arrays.asList(7, 8, 8, 9)));
        student3.addGradesBySubject(Subject.SCIENTIFIC_COMPUTING_APPLICATIONS, new ArrayList<>(Arrays.asList(10, 10, 8, 9)));
        student3.addGradesBySubject(Subject.ARTIFICIAL_INTELLIGENCE, new ArrayList<>(Arrays.asList(8, 9, 8, 9)));

        Student student4 = new Student("Ann Brown", 1004);
        student4.addGradesBySubject(Subject.PROGRAMMING_LANGUAGES_AND_LOGIC, new ArrayList<>(Arrays.asList(8, 8, 8, 6)));
        student4.addGradesBySubject(Subject.COMPUTER_ARCHITECTURE_AND_ORGANISATION, new ArrayList<>(Arrays.asList(8, 9, 7, 7)));
        student4.addGradesBySubject(Subject.DATA_STRUCTURES_AND_ALGORITHMS, new ArrayList<>(Arrays.asList(7, 6, 8, 7)));
        student4.addGradesBySubject(Subject.SCIENTIFIC_COMPUTING_APPLICATIONS, new ArrayList<>(Arrays.asList(10, 10, 9, 9)));
        student4.addGradesBySubject(Subject.ARTIFICIAL_INTELLIGENCE, new ArrayList<>(Arrays.asList(8, 9, 9, 9)));

        Student student5 = new Student("Tim Rock", 1005);
        student5.addGradesBySubject(Subject.PROGRAMMING_LANGUAGES_AND_LOGIC, new ArrayList<>(Arrays.asList(8, 9, 8, 9)));
        student5.addGradesBySubject(Subject.COMPUTER_NETWORKS, new ArrayList<>(Arrays.asList(8, 9, 10, 7)));
        student5.addGradesBySubject(Subject.DATA_STRUCTURES_AND_ALGORITHMS, new ArrayList<>(Arrays.asList(7, 8, 8, 9)));
        student5.addGradesBySubject(Subject.COMPUTER_SECURITY_AND_CRYPTOGRAPHY, new ArrayList<>(Arrays.asList(10, 10, 8, 9)));
        student5.addGradesBySubject(Subject.DATABASES_AND_DATA_MINING, new ArrayList<>(Arrays.asList(8, 9, 8, 9)));

        Student student6 = new Student("Jane Forest", 1006);
        student6.addGradesBySubject(Subject.PROGRAMMING_LANGUAGES_AND_LOGIC, new ArrayList<>(Arrays.asList(8, 6, 8, 9)));
        student6.addGradesBySubject(Subject.COMPUTER_NETWORKS, new ArrayList<>(Arrays.asList(8, 9, 6, 7)));
        student6.addGradesBySubject(Subject.DATA_STRUCTURES_AND_ALGORITHMS, new ArrayList<>(Arrays.asList(6, 6, 8, 6)));
        student6.addGradesBySubject(Subject.COMPUTER_SECURITY_AND_CRYPTOGRAPHY, new ArrayList<>(Arrays.asList(7, 10, 8, 9)));
        student6.addGradesBySubject(Subject.DATABASES_AND_DATA_MINING, new ArrayList<>(Arrays.asList(8, 6, 8, 9)));

        Student student7 = new Student("Tom Creek", 1007);
        student7.addGradesBySubject(Subject.PROGRAMMING_LANGUAGES_AND_LOGIC, new ArrayList<>(Arrays.asList(7, 8, 8, 9)));
        student7.addGradesBySubject(Subject.COMPUTER_NETWORKS, new ArrayList<>(Arrays.asList(6, 9, 10, 7)));
        student7.addGradesBySubject(Subject.THEORY_OF_COMPUTATION, new ArrayList<>(Arrays.asList(10, 8, 8, 6)));
        student7.addGradesBySubject(Subject.COMPUTER_SECURITY_AND_CRYPTOGRAPHY, new ArrayList<>(Arrays.asList(10, 10, 8, 9)));
        student7.addGradesBySubject(Subject.DATABASES_AND_DATA_MINING, new ArrayList<>(Arrays.asList(8, 6, 7, 9)));

        Student student8 = new Student("Amy Lee", 1008);
        student8.addGradesBySubject(Subject.PROGRAMMING_LANGUAGES_AND_LOGIC, new ArrayList<>(Arrays.asList(10, 7, 8, 9)));
        student8.addGradesBySubject(Subject.COMPUTER_NETWORKS, new ArrayList<>(Arrays.asList(10, 7, 6, 7)));
        student8.addGradesBySubject(Subject.DATA_STRUCTURES_AND_ALGORITHMS, new ArrayList<>(Arrays.asList(10, 8, 8, 6)));
        student8.addGradesBySubject(Subject.THEORY_OF_COMPUTATION, new ArrayList<>(Arrays.asList(10, 7, 8, 9)));
        student8.addGradesBySubject(Subject.DATABASES_AND_DATA_MINING, new ArrayList<>(Arrays.asList(8, 10, 8, 9)));

        Group group2022001 = new Group(2022001);
        group2022001.addStudentToGroup(student1);
        group2022001.addStudentToGroup(student2);

        Group group2022002 = new Group(2022002);
        group2022002.addStudentToGroup(student3);
        group2022002.addStudentToGroup(student4);

        Group group2022003 = new Group(2022003);
        group2022003.addStudentToGroup(student5);
        group2022003.addStudentToGroup(student6);

        Group group2022004 = new Group(2022004);
        group2022004.addStudentToGroup(student7);
        group2022004.addStudentToGroup(student8);

        Faculty softwareDevelopmentFaculty = new Faculty("Software development faculty");
        softwareDevelopmentFaculty.addGroupToFaculty(group2022001);
        softwareDevelopmentFaculty.addGroupToFaculty(group2022002);

        Faculty computerNetworksAndSystemsFaculty = new Faculty("Computer networks and systems faculty");
        computerNetworksAndSystemsFaculty.addGroupToFaculty(group2022003);
        computerNetworksAndSystemsFaculty.addGroupToFaculty(group2022004);

        University university = new University("University");
        university.addFacultyToUniversity(softwareDevelopmentFaculty);
        university.addFacultyToUniversity(softwareDevelopmentFaculty);

        for (Faculty faculty : university.getFaculties()) {
            for (Group group : faculty.getGroups()) {
                for (Student student : group.getStudents()) {
                    System.out.println(student.toString());
                    System.out.println(student.getName() + " average grade: " + student.getAverageGradeAllSubjects());
                }
            }
        }

        System.out.printf("Group %s average grade for subject %s: %.2f%n", group2022001.getNumber(),
                Subject.THEORY_OF_COMPUTATION, group2022001.getAverageGradeBySubject(Subject.THEORY_OF_COMPUTATION));
        System.out.printf("%s average grade for subject %s: %.2f%n", softwareDevelopmentFaculty.getName(),
                Subject.SOFTWARE_ENGINEERING, softwareDevelopmentFaculty.getAverageGradeBySubject(Subject.SOFTWARE_ENGINEERING));
        System.out.printf("%s average grade for subject %s: %.2f%n", computerNetworksAndSystemsFaculty.getName(),
                Subject.COMPUTER_NETWORKS, computerNetworksAndSystemsFaculty.getAverageGradeBySubject(Subject.COMPUTER_NETWORKS));
        System.out.printf("%s average grade for subject %s: %.2f%n", university.getName(),
                Subject.PROGRAMMING_LANGUAGES_AND_LOGIC, university.getAverageGradeBySubject(Subject.PROGRAMMING_LANGUAGES_AND_LOGIC));
    }
}
