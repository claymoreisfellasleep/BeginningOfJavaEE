package servlets;

import db.Task;
import db.DBManager;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;

@WebServlet(value = "/add-task") //add-book
public class AddTaskServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("task_name"); // name
        String deadline = request.getParameter("task_deadline"); //author
        String process = request.getParameter("task_process"); // price
        String details = request.getParameter("task_details"); //genre

        Task task = new Task();
        task.setName(name);
        task.setDeadline(deadline);
        task.setProcess(process);
        task.setDetails(details);

        DBManager.addTask(task);

        response.sendRedirect("/");

    }
}
