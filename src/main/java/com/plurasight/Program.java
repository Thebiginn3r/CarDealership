package com.plurasight;

public class Program {
    public static void main(String[] args) {
        DealershipFileManager test = new DealershipFileManager();
        test.getDealership();
        UserInterface ui = new UserInterface();
        ui.display();
    }

}
