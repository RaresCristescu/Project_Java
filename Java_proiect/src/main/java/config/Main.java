package config;

import config.User;
import main.java.config.DataBaseConnection;

import java.lang.*;

//class commp implements Comparator<Punct> {
//
//    public int compare(Punct p1, Punct p2)
//    {
//        if(p1.getX()-p2.getX()==0)return p1.getY()-p2.getY();
//        else return p1.getX()-p2.getX();
//    }
//}
public class Main {


//    public static void swap(Punct p1, Punct p2)
//    {
//        int a=p1.getX(),b=p1.getY();
//        p1.setX(p2.getX());
//        p1.setY(p2.getY());
//        p2.setX(a);
//        p2.setY(b);
//
//    }

////partea 2
//public static void main(String[] args) {
//    //comparable vs comparator
// ArrayList<Punct> puncte= new ArrayList<>();
// puncte.add(new Punct(2,4));
//    puncte.add(new Punct(6,2));
//    puncte.add(new Punct(2,9));
//    puncte.add(new Punct(13,5));
//    puncte.add(new Punct(5,10));
//    puncte.add(new Punct(6,7));
//    puncte.add(new Punct(1,7));
//    //puncte.sort();
//    //Collections.sort(puncte);
//    //Arrays.sort(puncte.toArray()); //ceva nu merge
//    //puncte.sort();
////    Comparable c= new Comparable() {
////        @Override
////        public int compareTo(Punct p) {
////            return 0;
////        }
////    };
//    Comparator comp1=new Comparator<Punct>() {
//        @Override
//        public int compare(Punct p1, Punct p2) {
//            if(p1.getX()==p2.getX()) return p1.getY()-p2.getY();
//            return p1.getX()-p2.getX();
//        }
//    };
//    Comparator comp2=new Comparator<Punct>() {
//        @Override
//        public int compare(Punct p1, Punct p2) {
//            if(p1.getY()==p2.getY()) return p1.getX()-p2.getX();
//            return p1.getY()-p2.getY();
//        }
//    };
//    puncte.sort(comp1);
//    System.out.println(puncte);
//    puncte.sort(comp2);
//    System.out.println(puncte);
//
//

//}

    public static void main(String[] args) {
        DataBaseConnection d=new DataBaseConnection();
//        ArrayList<User> as=d.getUser();
//        System.out.println(as);
////        ArrayList<Task> at=d.getTask();
////        ArrayList<Badge> as=d.getBadge();
//        Time t=new Time(12,0,0);
//        Date data=new java.sql.Date(1999,11,23);
////        Task taskul=new Task();
////        taskul.setId_task("T9");
////        taskul.setNume("Verificare");
////        taskul.setDescriere("Procesl de a verifica daca am facut bine o functie pentru update");
////        d.stergereActivitate(as.get(0),at.get(3),t);
////        d.updateActivityCounter(as.get(0),at.get(3),t);
////        d.adaugareTaskNou(as.get(5),taskul,t,"pozitiv");
//
//        System.out.println(as);
        String s;
        s="U3";
    User a=d.findUser(10);
        System.out.println(a);
    }
}