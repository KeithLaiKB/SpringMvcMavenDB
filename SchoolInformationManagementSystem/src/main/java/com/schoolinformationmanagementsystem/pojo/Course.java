package com.schoolinformationmanagementsystem.pojo;

public class Course {
    private Integer courseId;

    private String courseName;

    private Integer increTeacherId;

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    public Integer getIncreTeacherId() {
        return increTeacherId;
    }

    public void setIncreTeacherId(Integer increTeacherId) {
        this.increTeacherId = increTeacherId;
    }
}