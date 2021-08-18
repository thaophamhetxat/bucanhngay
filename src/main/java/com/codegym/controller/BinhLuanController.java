package com.codegym.controller;

import modules.BinhLuan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import service.BinhLuanService;

import java.io.File;
import java.io.IOException;

@Controller
public class BinhLuanController {
    @Autowired
    BinhLuanService binhLuanService;


    @RequestMapping("/home")
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView("home");
        binhLuanService.findAll();
        modelAndView.addObject("list",binhLuanService.list);
        return modelAndView;
    }

    @GetMapping("/commit")
    public ModelAndView commit() {
        ModelAndView modelAndView = new ModelAndView("commit");
        modelAndView.addObject("list", new BinhLuan());
        return modelAndView;
    }

    @PostMapping("/commit")
    public String create(@ModelAttribute BinhLuan binhLuan) {
        binhLuanService.save(binhLuan);
        return "redirect:/home";
    }
}
