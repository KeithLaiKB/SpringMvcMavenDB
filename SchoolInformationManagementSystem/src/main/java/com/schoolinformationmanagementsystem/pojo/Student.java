package com.schoolinformationmanagementsystem.pojo;

public class Student {
    private Integer increStuId;

    private String stuId;

    private String stuName;

    private String gender;

    public Integer getIncreStuId() {
        return increStuId;
    }

    public void setIncreStuId(Integer increStuId) {
        this.increStuId = increStuId;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId == null ? null : stuId.trim();
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName == null ? null : stuName.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }
}