package servlets;
import main.java.config.DataBaseConnection;
import config.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/users")
public class UserServlet extends HttpServlet {
    DataBaseConnection d=new DataBaseConnection();
    public  void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
    {
        String s[];
        System.out.println("e in doget");
        s=req.getQueryString().split("&");
       //System.out.println(req.getReader().read());
//        System.out.println(s[0]);
//        System.out.println(s[1]);
        String e=s[0].split("=")[1].split("%40")[0]+"@"+s[0].split("=")[1].split("%40")[1];
        User use= d.findUserbyName(e,s[1].split("=")[1]);
//        Map<String, Object> map=new HashMap<>();
//        map.put("Id: ",user.getId_user());
//        map.put("Name: ",user.getName());
//        map.put("Prenume: ",user.getPrenume());
//        System.out.println(user);
//        resp.getWriter().println(user);
        req.setAttribute("text",use.getName()+"&"+use.getPrenume());
        req.getRequestDispatcher("paginaUser.jsp").forward(req,resp);

    }

    public  void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
    {
        System.out.println("e in doPost");
        HttpSession session = req.getSession();
        System.out.println(req.getQueryString());
        String a=req.getReader().readLine();
        System.out.println(a);
        String s[]=a.split("&");
        System.out.println(s[0]+s[1]);
        String e=s[0].split("&")[0].split("=")[1].split("%40")[0]+"@"+s[0].split("=")[1].split("%40")[1];
        System.out.println(e);
        session.setAttribute("email",e);
        session.setAttribute("pass",s[1].split("=")[1]);
        User use= d.findUserbyName(e,s[1].split("=")[1]);
        session.setAttribute("id",use.getId_user());
        req.setAttribute("id",use.getId_user());
        req.getRequestDispatcher("paginaUser.jsp").forward(req,resp);
    }

//    public  void doPost(HttpServletRequest req, HttpServletResponse resp)
//            throws ServletException, IOException
//    {
//        System.out.println("e in doPost");
//        User u=new User();
//        //u.setId_user(1);
//        u.setName(req.getReader().readLine().split("=")[1]);
//        u.setPrenume(req.getReader().readLine().split("=")[1]);
//        u.setEmail(req.getReader().readLine().split("=")[1]);
//        u.setParola(req.getReader().readLine().split("=")[1]);
//        String s;
//        s=req.getReader().readLine().split("=")[1];
////        int an,luna,zi;
////                an=Integer.parseInt(s.split("/")[0]);
////                luna=Integer.parseInt(s.split("/")[1]);
////                zi=Integer.parseInt(s.split("/")[2]);
////        System.out.println(an+" "+luna+" "+zi);
////        Date data=new Date(an,luna,zi);
////        System.out.println(Date.valueOf(s));
//        u.setData_nasterii(Date.valueOf(s));
//        d.addUser(u);
//        System.out.println(u);
//        resp.getWriter().println(u);
//    }


}
