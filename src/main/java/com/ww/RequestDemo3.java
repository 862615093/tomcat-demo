package com.ww;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/req3")
public class RequestDemo3 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("demo3...");
        //存储数据
        request.setAttribute("msg","hello");
        //request请求转发
        // 特点： 1.资源间共享  2.浏览器地址栏路径不发生变化 3.只能转发到当前服务器的内部资源
        request.getRequestDispatcher("/req4").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

}
