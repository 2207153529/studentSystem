package com.school.web;

import com.alibaba.fastjson.JSON;
import com.school.jopo.StudentAvg;
import com.school.service.StudentAvgService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.List;

@WebServlet(name = "selectPageSum", value = "/selectPageSum")
public class selectAll extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StudentAvgService studentAvgService = new StudentAvgService();
        String college = new String(request.getParameter("college").getBytes(StandardCharsets.ISO_8859_1), "UTF-8");
        String major = new String(request.getParameter("major").getBytes("ISO8859-1"), "UTF-8");
        List<StudentAvg> studentAvgs = studentAvgService.selectPageSum(college,major);
        String jsonString1 = JSON.toJSONString(studentAvgs);
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/json;");
        response.addHeader("access-control-allow-origin", "*");
        PrintWriter writer = response.getWriter();
        writer.write(jsonString1);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
