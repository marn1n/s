package website.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import website.dao.UserDAO;
import website.entity.User;
import website.service.UserService;

@Controller
public class MainController {
    @GetMapping("/")
    public String home(){
        return "index";
    }
    @GetMapping("/success")
    public String success(){
        return "redirect:/";
    }
    @GetMapping("loginMe")
    public String login(){
        return "loginMe";
    }
    @PostMapping("asd")
    public String loginSuccess(){
        return "redirect:/";
    }
    @Autowired
    private UserService userService;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @PostMapping("saveMe")
    public String save(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userService.save(user);
        return "redirect:/";

    }
    @GetMapping("/rest")
    public String rest(){
        return "rest";
    }


}
