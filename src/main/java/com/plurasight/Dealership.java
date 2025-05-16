package com.plurasight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dealership {
    private ArrayList<Vehicle> inventory;

    private String name;
    private String address;
    private String phone;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Vehicle v : inventory){
            sb.append(v.toString()).append("\n");
        }
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();
    }

    public List<Vehicle> getVehiclesByPrice (double min, double max) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the min price");
        min = scanner.nextInt();
        System.out.println("Enter the max price");
        max = scanner.nextInt();
        return List.of();
    }

    public List<Vehicle> getVehiclesByMakeModel (String make, String model){
        return null;
    }

    public List<Vehicle> getVehiclesByYear(int min, int max){
        return null;
    }

    public List<Vehicle> getVehicleByColor(String color){
        return null;
    }

    public List<Vehicle> getVehicleByMileage(int min, int max){
        return null;
    }

    public List<Vehicle> getVehiclesByType(String vehicle){
        return null;
    }

    public List<Vehicle> getAllVehicles(){
        return null;
    }

    public void addVehicle (Vehicle vehicle){
        inventory.add(vehicle);
    }

    public void removeVehicle(String vehicle){

    }

}
