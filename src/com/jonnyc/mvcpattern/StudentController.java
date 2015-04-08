package com.jonnyc.mvcpattern;

public class StudentController {

    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view){
        this.model = model;
        this.view = view;
    }

    public int getStudentNumber(){
        return model.getRollNo();
    }

    public void setStudentNumber(int rollNo){
        model.setRollNo(rollNo);
    }

    public String getStudentName(){
        return model.getName();
    }

    public void setStudentName(String name){
        model.setName(name);
    }

    public void updateView(){
        view.printStudentDetails(model.getRollNo(), model.getName());
    }
}
