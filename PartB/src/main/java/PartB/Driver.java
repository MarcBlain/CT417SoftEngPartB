package PartB;


import java.util.ArrayList;

import partA.*;


public class Driver {
    private static int studentcount = 100;

    public static void main(final String... args) {
        final ArrayList<Student> batch1 = new ArrayList<>();
        batch1.add(new Student("Marc Blain", "12-03-1989", studentcount++));
        batch1.add(new Student("Diarmuid Beirne", "12-03-1989", studentcount++)); 
        batch1.add(new Student("Steven Noonan", "12-03-1989", studentcount++));
        batch1.add(new Student("Alan Devane", "12-03-1989", studentcount++));
        
        final Module m1 = new Module("Software Engineering", "CT100");
        final Module m2 = new Module("Professional Skills", "CT200");
        final Module m3 = new Module("Databases", "CT300");
        final Module m4 = new Module("Programming Paradigms", "CT400");
        final Module m5 = new Module("Modern Information Management", "CT500");
        final Module m6 = new Module("Mathematics", "MA600");
        final Module m7 = new Module("HCI", "CT700");

        final Course c1 = new Course("Computer Science & IT", "01-09-2013", "30-05-2017");

        //Add individual Student to several modules
        m1.addStudent(new Student("Help Me", "12-03-1989", studentcount++));
        m2.addStudent(new Student("Help Me", "12-03-1989", studentcount++));
        m3.addStudent(new Student("Help Me", "12-03-1989", studentcount++));
        m4.addStudent(new Student("Help Me", "12-03-1989", studentcount++));
        m5.addStudent(new Student("Help Me", "12-03-1989", studentcount++));
        m6.addStudent(new Student("Help Me", "12-03-1989", studentcount++));
        m7.addStudent(new Student("Help Me", "12-03-1989", studentcount++));
        
        //Add batch of students
        m1.addStudents(batch1);
        m2.addStudents(batch1);
        m3.addStudents(batch1);
        m4.addStudents(batch1);
        m5.addStudents(batch1);
        m6.addStudents(batch1);
        m7.addStudents(batch1);

        c1.addModule(m1);
        c1.addModule(m2);
        c1.addModule(m3);
        c1.addModule(m4);
        c1.addModule(m5);
        c1.addModule(m6);
        c1.addModule(m7);

        for (final Student student : c1.getStudents()) {
            System.out.println("--------------- STUDENT ---------------");
            System.out.println("Name:\t" + student.getStudentName());

            System.out.println("DOB:\t" + student.getDob() + "\t" + " -  Age: " + student.getAge());
            System.out.println("Username:\t" + student.getUsername());
            System.out.println("Student ID:\t" + student.getStudentID());
            System.out.println("\n");
            System.out.println("Course:\t" + student.getCourseName());
            printStudentModules(student);
            System.out.println("---------------------------------------\n");
        }


    }

    public static void printStudentModules(final Student student) {
        System.out.println("\nMODULES:");
        for (final Module module : student.getModules()) {
            System.out.println(module.toString());
        }
    }
}