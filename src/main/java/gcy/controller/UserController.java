package gcy.controller;

import gcy.model.User;
import gcy.service.UserService;
import gcy.service.imp.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by min on 2018/4/20.
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/addUser")
    public String insertInfo(Model model){

        User user=new User();
        user.setName("小明");
        user.setAge(16);
        user.setSex("男");
        user.setPhone("13501267714");
        int y=userService.insertUser(user);
        System.out.println("y :"+y);
        return "";
    }
}
