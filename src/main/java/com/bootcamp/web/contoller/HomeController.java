package com.bootcamp.web.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bootcamp.web.entity.UserProfile;
import com.bootcamp.web.repository.UserProfileRepository;

@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private UserProfileRepository userProfileRepository;
    
    @RequestMapping(method = RequestMethod.GET)
    public String home(ModelMap model) {
        UserProfile userProfile = new UserProfile("John", "Doe");
        userProfileRepository.save(userProfile);
        return "home";
    }

}
