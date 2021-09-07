package main.java.config;

public class Task {
    private int id_task;
    private String Nume;
    private String Descriere;

    public int getId_task() {
        return id_task;
    }

    public void setId_task(int id_task) {
        this.id_task = id_task;
    }

    public String getNume() {
        return Nume;
    }

    public void setNume(String nume) {
        Nume = nume;
    }

    public String getDescriere() {
        return Descriere;
    }

    public void setDescriere(String descriere) {
        Descriere = descriere;
    }

    @Override
    public String toString() {
        return "\n{" +
                "id_task='" + id_task + '\'' +
                ", Nume='" + Nume + '\'' +
                ", Descriere='" + Descriere + '\'' +
                '}';
    }
}
