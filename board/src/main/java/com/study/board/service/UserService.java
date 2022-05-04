package com.study.board.service;

import com.study.board.entity.User;
import com.study.board.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void UserJoin(User user){
        userRepository.save(user);
    }
    public User loginUser(String userid,String password){
        User user=userRepository.selectUserInfo(userid, password);

        return user;
    }


}
