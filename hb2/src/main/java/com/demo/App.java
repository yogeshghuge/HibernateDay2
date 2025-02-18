package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Employee;

public class App 
{
    public static void main( String[] args )
    {
        Configuration con=new Configuration().configure();
        SessionFactory sf= con.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx= session.beginTransaction();
        
        /*e.setEname("Ram Yadhav"); //insert operation
        e.setEcompany("IFFC");
        e.setEdesignation(" web developer");
        e.setEsalary(90000);
        session.save(e)*/
        
       /* e.setEid(5); delete method 
        session.delete(e);*/
        
       /*Employee e= session.get(Employee.class, 5); //get method 
       System.out.println(e);*/
        
       /* Employee e=session.load(Employee.class, 5); // load method
        System.out.println(e);*/
        
        Employee e= new Employee();
        e.setEid(7);
        e.setEdesignation(".NET Developer");
        session.update(e);
        System.out.println(e);
        
        tx.commit();
        session.close();      
    }
}
