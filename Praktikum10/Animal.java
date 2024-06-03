/*
 * Nama      : Rosidah Rahmati
 * NIM       : 24060122140121
 * File      : Animal.java
 * Deskripsi : Abstract Class Animal
 */

public abstract class Animal {
    public abstract void eat();
    public String toString(){
        return this.getClass().getSimpleName();
    }
}
