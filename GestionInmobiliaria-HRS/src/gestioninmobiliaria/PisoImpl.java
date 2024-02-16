/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestioninmobiliaria;

/**
 *
 * @author killer
 */
public class PisoImpl extends ViviendaImpl implements Piso{
    private int floor;
    private char door;

    public int getFloor() {
        return floor;
    }

    public char getDoor() {
        return door;
    }

    public PisoImpl(String direccion, int floor, char door) {
        super(direccion);
        this.floor = floor;
        this.door = door;
    }
    

    public PisoImpl(int floor, char door, double superficie, double precio, Operacion operacion, String direccion) {
        super(superficie, precio, operacion, direccion);
        this.floor = floor;
        this.door = door;
    }
    
    
}
