package cn.liuzc.myblog.controller;

import cn.liuzc.myblog.model.User;
import cn.liuzc.myblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @PostMapping("/register")
    public int register(User user){
        return userService.register(user);
    }

}
