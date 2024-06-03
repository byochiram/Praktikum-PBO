/*
 * Nama      : Rosidah Rahmati
 * NIM       : 24060122140121
 * File      : RiverBarge.java
 * Deskripsi : Class RiverBarge
 */

public class RiverBarge extends Vehicle{
    private double maxLoad;

    public RiverBarge(double maxLoad){
        this.maxLoad = maxLoad;
    }

    public double calcFuelEfficiency(){
        return maxLoad * 0.001;
    }

    public double calcTripDistance(){
        return calcFuelEfficiency() * 100;
    } 
}
