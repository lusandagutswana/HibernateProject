package io.conduktor.demos;

import jakarta.persistence.Entity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.xml.stream.events.StartDocument;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.seteNum(12);
        e1.seteOrg("IT Business Systems");
        e1.seteSurname("Matlou");
        e1.seteName("Windy");

//        Student s1 = new Student();
//        s1.setsName("Aletta");
//        s1.setAge(30);
//        s1.setRollNo(130);
//        s1.setsSurname("Simma");

        //Student s2 = null;


//        Configuration cfg = new Configuration();
//        cfg.addAnnotatedClass(io.conduktor.demos.Student.class);
//        cfg.configure();

        SessionFactory sf = new Configuration().addAnnotatedClass(io.conduktor.demos.Employee.class)
                .configure().buildSessionFactory();//cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
       // s2 = session.get(Student.class, 11);
        session.persist(e1);


        transaction.commit();
        session.close();
        sf.close();
        //System.out.println(s2);


    }
}