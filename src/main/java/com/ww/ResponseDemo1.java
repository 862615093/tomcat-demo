package com.ww;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/resp1")
public class ResponseDemo1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("resp1....");
        //response重定向
//        //1.设置响应状态码 302
//        response.setStatus(302);
//        //2. 设置响应头 Location
//        response.setHeader("Location","/tomcat-demo/resp2");

        //response重定向简化后
        //特点： 1.浏览器地址栏路径发送变化   2.可以重定向到任何位置的资源(服务内容、外部均可)  3.两次请求，不能在多个资源使用request共享数据
        response.sendRedirect("/tomcat-demo/resp2");
//        response.sendRedirect("http://localhost:8080/tomcat-demo2/resp2");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

}
