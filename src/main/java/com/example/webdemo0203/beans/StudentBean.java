package com.example.webdemo0203.beans;

import com.example.webdemo0203.entities.Student;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import lombok.Data;

import java.io.Serializable;

@Data
@Named
@SessionScoped
public class StudentBean implements Serializable {

    @Inject
    private StorageBean storageBean;

    private Student student = new Student();

    private String mark;

    public String sayHello() {
        if (student.getRating() >= 90) {
            mark = "A";
        } else if (student.getRating() >= 82) {
            mark = "B";
        } else if (student.getRating() >= 74) {
            mark = "C";
        } else if (student.getRating() >= 64) {
            mark = "D";
        } else if (student.getRating() >= 60) {
            mark = "E";
        } else mark = "F";
        return "hello";
    }

    public void add() {
        // check student
        storageBean.getStudents().add(student);
        student = new Student();
    }
}
