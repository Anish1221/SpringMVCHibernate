/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.springhibernate.controller;

import com.example.springhibernate.dao.CourseDAO;
import com.example.springhibernate.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author acer
 */
@Controller
@RequestMapping(value = "/")
public class DefaultController {

    @Autowired
    private CourseDAO courseDAO;

    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap map) {
        map.addAttribute("courses", courseDAO.getAll());
        return "/admin/course/index";
    }

    @RequestMapping(value="/add",method = RequestMethod.GET)
    public String add() {       
        return "/admin/course/add";
    }
    
    @RequestMapping(value="/save",method = RequestMethod.POST)
    public String save(Course c) {
        courseDAO.insert(c);
        return "redirect:/";
    }
    
    @RequestMapping(value="/delete/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable("id") int id) {
        courseDAO.delete(id);
        return "redirect:/";
    }
    
    @RequestMapping(value="/detail/{id}", method = RequestMethod.GET)
    public String detail(@PathVariable("id") int id, ModelMap map) {
        
        map.addAttribute("course", courseDAO.getById(id));
        return "/admin/course/detail";
    }
}
