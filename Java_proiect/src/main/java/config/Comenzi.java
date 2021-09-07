package main.java.config;
public interface Comenzi {
    public static final String findUser ="select * from user where id_user = ?";
    public static final String findUserbyName ="select * from user where Email = ? and Parola = ?";
    public static final String selectUser ="select * from user";
    public static final String selectTask ="select * from task";
    public static final String selectBadge ="select * from badge";
    public static final String selectActivity ="select * from activity";
    public static final String selectActivitySpecific ="select * from activity where id_user= ? and id_task= ? and Ora= ?";
    public static final String selectAchivement ="select * from achivement";
    public static final String insertUser = "INSERT INTO user (Nume,Prenume,Email,Parola,Data_nasterii) VALUES (?,?,?,?,?)";
    public static final String insertTask = "INSERT INTO task VALUES (?,?,?)";
    public static final String insertBadge = "INSERT INTO badge VALUES (?,?,?)";
    public static final String insertActivity = "INSERT INTO activity VALUES (?,?,?,?,?,?)";
    public static final String insertAchivement = "INSERT INTO achivement VALUES (?,?,?,?,?)";
    public static final String updateActivitateCounter = "UPDATE activity SET Zile_consecutive = ? WHERE id_user = ? and id_task= ? and ora = ?";
    public static final String updateActivitateStatus = "UPDATE activity SET Status = ? WHERE id_user = ? and id_task=? and ora =?";
    public static final String deleteActivitate = "DELETE FROM activity WHERE id_user = ? and id_task = ? and ora = ?";
}
