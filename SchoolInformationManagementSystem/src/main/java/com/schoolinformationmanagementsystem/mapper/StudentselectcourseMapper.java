package com.schoolinformationmanagementsystem.mapper;

import com.schoolinformationmanagementsystem.pojo.Studentselectcourse;
import com.schoolinformationmanagementsystem.pojo.StudentselectcourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentselectcourseMapper {
    int countByExample(StudentselectcourseExample example);

    int deleteByExample(StudentselectcourseExample example);

    int deleteByPrimaryKey(Integer increId);

    int insert(Studentselectcourse record);

    int insertSelective(Studentselectcourse record);

    List<Studentselectcourse> selectByExample(StudentselectcourseExample example);

    Studentselectcourse selectByPrimaryKey(Integer increId);

    int updateByExampleSelective(@Param("record") Studentselectcourse record, @Param("example") StudentselectcourseExample example);

    int updateByExample(@Param("record") Studentselectcourse record, @Param("example") StudentselectcourseExample example);

    int updateByPrimaryKeySelective(Studentselectcourse record);

    int updateByPrimaryKey(Studentselectcourse record);
}