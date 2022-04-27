package com.example.javatestee;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet(name = "HeaderServlet", value = "/header")
public class HeaderServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       Enumeration<String> headerNames =  request.getHeaderNames();
       while (headerNames.hasMoreElements()) {
           String name = headerNames.nextElement();
           System.out.println(name + " = " + request.getHeader(name));
       }

        System.out.println("\n\nAuthType: " + request.getAuthType());
        System.out.println("Query: " + request.getQueryString());
        System.out.println("Method: " + request.getMethod());
        System.out.println("RequestURL: " + request.getRequestURL());
        System.out.println("ServletPath: " + request.getServletPath());
        System.out.println("DispatcherType: " + request.getDispatcherType());
        System.out.println("ContentType: " + request.getContentType());
        System.out.println("ContentLength: " + request.getContentLength());
        System.out.println("Protocol: " + request.getProtocol());

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
