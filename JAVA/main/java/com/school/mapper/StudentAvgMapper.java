package com.school.mapper;

import com.school.jopo.StudentAvg;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentAvgMapper {
//    @Select("select * from student_avg;")
    List<StudentAvg> selectPageSum(@Param("College") String College,  @Param("Major") String Major);
    @Select("select  * from student_avg limit #{PageStart}, #{PageEnd};")
    List<StudentAvg> selectPage(@Param("PageStart") int PageStart,@Param("PageEnd") int PageEnd);

    @Select("select * from student_avg;")
    List<StudentAvg> selectAll();
//    @Select("select * from student_avg where college=#{College} and major like #{Major} limit #{PageStart}, #{PageEnd};")
    List<StudentAvg> selectInfo(@Param("College") String College,  @Param("Major") String Major, @Param("PageStart") int PageStart,@Param("PageEnd") int PageEnd);
}
