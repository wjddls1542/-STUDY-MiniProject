package com.study.board.controller;

import com.study.board.entity.Board;
import com.study.board.entity.User;
import com.study.board.repository.UserRepository;
import com.study.board.service.BoardService;
import com.study.board.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/join")
    public String join(){
        return "join";
    }

    @PostMapping("/join/joinpro")
    public String joinPro(User user, Model model){

        userService.UserJoin(user);
        model.addAttribute("notice", "회원 가입이 완료되었습니다.");
        model.addAttribute("searchUrl", "/join");

        return "notice";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping(value = "/login/loginpro",method = RequestMethod.POST)
    public String loginPro(User user, Model model){
        User user1 = userService.loginUser(user.getUserid(), user.getPassword());
       if(user1==null){
           model.addAttribute("notice","아이디 혹은 비밀번호가 없습니다.");
           model.addAttribute("searchUrl", "/login");
           return "notice";
       }
       model.addAttribute("nickName",user1.getNickname());
        return "boardwrite";
    }
}
