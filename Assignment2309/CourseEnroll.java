package com.springboot.demo.assignment.asssignment2309;

public class CourseEnroll {
    private String enrolmentId;
    private String studentId;
    private int courseId;

    public CourseEnroll(String enrolmentId, String studentId, int courseId) {
        this.enrolmentId = enrolmentId;
        this.studentId = studentId;
        this.courseId = courseId;
    }

    @Override
    public String toString() {
        return "CourseEnroll{" +
                "enrolmentId='" + enrolmentId + '\'' +
                ", studentId='" + studentId + '\'' +
                ", courseId=" + courseId +
                '}';
    }

    public String getEnrolmentId() {
        return enrolmentId;
    }

    public void setEnrolmentId(String enrolmentId) {
        this.enrolmentId = enrolmentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
}
