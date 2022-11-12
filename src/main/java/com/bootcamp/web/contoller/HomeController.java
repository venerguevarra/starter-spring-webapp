package com.bootcamp.web.contoller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/home")
public class HomeController {
    @RequestMapping(method = RequestMethod.GET)
    public String home(ModelMap model, HttpServletRequest request) {
        model.addAttribute("message", "hello world");
        return "home";
    }

}
