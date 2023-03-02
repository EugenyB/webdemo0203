package com.example.webdemo0203.beans;

import com.example.webdemo0203.entities.Student;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Named
@ApplicationScoped
public class StorageBean {
    @Getter
    private List<Student> students;

    @PostConstruct
    public void init() {
        students = new ArrayList<>();
    }


}
