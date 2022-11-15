package com.bootcamp.web.contoller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bootcamp.web.bean.PostForm;
import com.bootcamp.web.service.UserPostService;

@Controller
@RequestMapping("/posts")
public class PostController {
    @Autowired
    private UserPostService userPostService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView showForm(ModelMap modelMap) {
        modelMap.addAttribute("postForm", new PostForm());
        modelMap.addAttribute("posts", userPostService.getAllPosts());
        return new ModelAndView("postForm");
    }

    @RequestMapping(method = RequestMethod.POST)
    public String submitForm(@Valid @ModelAttribute("postForm") PostForm postForm, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "postForm";
        }
        try {
            userPostService.newPost(postForm.getUserId(), postForm.getTitle());
        } catch (Exception e) {
            model.addAttribute("userError", e.getMessage());
            return "postForm";

        }
        return "redirect:posts";
    }

}
