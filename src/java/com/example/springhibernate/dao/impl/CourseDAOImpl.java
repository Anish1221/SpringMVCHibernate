/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.springhibernate.dao.impl;

import com.example.springhibernate.dao.CourseDAO;
import com.example.springhibernate.entity.Course;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author acer
 */
@Repository(value = "courseDAO")
public class CourseDAOImpl implements CourseDAO {

    @Autowired
    private SessionFactory sessionFactory;
    private Session session;
    private Transaction trans;

    @Override
    public void insert(Course c) {
        session = sessionFactory.openSession();
        trans = session.beginTransaction();
        session.save(c);
        trans.commit();
        session.close();
    }

    @Override
    public List<Course> getAll() {
        session = sessionFactory.openSession();
        List<Course> courseList = session.createQuery("SELECT c FROM Course c").list();
        session.close();
        return courseList;
    }

    @Override
    public void delete(int id) {
        Course course = getById(id);
        if (course != null) {
            session = sessionFactory.openSession();
            trans = session.beginTransaction();
            session.delete(course);
            trans.commit();
            session.close();
        }else{
            System.out.println("Course is Null Delete Failed");
        }
    }

    @Override
    public Course getById(int id) {
        Course course = null;
        session = sessionFactory.openSession();
        course = (Course) session.get(Course.class, id);
        session.close();
        return course;
    }

}
