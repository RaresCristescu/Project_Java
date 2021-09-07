package main.java.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/test")

public class testServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        System.out.println("a mers");
//        System.out.println("S-a fauct request");
//        resp.setHeader("rasp unsul","Buna si tie");
//        resp.getWriter().println(req.getQueryString()+", o sa vedem daca merge");
       // req.getRequestDispatcher("/test.jsp").forward(req,resp);
    req.getRequestDispatcher("speranta.jsp").forward(req,resp);
    }

}
