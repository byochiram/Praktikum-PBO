/*
 * Nama      : Rosidah Rahmati
 * NIM       : 24060122140121
 * File      : ArmadaKendaraan.java
 * Deskripsi : Class ArmadaKendaraan
 */

import java.util.*;

public class ArmadaKendaraan {
    private ArrayList<Vehicle> kumpulanarmada;

    public ArmadaKendaraan(){
        kumpulanarmada = new ArrayList<>(); 
    }

    public void tambahArmada(Collection<? extends Vehicle> armada){
        kumpulanarmada.addAll(armada);
    }

    public ArrayList<Vehicle> getAllArmada(){
        return kumpulanarmada;
    }
}
