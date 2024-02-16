/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestioninmobiliaria;

import java.util.Scanner;

/**
 *
 * @author Killer
 */
public class TestVivienda {
    public static void main(String[] args) {
        //Ej 11.1Crear una vivienda llamada v1 con los siguientes valores
    Vivienda v1 = new ViviendaImpl(80, 850, Operacion.ALQUILER, "Calle Gongora nº 58  - 4ºB, Cordoba");
    //Ej 11.2 Crear una vivienda llamada v1 con los siguientes valores
    Vivienda v2 = new ViviendaImpl();
    //Ej 11.3 Crear una vivienda llamada v1 con los siguientes valores
    Vivienda v3 = new ViviendaImpl("Plaza de las flores");
    //Ej 11.4Recoja por terminal la superficie, el precio y la dirección. La operación será venta. Modifique  v2 a partir de los siguientes datos recogidos por terminal. 
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Superficie: " );
    double superficieV2=sc.nextDouble();
    v2.setSuperficie(superficieV2);
        System.out.println("Precio: ");
    double precioV2=sc.nextDouble();
    v2.setPrecio(precioV2);
    System.out.println("Direccion");
    String direccionV2=sc.nextLine();
    v2.setDireccion(direccionV2);
    v2.setOperacion(Operacion.VENTA);
    //Ej 11.5Modifique la dirección v3 con: Plaza de las flores nº 24, Úbeda
    v3.setDireccion("Plaza de las flores nº 24, Úbeda ");
    //Ej 11.6 Se ha realizado una rebaja de un 10% de v1. Muestra por pantalla el precio actual.
        System.out.println(v1.rebajaPrecioVivienda());
    //Ej 11.7Muestre por pantalla la comisión que se lleva la inmobiliaria por v2.
        System.out.println(v2.getQuantity());
        //Ej 11.8Calcule y muestre por pantalla el precio por metro cuadrado de v2. No olvides tratar la excepción.
        System.out.println(v2.getPricePerM2());
        //Ej 11.9 Muestre la localidad de v1 por pantalla
        System.out.println(v1.getCity());
        //Ej 11.10 Muestre por pantalla la dirección de la vivienda con mayor precio por metro cuadrado. Compare solo v2 y v3. Use el método del ejercicio 7.
        System.out.println(v2.getPriceFromOperation(v3));
        //Ej 11.11 Repita el apartado anterior con v1 y v3
        System.out.println(v1.getPriceFromOperation(v3));
        //Ej 11.12Muestra por pantalla el tipo de vivienda que es v3: ¿pequeña, mediana o grande? 
        System.out.println(v3.getViviendaSize());
        //Ej 11.13 Muestra por pantalla la vivienda con menor precio por metro cuadrado
        System.out.println(v1.getPricePerM2());
        System.out.println(v2.getPricePerM2());
        System.out.println(v3.getPricePerM2());
}
}