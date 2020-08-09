package com.sungwook.caculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CaculatorController {

    @GetMapping("Add")
    public String Add(@RequestParam("arg1")long arg1, @RequestParam("arg2")long arg2, Model model){
        long result = arg1 + arg2;
        model.addAttribute("result", result);

        return "index.html";
    }

    @GetMapping("Multiply")
    public String Multiply(@RequestParam(name="arg1")String arg1, @RequestParam(name="arg2")String arg2, Model model){
        int result = Integer.parseInt(arg1) * Integer.parseInt(arg2);
        model.addAttribute("result", result);

        return "index.html";
    }
}
