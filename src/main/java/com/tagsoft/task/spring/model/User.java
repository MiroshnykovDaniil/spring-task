package com.tagsoft.task.spring.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
*
* Class User is made for US & Canada users.
*
*
* */

@Data
@Entity(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    // @todo Make encryption for pass
    private String password;

    // @todo Make validation for email
    private String email;


    //@todo Make entities: State[id,name], Province[id,name], City[id,province_id,name]
    // @todo then change user fields below according to this entities

    // Country: US or Canada
    private String country;

    //For US users: State
    private String state;

    // For Canada users: Province & city
    private String province;
    private String city;


}
