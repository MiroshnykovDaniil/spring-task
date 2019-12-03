package com.tagsoft.task.spring.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name="cities_canada")
public class CityCanada {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name="province_id", referencedColumnName = "id")
    private Province province;

    private String name;
}
