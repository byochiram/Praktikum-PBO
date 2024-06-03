/*
 * Nama      : Rosidah Rahmati
 * NIM       : 24060122140121
 * File      : Helicopter.java
 * Deskripsi : Class Helicopter
 */ 

public class Helicopter extends Airplane{
    private double maxLoad;

    public Helicopter(double maxLoad){
        this.maxLoad = maxLoad;
        System.out.println("Helicopter hanya memerlukan landasan kecil");
    }

    public Helicopter(){
        System.out.println("Helicopter hanya memerlukan landasan kecil");
    }

    public double calcFuelEfficiency(){
        return maxLoad * 0.001;
    }

    public double calcTripDistance(){
        return calcFuelEfficiency() * 100;
    }

    public void takeOff(){
        System.out.println("Helicopter lepas landas");
    }

    public void land(){
        System.out.println("Helicopter mendarat");
    }

    public void fly(){
        System.out.println("Helicopter terbang");
    }
}
