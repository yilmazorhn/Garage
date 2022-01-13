package com.assesment.garage.vehicle.controller;

import com.assesment.garage.vehicle.model.Vehicle;
import com.assesment.garage.vehicle.service.GarageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

/**
 * @author orhany
 */
@RestController
@RequestMapping(path = "api/v1/garage")
public class GarageController {

    private final GarageService garageService;

    @Autowired
    public GarageController(GarageService garageService) {
        this.garageService = garageService;
    }

    @PostMapping(value = "/park")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public  String park(@RequestBody Vehicle vehicle) {
        return garageService.addVehicle(vehicle);
    }

    @GetMapping(value = "/status")
    @ResponseStatus(HttpStatus.ACCEPTED)
    @ResponseBody
    public List<Vehicle> status() {
        return garageService.status();
    }

    @GetMapping(value = "/freeSlots")
    @ResponseStatus(HttpStatus.ACCEPTED)
    @ResponseBody
    public Set<Integer> getFreeSlots() {
        return garageService.getAvailableSlots();
    }

}
