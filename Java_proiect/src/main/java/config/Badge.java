package main.java.config;

public class Badge {
    private int id_badge;
    private String Nume;
    private String Descriere;

    public int getId_badge() {
        return id_badge;
    }

    public void setId_badge(int id_badge) {
        this.id_badge = id_badge;
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
                "id_badge='" + id_badge + '\'' +
                ", Nume='" + Nume + '\'' +
                ", Descriere='" + Descriere + '\'' +
                '}';
    }
}
