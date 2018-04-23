package gcy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by min on 2018/4/19.
 */
@Controller
@RequestMapping("error")
public class HelloController {

    @RequestMapping("/info")
    public String hello(Model model){
        model.addAttribute("aaa","4444444");
        return "error";
    }
}
