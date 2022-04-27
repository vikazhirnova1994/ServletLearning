package com.example.javatestee;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "setCookiesServlet", value = "/setCookiesServlet")
public class SetCookiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookie1  = new Cookie("some_id", "123");
        Cookie cookie2  = new Cookie("some_name", "Vika");
        cookie1.setMaxAge(24*60*60);
        cookie2.setMaxAge(24*60*60);
        response.addCookie(cookie1);
        response.addCookie(cookie2);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
