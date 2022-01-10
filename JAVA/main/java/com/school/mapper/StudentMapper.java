package com.school.mapper;

import com.school.jopo.Student;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentMapper {
    @Select("select * from school_student limit #{PageStart}, #{PageEnd};")
    List<Student> selectPage(@Param("PageStart") int PageStart, @Param("PageEnd") int PageEnd);
}
