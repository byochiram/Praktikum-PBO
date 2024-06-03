/*
 * Nama      : Rosidah Rahmati
 * NIM       : 24060122140121
 * File      : Superman.java
 * Deskripsi : Class Superman 
 */

public class Superman extends Kryptonian{
    public Superman(String name){
        System.out.println("Superman ini bernama" + name);
    }

    public void takeOff(){
        System.out.println("Superman lepas landas");
    }

    public void land(){
        System.out.println("Superman mendarat");
    }

    public void fly(){
        System.out.println("Superman terbang di langit");
    }

    public void leapBuilding(){
        System.out.println("Superman melompati bangunan-bangunan");
    }
    
    public void stopBullet(){
        System.out.println("Superman menghentikan peluru");
    }

    public void eat(){
        System.out.println("Superman makan");
    }
}
