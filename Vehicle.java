/*
 * Nama      : Rosidah Rahmati
 * NIM       : 24060122140121
 * File      : Vehicle.java
 * Deskripsi : Abstract Class Vehicle
 */

public abstract class Vehicle{
    public double calcFuelEfficiency(){
        return 0.0;
    }

    public double calcTripDistance() {
        return 0.0;
    }
    
    public String toString(){
        return this.getClass().getSimpleName();
    }
}