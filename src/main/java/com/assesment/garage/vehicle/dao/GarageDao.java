package com.assesment.garage.vehicle.dao;

import com.assesment.garage.vehicle.model.Vehicle;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class GarageDao {

    private final static List<Vehicle> garageList= new ArrayList<>();
    private final static Set<Integer> slotList= new HashSet<>();

    public void insertVehicle(Vehicle vehicle) {
        garageList.add(vehicle);
    }

    public List<Vehicle> selectAllVehicle() {
        return garageList;
    }

    public Set<Integer>  getFreeSlots() {
        garageList.forEach(item -> slotList.add(item.getAllocatedSlot()));
        return slotList;
    }

}
