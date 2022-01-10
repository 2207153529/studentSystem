package com.school.web;

import com.alibaba.fastjson.JSON;
import com.school.jopo.StudentAvg;
import com.school.service.StudentAvgService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "selectMajor", value = "/selectMajor")
public class SelectMajor extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StudentAvgService studentAvgService = new StudentAvgService();
        List<StudentAvg> studentAvgs = studentAvgService.selectAll();
        String studentJson = JSON.toJSONString(studentAvgs);
        response.setCharacterEncoding("utf-8");
        response.addHeader("access-control-allow-origin", "*");
        response.setContentType("text/json;");
        PrintWriter writer = response.getWriter();
        writer.write(studentJson);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
