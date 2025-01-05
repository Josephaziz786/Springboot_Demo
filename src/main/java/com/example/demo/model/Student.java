package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class Student {
    private int roll;
    public String name;
    public float marks;

    public Student(int roll, String name, float marks) {
        this.roll = roll;
        this.name = name;
        this.name = name.toUpperCase();
        this.marks = marks;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getString() {
        return name;
    }

    public void setString(String name) {
        this.name = name;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }
}
