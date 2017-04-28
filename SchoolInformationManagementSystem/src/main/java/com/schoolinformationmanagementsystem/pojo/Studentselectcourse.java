package com.schoolinformationmanagementsystem.pojo;

import java.util.Date;

public class Studentselectcourse {
    private Integer increId;

    private Integer increStuId;

    private Integer courseId;

    private Date selectTime;

    public Integer getIncreId() {
        return increId;
    }

    public void setIncreId(Integer increId) {
        this.increId = increId;
    }

    public Integer getIncreStuId() {
        return increStuId;
    }

    public void setIncreStuId(Integer increStuId) {
        this.increStuId = increStuId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Date getSelectTime() {
        return selectTime;
    }

    public void setSelectTime(Date selectTime) {
        this.selectTime = selectTime;
    }
}