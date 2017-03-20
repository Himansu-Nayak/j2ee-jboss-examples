package com.org.hibernate;

import com.org.hibernate.dto.EmployeeEntity;

import com.org.hibernate.util.HibernateUtil;
import org.hibernate.Session;

public class HibernateClient {

    public static void main(String... args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        //Add new Employee object
        EmployeeEntity emp = new EmployeeEntity();
        emp.setEmail("himansu.nayak@gmail.com");
        emp.setFirstName("Himansu");
        emp.setLastName("Nayak");

        session.save(emp);

        session.getTransaction().commit();
        HibernateUtil.shutdown();
    }

}
