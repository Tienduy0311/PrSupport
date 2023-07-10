package com.company.base.controller;

import com.company.base.model.BranchModel;
import com.company.base.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private HomeService homeService;

    @GetMapping
    public ModelAndView home() {
        ModelAndView modeAndView = new ModelAndView("home");
        modeAndView.addObject("branch", new BranchModel());
        return modeAndView;
    }

    @PostMapping
    public String home(@ModelAttribute BranchModel branch) throws IOException {
        homeService.runCmd(branch);
        return "redirect:./home";
    }


}
