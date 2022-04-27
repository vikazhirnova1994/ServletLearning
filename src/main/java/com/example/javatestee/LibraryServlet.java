package com.example.javatestee;

import org.postgresql.Driver;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet(name = "LibraryServlet", value = "/library")
public class LibraryServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        try {
            //подключение драйвера postgresql к java приложению
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            //обработка ошибки (не загружена библиотека)
            e.printStackTrace();
        }
        try {
            //открыть подключение к БД: протокол_подкл_к_СУБД://ip_host:port_app_postgres/database
            Connection conn = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/book_java_ee_db",
                    "postgres", "2104V");
            //создание объекта для создания SQL-запроса
            Statement statement = conn.createStatement();
            //выполенение SQL-запроса (получить названия книг), сохранение результата в ResultSet (похож на итератор)
            ResultSet resultSet = statement.executeQuery("SELECT titlle from books");
            //
            while (resultSet.next()){
                writer.println(resultSet.getString("titlle"));
            }
            //закрытие подключение к БД
            statement.close();

        } catch (SQLException e) {
            //обработка ошибки (указанная БД не существует)
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
