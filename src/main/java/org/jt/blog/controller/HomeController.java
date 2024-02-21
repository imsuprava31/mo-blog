package org.jt.blog.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/*
 * @Author Suprava Parida
 * Created on 27/01/2024
 */

@Controller
public class HomeController {


    /*
     * This method is redirect to homepage
     */
    @GetMapping({"/homePage","/"})
    public String homePage(Model model){
        return "HomePage";
    }
    
}
