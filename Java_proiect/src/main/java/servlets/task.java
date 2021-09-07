package main.java.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
@WebServlet("/taskUser")
public class task extends HttpServlet {
    main.java.config.DataBaseConnection d=new main.java.config.DataBaseConnection();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("esti in task");
        String a=req.getReader().readLine();
        System.out.println(a);




        req.getRequestDispatcher("taskUseri.jsp").forward(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("esti in task");
        HttpSession ses= req.getSession();
        String str=ses.getAttribute("id").toString();
        String str2=ses.getAttribute("email").toString();
        System.out.println(str+" "+str2);
       // String a=req.getParameter("id");
        //System.out.println(a);




        req.getRequestDispatcher("taskUseri.jsp").forward(req,resp);
    }
}
