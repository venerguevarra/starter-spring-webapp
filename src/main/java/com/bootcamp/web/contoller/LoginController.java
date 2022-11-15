package com.bootcamp.web.contoller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bootcamp.web.bean.SearchCriteria;

@Controller
@RequestMapping("/login")
public class LoginController {

    @RequestMapping(method = RequestMethod.GET)
    public String showForm(HttpServletRequest request, HttpServletResponse response) {
        return "loginForm"; // loginForm -> tiles.xml
    }

    // RequestParam - Query String /login/show?catalog=value&price=value
    @RequestMapping(path = "/show", method = RequestMethod.GET)
    public String showForm2(@RequestParam("catalog") String catalog, @RequestParam("price") Float price, HttpServletRequest request) {
        request.setAttribute("catalogParameter", catalog);
        request.setAttribute("priceParameter", price);
        return "loginForm";
    }

    @RequestMapping(path = "/show-criteria", method = RequestMethod.GET)
    public String showCritera(SearchCriteria searchCriteria, HttpServletRequest request) {
        request.setAttribute("searchCriteria", searchCriteria);
        return "loginForm";
    }
    
    // PathParam /login/show-path/{username}
    @GetMapping(path = "/show-path/{username}")
    public String showPath(@PathVariable("username") String username, HttpServletRequest request) {
        request.setAttribute("usernamePathParameter", username);
        return "loginForm";
    }

    // @GetMapping
    // public String showForm2() {
    // return "loginForm";
    // }
}
