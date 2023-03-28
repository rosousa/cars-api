package com.cars.api.controllers;

import com.cars.api.DTO.CarsDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cars")
public class CreateController {
    @PostMapping
    public void create(@RequestBody CarsDTO req) {
        System.out.println("Modelo: " + req.modelo());
        System.out.println("Fabricante: " + req.fabricante());
        System.out.println("Ano: " + req.anoModelo());
    }
}
