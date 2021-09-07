package main.java.config;

public class Punct implements Comparable<Punct>{

    private Integer x;
    private Integer y;
    Punct()
    {
        x=0;
        y=0;
    }
    Punct(int a, int b)
    {
        x=a;
        y=b;
    }


    @Override
    public String toString() {
        return "Punct{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    @Override
    public int compareTo(Punct o)
    {
        if(this.x==o.x) return this.y-o.y;
        return this.x-o.getX();
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }



}
