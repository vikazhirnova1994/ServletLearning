package com.example.javatestee;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(name = "myFirstServlet", value = "/myFirstServlet")
public class MyFirstServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        PrintWriter writer = response.getWriter(); //из ответа получаем PrintWriter
        writer.println("<html><body>"); //PrintWriter помещаем сообщения, отпр в качетве ответа
        writer.println("<h2> Adding value of name in the url!</h2>" + name);
        writer.println("<h2> Name: </h2>" + name);
        writer.println("</body></html>");
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
