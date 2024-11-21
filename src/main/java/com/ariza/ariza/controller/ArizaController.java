package com.ariza.ariza.controller;

import com.ariza.ariza.model.Ariza;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ariza")
@CrossOrigin
public class ArizaController {

    @PostMapping
    public Ariza createAriza(@RequestBody Ariza ariza) {
        return ariza;
    }

    @GetMapping
    public String handleGetRequest() {
        return "GET method is not supported here";
    }
}
