package com.springboot.demo.assignment.asssignment2309;

public class Student {

    private String studentId;
    private String name;
    private String collegeName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Student(String studentId, String name, String collegeName) {
        this.studentId = studentId;
        this.name = name;
        this.collegeName = collegeName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", name='" + name + '\'' +
                ", collegeName='" + collegeName + '\'' +
                '}';
    }
}
