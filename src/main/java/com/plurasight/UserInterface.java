package com.plurasight;

import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;
    private void init(){
        DealershipFileManager fileManager = new DealershipFileManager();
    }


    public void display(){
        init();
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice != 99) {
            System.out.println("1 to Search by Price");
            System.out.println("2 to Search by Make and Model");
            System.out.println("3 to Search by Year");
            System.out.println("4 to Search by Color");
            System.out.println("5 to Search by mileage");
            System.out.println("6 to Search by Vehicle Type");
            System.out.println("7 to Search All Vehices");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 1:
                    processGetByPriceRequest();
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
                    processGetAllVehicles();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;

            }
        }
    }

    public void processGetByPriceRequest(){

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

    public void processGetAllVehicles(){

    }

    public void processAddVehicleRequest(){

    }

    public void processRemoveVehicleRequest(){

    }
}
