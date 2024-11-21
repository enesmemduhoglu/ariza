package com.ariza.ariza.controller;

import com.ariza.ariza.Repository.ArizaRepository;
import com.ariza.ariza.model.Ariza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ariza")
public class ArizaController {

    @Autowired
    private ArizaRepository arizaRepository;

    @PostMapping
    public Ariza createAriza(@RequestBody Ariza ariza) {
        return arizaRepository.save(ariza);
    }
}
