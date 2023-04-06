package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/tasks")

public class Tasks extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        out.print("<a href='/task1_1'><h1>TASK 1.1</h1></a>");
        out.print("<a href='/task1_2'><h1>TASK 1.2</h1></a>");
        out.print("<a href='/task1_3'><h1>TASK 1.3</h1></a>");
        out.print("<a href='/task1_4'><h1>TASK 1.4</h1></a>");
        out.print("<a href='/task1_5'><h1>TASK 1.5</h1></a>");
        out.print("<a href='/task1_6'><h1>TASK 1.6</h1></a>");
        out.print("<a href='/task1_7'><h1>TASK 1.7</h1></a>");
    }
}
