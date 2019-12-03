package com.tagsoft.task.spring.controller;

import com.tagsoft.task.spring.model.CityCanada;
import com.tagsoft.task.spring.model.Province;
import com.tagsoft.task.spring.model.State;
import com.tagsoft.task.spring.repository.CityCanadaRepository;
import com.tagsoft.task.spring.repository.ProvinceRepository;
import com.tagsoft.task.spring.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/*
   This controller is made only to input data about states, provinces, cities and update cities data.
   Of cause this data can be input manually into DB, or when application starts,
   but I think this feature may be worth in future.
 */

@RestController
@RequestMapping("/geo")
public class GeographicDataController {
    @Autowired
    StateRepository stateRepository;
    @Autowired
    ProvinceRepository provinceRepository;
    @Autowired
    CityCanadaRepository cityCanadaRepository;
    @PostMapping()
    public void addState(@RequestBody State state){
        stateRepository.save(state);
    }

    @PostMapping()
    public void addProvince(@RequestBody Province province){
        provinceRepository.save(province);
    }

    @PostMapping()
    public void addCityCanada(@RequestBody CityCanada cityCanada){
        cityCanadaRepository.save(cityCanada);
    }

    class NewCityName{
        CityCanada cityCanada;
        String name;
    }

    @PutMapping()
    public void changeCityCanada(@RequestBody NewCityName city){
         CityCanada cityCanada = cityCanadaRepository.getOne(city.cityCanada.getId());
         cityCanada.setName(city.name);
         cityCanadaRepository.save(cityCanada);
    }

    @PostMapping()
    public void addCityCanadaList(@RequestBody List<CityCanada> cityCanadaList){
        for(CityCanada cityCanada : cityCanadaList) cityCanadaRepository.save(cityCanada);
    }
}
