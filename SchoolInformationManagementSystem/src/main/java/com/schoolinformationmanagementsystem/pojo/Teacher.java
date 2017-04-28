package com.schoolinformationmanagementsystem.pojo;

public class Teacher {
    private Integer increTeacherId;

    private String teacherId;

    private String teacherName;

    private String gender;

    public Integer getIncreTeacherId() {
        return increTeacherId;
    }

    public void setIncreTeacherId(Integer increTeacherId) {
        this.increTeacherId = increTeacherId;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId == null ? null : teacherId.trim();
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }
}