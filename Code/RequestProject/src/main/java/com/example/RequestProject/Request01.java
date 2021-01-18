package com.example.RequestProject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Request01" , urlPatterns = "/Request01")
public class Request01 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String referer  = request.getHeader("referer");
        System.out.println("referer : "+ referer);

        response.setContentType("text/html;charset=UTF-8");

        if (referer != null){
            if (referer.contains("/RequestProject_war_exploded")){
                    response.getWriter().write("可以观看电影");
            }else  {
                response.getWriter().write("不可以直接观看， 请到优酷 爱奇艺官网查看");
            }
        }else {
            response.getWriter().write("请先访问网站主页  登录后查看");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
