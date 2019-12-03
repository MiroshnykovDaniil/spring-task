package com.tagsoft.task.spring.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/*
*
* Class User is made for US & Canada users.
*
*
* */
@NoArgsConstructor
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


    // Country: US or Canada
    private String country;

    //For US users: State
    @ManyToOne
    @JoinColumn(name = "state_id",referencedColumnName = "id")
    private State state;

    // For Canada users: Province & city
    @ManyToOne
    @JoinColumn(name = "province_id",referencedColumnName = "id")
    private Province province;

    @ManyToOne
    @JoinColumn(name = "city_canada_id",referencedColumnName = "id")
    private CityCanada city;


}
