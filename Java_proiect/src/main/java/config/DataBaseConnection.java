package main.java.config;

import config.User;

import java.sql.*;
import java.util.ArrayList;

public class DataBaseConnection {
    private static Connection connection;
    private static String url = "jdbc:mysql://localhost:3306/Java?autoReconnect=true&useSSL=false";
    private static String username = "root";
    private static String password = "";
    private static String ince= "select * from user";

    public DataBaseConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url,username, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void adaugareTaskNou(User utilizator, Task tabietura, Time ora, String Desc){
        try {
                PreparedStatement statement1 = connection.prepareStatement(Comenzi.insertTask);
                statement1.setInt(1, tabietura.getId_task());
                statement1.setString(2, tabietura.getNume());
                statement1.setString(3, tabietura.getDescriere());
                statement1.execute();
                PreparedStatement statement2 = connection.prepareStatement(Comenzi.insertActivity);
                statement2.setInt(1, utilizator.getId_user());
                statement2.setInt(2, tabietura.getId_task());
                statement2.setString(3, "null");
                statement2.setString(4, Desc);
                statement2.setTime(5, ora);
                statement2.setInt(6,0);
                statement2.execute();

        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void stergereActivitate( User utilizator,Task tabietura, Time ora){
        try {
            PreparedStatement statement = connection.prepareStatement(Comenzi.deleteActivitate);
            statement.setInt(1, utilizator.getId_user());
            statement.setInt(2, tabietura.getId_task());
            statement.setTime(3, ora);
            statement.execute();

        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void updateActivityCounter( User utilizator,Task tabietura, Time ora){
        int i;
        try {
            PreparedStatement statement = connection.prepareStatement(Comenzi.selectActivitySpecific);
            statement.setInt(1, utilizator.getId_user());
            statement.setInt(2, tabietura.getId_task());
            statement.setTime(3, ora);
            ResultSet r=statement.executeQuery();
            r.next();
            i=r.getInt("Zile_consecutive");
            i++;
            System.out.println(i);
            PreparedStatement statement1 = connection.prepareStatement(Comenzi.updateActivitateCounter);
            statement1.setInt(1,i);
            statement1.setInt(2, utilizator.getId_user());
            statement1.setInt(3, tabietura.getId_task());
            statement1.setTime(4,ora);
            statement1.executeUpdate();

        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public ArrayList<User> getUser() {

        try (PreparedStatement statement = connection.prepareStatement(Comenzi.selectUser)){

            ResultSet rs = statement.executeQuery();
            ArrayList<User> users = new ArrayList<>();
            while (rs.next()) {
                User u = new User();
                u.setId_user(rs.getInt("id_user"));
                u.setName(rs.getString("Nume"));
                u.setPrenume(rs.getString("Prenume"));
                u.setEmail(rs.getString("Email"));
                u.setParola(rs.getString("Parola"));
                u.setData_nasterii(rs.getDate("Data_nasterii"));
                users.add(u);
            }
            rs.close();
            return users;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static User findUserbyName(String s1,String s2) {

        try (PreparedStatement statement = connection.prepareStatement(Comenzi.findUserbyName)){


            User u = new User();
            statement.setString(1, s1);
            statement.setString(2, s2);
            ResultSet rs = statement.executeQuery();
            if(rs.next()) {
                u.setId_user(rs.getInt("id_user"));
                u.setName(rs.getString("Nume"));
                u.setPrenume(rs.getString("Prenume"));
                u.setEmail(rs.getString("Email"));
                u.setParola(rs.getString("Parola"));
                u.setData_nasterii(rs.getDate("Data_nasterii"));
                rs.close();
                return u;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static User findUser(int s) {

        try (PreparedStatement statement = connection.prepareStatement(Comenzi.findUser)){


                User u = new User();
                statement.setInt(1, s);
                ResultSet rs = statement.executeQuery();
            if(rs.next()) {
                u.setId_user(rs.getInt("id_user"));
                u.setName(rs.getString("Nume"));
                u.setPrenume(rs.getString("Prenume"));
                u.setEmail(rs.getString("Email"));
                u.setParola(rs.getString("Parola"));
                u.setData_nasterii(rs.getDate("Data_nasterii"));
                rs.close();
                return u;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public ArrayList<Task> getTask() {

        try (PreparedStatement statement = connection.prepareStatement(Comenzi.selectTask)){

            ResultSet rs = statement.executeQuery();
            ArrayList<Task> Tasks = new ArrayList<>();
            while (rs.next()) {
                Task u = new Task();
                u.setId_task(rs.getInt("id_task"));
                u.setNume(rs.getString("Nume"));
                u.setDescriere(rs.getString("Descriere"));
                Tasks.add(u);
            }
            rs.close();
            return Tasks;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public ArrayList<Badge> getBadge() {

        try (PreparedStatement statement = connection.prepareStatement(Comenzi.selectBadge)){

            ResultSet rs = statement.executeQuery();
            ArrayList<Badge> badges = new ArrayList<>();
            while (rs.next()) {
                Badge u = new Badge();
                u.setId_badge(rs.getInt("id_badge"));
                u.setNume(rs.getString("Nume"));
                u.setDescriere(rs.getString("Descriere"));
                badges.add(u);
            }
            rs.close();
            return badges;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public void addUser(User user) {

        try (PreparedStatement statement = connection.prepareStatement(Comenzi.insertUser)){


//            statement.setInt(1, user.getId_user());
            statement.setString(1, user.getName());
            statement.setString(2, user.getPrenume());
            statement.setString(3, user.getEmail());
            statement.setString(4, user.getParola());
            statement.setDate(5, user.getData_nasterii());
            boolean r=statement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
//    public static void main(String[] args) {

//        Task t=new Task();
//        User u=new User();
//        new DataBaseConnection();
//        try {
//            PreparedStatement statement = connection.prepareStatement(Comenzi.selectUser);
//            ResultSet rs = statement.executeQuery();
//            rs.next();
//            u.setId_user(rs.getString("id_user"));
//            u.setName(rs.getString("Nume"));
//            u.setPrenume(rs.getString("Prenume"));
//            u.setEmail(rs.getString("Email"));
//            u.setParola(rs.getString("Parola"));
//            u.setData_nasterii(rs.getDate("Data_nasterii"));
//            rs.close();
//        }
//        catch (SQLException e) {
//            e.printStackTrace();
//       }


//        try {
//                new DataBaseConnection();
//                PreparedStatement statement = connection.prepareStatement(Comenzi.insertTask);
//                statement.setString(1, "T9");
//                statement.setString(2, "Spalat pe dinti");
//                statement.setString(3, "Aplicarea unei igiene adecvate la o ora anume");
//                statement.execute();
//
//
//        }
//
//        catch (SQLException e) {
//            e.printStackTrace();
//        }

//        try {
//            new DataBaseConnection();
////            PreparedStatement statement1 = connection.prepareStatement(Comenzi.selectActivity);
////            ResultSet rs = statement1.executeQuery();
//           java.sql.Time t=new Time(8,0,0);
//            PreparedStatement statement = connection.prepareStatement(Comenzi.updateActivitateCounter);
//            statement.setInt(1, 2);
//            statement.setString(2, "U1");
//            statement.setString(3, "T3");
//            statement.setTime(4,t);
//            statement.executeUpdate();
//        }
//
//        catch (SQLException e) {
//            e.printStackTrace();
//        }

//        try {
//            new DataBaseConnection();
//            PreparedStatement statement = connection.prepareStatement(Comenzi.selectTask);
//            ResultSet rs = statement.executeQuery();
//
//            while (rs.next())
//            {
//                System.out.println(rs.getString("id_task") + " "+ rs.getString("Nume")+ " "+ rs.getString("Descriere"));
//            }
//            rs.close();
//
//        }
//
//        catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    public void close(){
//        try {
//            connection.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }



//    }

}

