/*
 * Nama      : Rosidah Rahmati
 * NIM       : 24060122140121
 * File      : Truck.java
 * Deskripsi : Class Truck 
 */

public class Truck extends Vehicle{
    private double maxLoad;
    
    public Truck(double maxLoad){
        this.maxLoad = maxLoad;
        System.out.println("Truck adalah angkutan darat yang sangat handal");
    }

    public Truck(){
        System.out.println("Truck adalah angkutan darat yang sangat handal");
    }

    public double calcFuelEfficiency(){
        return maxLoad * 0.001;
    }

    public double calcTripDistance(){
        return calcFuelEfficiency() * 100;
    }
}
