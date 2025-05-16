package com.plurasight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class UserInterface {

    public Dealership dealership = new Dealership("", "", "");
    private String String;

    private void init(){
        DealershipFileManager fileManager = new DealershipFileManager();
    }


    public void display(){
        Scanner scanner = new Scanner(System.in);
        init();

        int choice = -1;

        while (choice != 99) {
            System.out.println("1 to Search by Price");
            System.out.println("2 to Search by Make and Model");
            System.out.println("3 to Search by Year");
            System.out.println("4 to Search by Color");
            System.out.println("5 to Search by mileage");
            System.out.println("6 to Search by Vehicle Type");
            System.out.println("7 to Search All Vehices");
            System.out.print("Type your answer here: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 1:
                    processGetByPriceRequest(scanner);
                    break;
                case 2:
                    processGetByMakeModelRequest();
                    break;
                case 3:
                    processGetByYearRequest();
                    break;
                case 4:
                    processGetByColorRequest();
                    break;
                case 5:
                    processGetByMileageRequest();
                    break;
                case 6:
                    processGetByVehicleTypeRequest();
                    break;
                case 7:
                    processGetAllVehicles(String);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;

            }
        }
    }

    public void processGetByPriceRequest(Scanner scanner){

        System.out.println("Enter the min price");
        double min = scanner.nextInt();
        System.out.println("Enter the max price");
        double max = scanner.nextInt();

        List<Vehicle> filtered;
        filtered = dealership.getVehiclesByPrice(min, max);

        if (filtered.isEmpty()) {
            System.out.println("No vehicles found in that price range.");
        } else {
            for (Vehicle v : filtered) {
                System.out.println(v);
            }
        }

    }

    public void processGetByMakeModelRequest(){

    }

    public void processGetByYearRequest(){

    }

    public void processGetByColorRequest(){

    }

    public void processGetByMileageRequest(){

    }

    public void processGetByVehicleTypeRequest(){

    }

    public static Dealership processGetAllVehicles(String filename) {
        Dealership dealership = null;
        try (FileReader fileReader = new FileReader(filename);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line = bufferedReader.readLine();
            if (line != null) { // Check if the first line was read
                String[] parts = line.split("\\|");
                if (parts.length == 3) { // Basic validation
                    String name = parts[0];
                    String address = parts[1];
                    String phone = parts[2];
                    dealership = new Dealership(name, address, phone);

                    while ((line = bufferedReader.readLine()) != null) {
                        parts = line.split("\\|");
                        if (parts.length == 6) { // Basic validation for vehicle data
                            try {
                                int vin = Integer.parseInt(parts[0]);
                                int year = Integer.parseInt(parts[1]);
                                String make = parts[2];
                                String model = parts[3];
                                String vehicleType = parts[4];
                                double price = Double.parseDouble(parts[5]);

//                                Vehicle vehicle;
//                                if (vehicleType.equalsIgnoreCase("car")) {
//                                    vehicle = new Car(vin, year, make, model, price);
//                                } else if (vehicleType.equalsIgnoreCase("truck")) {
//                                    vehicle = new Truck(vin, year, make, model, price);
//                                } else if (vehicleType.equalsIgnoreCase("suv")) {
//                                    vehicle = new SUV(vin, year, make, model, price);
//                                } else {
//                                    System.out.println("Skipping unknown vehicle type: " + vehicleType);
//                                    continue;
//                                }
                                //dealership.addVehicle(vehicle);
                            } catch (NumberFormatException e) {
                                System.err.println("Error parsing vehicle data: " + line + " - " + e.getMessage());
                            }
                        } else {
                            System.err.println("Invalid vehicle data format: " + line);
                        }
                    }
                } else {
                    System.err.println("Invalid dealership info format: " + line);
                }
            } else {
                System.err.println("File is empty or missing dealership info.");
            }

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            // You might want to throw a custom exception here for better error handling
            // throw new DealershipFileException("Error reading dealership file", e);
        }
        return dealership;
    }


    public void processAddVehicleRequest(){

    }

    public void processRemoveVehicleRequest(){

    }

    private static void displayVehicles(){

    }
}
