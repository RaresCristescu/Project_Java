package main.java.config;

import java.sql.Time;
public class Activity {
    private int id_user;
    private int id_task;
    private String status;
    private String Descriere;
    private Time ora;
    private int zile_consecutive;

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public int getId_task() {
        return id_task;
    }

    public void setId_task(int id_task) {
        this.id_task = id_task;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescriere() {
        return Descriere;
    }

    public Time getOra() {
        return ora;
    }

    public void setOra(Time ora) {
        this.ora = ora;
    }

    public void setDescriere(String descriere) {
        Descriere = descriere;
    }

    public int getZile_consecutive() {
        return zile_consecutive;
    }

    public void setZile_consecutive(int zile_consecutive) {
        this.zile_consecutive = zile_consecutive;
    }
}
