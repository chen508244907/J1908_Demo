package com.test.j1908.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "JD_USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer uid;

    private String upassword;

    private String uphone;

    private String uname;

    private String uemail;

    private Integer rid;

    private String usex;

    private String uidcard;
}
