package com.school.web;

import com.alibaba.fastjson.JSON;
import com.school.jopo.Student;
import com.school.service.StudentService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "selectStudents", value = "/selectStudents")
public class selectStudents extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StudentService studentService = new StudentService();
        String page = request.getParameter("pageNum");
        int pageNum = Integer.parseInt(page);
        int PageStart = (pageNum-1)*10;
        int PageEnd = 10;
        List<Student> students = studentService.selectPage(PageStart, PageEnd);
        String JsonStr = JSON.toJSONString(students);
        response.setCharacterEncoding("utf-8");
        response.addHeader("access-control-allow-origin", "*");
        response.setContentType("text/json;");
        PrintWriter writer = response.getWriter();
        writer.write(JsonStr);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
