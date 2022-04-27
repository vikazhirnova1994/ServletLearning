package com.example.javatestee;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "getCookiesServlet", value = "/getCookiesServlet")
public class GetCookiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       Cookie[] cookies = request.getCookies();
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        for (Cookie cookie: cookies) {
            writer.println("<h1>" + cookie.getName() + ": " + cookie.getValue() +"</h1>");
        }
        writer.println("</html>");
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
