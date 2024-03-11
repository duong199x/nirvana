package com.wangyuan.game.nirvana.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String account;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String mail;
    @Column(nullable = false)
    private String phone;
    @Column(nullable = false)
    private double money;
    @Column(nullable = false)
    private boolean permission;
    @Column(nullable = false)
    private String login_type;
    @Column(nullable = false)
    private int status;
    @Column(nullable = false)
    private int created_at;
    @Column(nullable = false)
    private int updated_at;
}
