package io.zipcoder.microlabs.mastering_loops;

import java.util.Scanner;

public class CarRide {
    Scanner sc = new Scanner(System.in);
        public void areWeThereYet(){
            boolean stillDriving = true;

            while(stillDriving){

            System.out.println("Are we there yet?");
            String input = sc.nextLine();
            input = input.toLowerCase();
                if( input.equals("yes")){
                    System.out.println("Good!");
                    stillDriving = false;

                }

            }
    }

    public static void main(String[] args) {
        CarRide carRide = new CarRide();
        carRide.areWeThereYet();
    }
}
