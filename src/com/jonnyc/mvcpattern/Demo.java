package com.jonnyc.mvcpattern;

public class Demo {

    public static void main(String[] args) {

        Student model = retrieveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.updateView();
        controller.setStudentName("Bob");
        controller.setStudentNumber(500);
        controller.updateView();
    }

    public static Student retrieveStudentFromDatabase(){

        Student student = new Student(){{
            setRollNo(10);
            setName("John");
        }};

        return student;
    }
}
