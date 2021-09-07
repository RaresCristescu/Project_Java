package main.java.config;

import java.sql.Date;
import java.sql.Time;
public class Achivement {
    private int id_user;
    private int id_task;
    private int id_badge;
    private Date data;
    private Time ora;

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

    public int getId_badge() {
        return id_badge;
    }

    public void setId_badge(int id_badge) {
        this.id_badge = id_badge;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Time getOra() {
        return ora;
    }

    public void setOra(Time ora) {
        this.ora = ora;
    }




}
