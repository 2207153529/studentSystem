package com.school.service;

import com.school.jopo.Student;
import com.school.mapper.StudentMapper;
import com.school.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class StudentService {

    public List<Student> selectPage(int pageStart, int pageEnd){
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = mapper.selectPage(pageStart, pageEnd);
        sqlSession.close();
        return students;
    }
}
