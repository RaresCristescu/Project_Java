package config;

import java.sql.Date;
public class User {
    private int id_user;
    private String Name;
    private String Prenume;
    private String Email;
    private String Parola;
    private Date Data_nasterii;
    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPrenume() {
        return Prenume;
    }

    public void setPrenume(String prenume) {
        Prenume = prenume;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Date getData_nasterii() {
        return Data_nasterii;
    }

    public void setData_nasterii(Date data_nasterii) {
        Data_nasterii = data_nasterii;
    }

    public String getParola() {
        return Parola;
    }

    public void setParola(String parola) {
        Parola = parola;
    }

    @Override
    public String toString() {
        return "\n" + '{'+
                "id_user='" + id_user + '\'' +
                ", Name='" + Name + '\'' +
                ", Prenume='" + Prenume + '\'' +
                ", Email='" + Email + '\'' +
                ", Parola='" + Parola + '\'' +
                ", Data_nasterii=" + Data_nasterii +
                '}';
    }
}
