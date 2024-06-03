/*
 * Nama      : Rosidah Rahmati
 * NIM       : 24060122140121
 * File      : SeaPlane.java
 * Deskripsi : Class SeaPlane 
 */

public class SeaPlane extends Airplane{
    private double maxLoad;

    public SeaPlane(double maxLoad){
        this.maxLoad = maxLoad;
        System.out.println("SeaPlane dapat take-off dan mendarat di perairan laut");
    }

    public SeaPlane(){
        System.out.println("SeaPlane dapat take-off dan mendarat di perairan laut");
    }

    public double calcFuelEfficiency(){
        return maxLoad * 0.001;
    }

    public double calcTripDistance(){
        return calcFuelEfficiency() * 100;
    } 

    public void takeOff(){
        System.out.println("Pesawat lepas landas");
    }

    public void land(){
        System.out.println("Pesawat mendarat");
    }

    public void fly(){
        System.out.println("Pesawat terbang");
    }
}
