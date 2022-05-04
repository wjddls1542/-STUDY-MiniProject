package com.study.board.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class User {

    @Id
    private String userid;

    private String nickname;

    private String password;

}
