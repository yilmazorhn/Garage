package com.assesment.garage.vehicle.model;


import lombok.Data;


/**
 * @author orhany
 */

@Data
public class Vehicle {

    private final String id;

    private final String plate;

    private String vehicleType;

    private String colour;

    private String orderOfEntry;

    private int allocatedSlot;

}