package com.berg.spittr.web;

import com.berg.spittr.data.SpittleRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/spittles")
public class SpittleController {

    @Autowired
    private SpittleRespository spittleRespository;

    @RequestMapping(method = RequestMethod.GET)
    public String spittles(Model model){

        model.addAttribute("spittles", spittleRespository.findSpittles(Long.MAX_VALUE, 20));

        return "spittles";
    }
}
