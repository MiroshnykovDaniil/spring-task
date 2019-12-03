package com.tagsoft.task.spring.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity(name="states")
public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int name;
}
