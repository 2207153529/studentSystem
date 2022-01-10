package com.school.service;

import com.school.jopo.StudentAvg;
import com.school.mapper.StudentAvgMapper;
import com.school.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;


public class StudentAvgService{

    public List<StudentAvg> selectPageSum(String major, String college) {
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        StudentAvgMapper mapper = sqlSession.getMapper(StudentAvgMapper.class);
        List<StudentAvg> studentAvgs = mapper.selectPageSum(major, college);
        sqlSession.close();
        return studentAvgs;
    }


    public List<StudentAvg> selectPageInfo(String college, String major, int PageStart, int PageEnd){
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        StudentAvgMapper mapper = sqlSession.getMapper(StudentAvgMapper.class);
        List<StudentAvg> studentAvgs = mapper.selectInfo(college, major ,PageStart, PageEnd);
        return studentAvgs;
    }

    public List<StudentAvg> selectAll(){
        SqlSessionFactory sqlSessionFactoryUtils = SqlSessionFactoryUtils.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactoryUtils.openSession();
        StudentAvgMapper mapper = sqlSession.getMapper(StudentAvgMapper.class);
        List<StudentAvg> studentAvgs = mapper.selectAll();
        return studentAvgs;
    }
}
