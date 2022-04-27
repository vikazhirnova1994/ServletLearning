package com.example.javatestee;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "deleteCookiesServlet", value = "/deleteCookiesServlet")
public class DeleteCookiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*Cookie cookie  = new Cookie("some_id", "");
        cookie.setMaxAge(0);
        response.addCookie(cookie);*/
        //cookie.setMaxAge(-1) - будут удалены по закрытию

        Cookie[] cookies = request.getCookies();
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>  Deleting:" +"</h1>");
        for (Cookie cookie: cookies) {
            writer.println(cookie.getName() + ": " + cookie.getValue());
            cookie.setMaxAge(0);
            response.addCookie(cookie);
        }
        writer.println("</html>");
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
