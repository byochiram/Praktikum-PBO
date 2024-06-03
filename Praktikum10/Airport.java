/*
 * Nama      : Rosidah Rahmati
 * NIM       : 24060122140121
 * File      : Airport.java
 * Deskripsi : Class Airport
 */

public class Airport{
    private Airplane airplane;
    private String name;

    public Airport(String name){
        this.name = name;
    }

    public String givePermissionToLand(IFlyer flyer){
        if (flyer instanceof Airplane){
            return airplane.toString() + "mendarat";
        }
        else{
            return airplane.toString() + "tidak mendarat";
        }
    }
}