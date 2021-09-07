package main.java.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
@WebServlet("/login")
public class login extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        req.getRequestDispatcher("login.jsp").include(req,resp);
//        HttpSession session = req.getSession(true);
//        System.out.println(req.getQueryString());
//        session.setAttribute("email",req.getQueryString());

        req.getRequestDispatcher("login.jsp").forward(req,resp);

    }
}