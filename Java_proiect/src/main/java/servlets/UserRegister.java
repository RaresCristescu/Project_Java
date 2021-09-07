package main.java.servlets;

import main.java.config.DataBaseConnection;
import config.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Date;

@WebServlet("/userRegister")
public class UserRegister extends HttpServlet {
    DataBaseConnection d=new DataBaseConnection();
    public  void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
    {
        HttpSession session = req.getSession();
        String s1[]=req.getReader().readLine().split("&");
        System.out.println(s1[0].split("=")[1]);
        User u=new User();
        u.setName(s1[0].split("=")[1]);
        u.setPrenume(s1[1].split("=")[1]);
        String e=s1[2].split("=")[1].split("%40")[0]+"@"+s1[2].split("=")[1].split("%40")[1];
        u.setEmail(e);
        u.setParola(s1[3].split("=")[1]);
        String s;
        s=s1[4].split("=")[1];
        u.setData_nasterii(Date.valueOf(s));
        System.out.println(u);
        d.addUser(u);
       // System.out.println(u);
        //resp.getWriter().println(u);

        session.setAttribute("id",u.getId_user());
        req.getRequestDispatcher("login.jsp").forward(req,resp);
    }
}
