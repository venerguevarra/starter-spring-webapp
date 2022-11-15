package com.bootcamp.web.contoller;

import java.text.SimpleDateFormat;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bootcamp.web.bean.StudentForm;
import com.bootcamp.web.entity.User;
import com.bootcamp.web.service.UserRegistrationService;

@Controller
@RequestMapping("/student/form")
public class StudentController {
    @Autowired
    private UserRegistrationService userRegistrationService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView showForm() {
        return new ModelAndView("studentForm", "studentForm", new StudentForm());
    }

    @RequestMapping(method = RequestMethod.POST)
    public String submitForm(@Valid @ModelAttribute("studentForm") StudentForm studentForm, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "studentForm";
        }
        model.addAttribute("firstName", studentForm.getFirstName());
        model.addAttribute("lastName", studentForm.getLastName());
        model.addAttribute("age", studentForm.getAge());
        model.addAttribute("gradeLevel", studentForm.getGradeLevel());
        model.addAttribute("email", studentForm.getEmail());

        SimpleDateFormat dateFormatter = new SimpleDateFormat("MM/dd/yyyy");
        model.addAttribute("birthDate", dateFormatter.format(studentForm.getBirthDate()));

        User user = new User();
        user.setFirstName(studentForm.getFirstName());
        user.setLastName(studentForm.getLastName());
        user.setEmail(studentForm.getEmail());

        try {
            userRegistrationService.register(user);
        } catch (Exception e) {
            model.addAttribute("emailAddressTakenError", "Email address already taken");
            return "studentForm";
        }

        return "studentSuccess";
    }

}
