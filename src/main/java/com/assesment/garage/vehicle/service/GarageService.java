package com.assesment.garage.vehicle.service;


import com.assesment.garage.vehicle.constant.VehicleTypeConstant;
import com.assesment.garage.vehicle.dao.GarageDao;
import com.assesment.garage.vehicle.model.Vehicle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Set;

/**
 * @author orhany
 */
@Service
@Slf4j
public class GarageService {

    private final GarageDao garageDao;

    @Autowired
    public GarageService(GarageDao garageDao) {
        this.garageDao = garageDao;
    }

    public String addVehicle(Vehicle vehicle) {
        String vehicleType = vehicle.getVehicleType();
        Set<Integer> slots = getAvailableSlots();
        if (slots.size() > 9) {
            log.info("Garage is full");
            return "Garage is full";
        }
        if (vehicleType.equalsIgnoreCase(VehicleTypeConstant.CAR)) {
        }
        garageDao.insertVehicle(vehicle);
        return " Slot allocated";
    }

    public Set<Integer> getAvailableSlots() {
        return garageDao.getFreeSlots();
    }

    public List<Vehicle> status() {
        return garageDao.selectAllVehicle();
    }

}
