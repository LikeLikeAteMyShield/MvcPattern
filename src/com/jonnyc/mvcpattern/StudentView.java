package com.jonnyc.mvcpattern;

public class StudentView {

    public void printStudentDetails(int studentRollNo, String studentName){

        System.out.println("Student: ");
        System.out.println("Roll No: " + studentRollNo);
        System.out.println("Name:    " + studentName);
    }
}
