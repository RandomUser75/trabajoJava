/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Restaurante;

import Excepciones.IncorrectPhoneNumber;
import Platos.Plato;
import Platos.PlatoImpl;
import Platos.PlatoPrincipal;
import Platos.Postre;

/**
 *
 * @author OLGA
 */
public class RestauranteImpl implements Restaurant {

    private Plato[] carta;
    private String nombre;
    private String tel;
    private double valoracion;

    // TODO: Un constructor que inicialice la carta a numero de platos dado y el resto de propiedades entren por parámetro. 
    public RestauranteImpl(String nombre, String tel, double valoracion) {
        this.nombre = nombre;
        try {
            setCorrectNumberPhone(tel);
            this.tel = tel;
        } catch (IncorrectPhoneNumber e) {
            System.out.println(e.getMessage());
        }
        this.valoracion = valoracion;
        this.carta = new Plato[20];
    }

    @Override
    public Plato[] getCarta() {
        return carta;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getTel() {
        return tel;
    }

    @Override
    public double getValoracion() {
        return valoracion;
    }

    @Override
    public void setCarta(Plato[] carta) {
        this.carta = carta;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void setTel(String tel) {
        try {
            setCorrectNumberPhone(tel);
            this.tel = tel;
        } catch (IncorrectPhoneNumber e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void setValoracion(double valoracion) {
        this.valoracion = valoracion;
    }
    public String toString(){
        return "Nombre: " + this.nombre + "Telefono" + this.tel + "Valoracion: " + this.valoracion + "Num elements: " + this.carta.length;
    }

    private void setCorrectNumberPhone(String tel) throws IncorrectPhoneNumber {
        
        if (tel.length() < 12 || tel.length() > 12 ||tel.charAt(0)!='+') {
            throw new IncorrectPhoneNumber("El numero de telefono debe ser de 12 digitos y debe contener +");
        }
    }

    // TODO: Implementa un método que elimine un plato de la carta. 
    @Override
    public int deleteDish(Plato plato) {
        
        for (int i = 0; i < carta.length; i++) {
            if (carta[i].equals(plato)) {
                if (carta[i].equals(carta[i])) {
                    carta[i] = null;
                }
                carta[i] = null;
                return i;
            }
        }
        return -1;
    }
    // TODO: Implemente un método que devuelva  el PlatoPrincipal más barato que tenga un aporte calórico bajo. 

    @Override
    public PlatoPrincipal returnCheapestPrincipalDish() {
        double precioMin = Double.MAX_VALUE;
        int pos=0;
        for (int i = 0; i < carta.length; i++) {
            if (carta[i] instanceof PlatoPrincipal&&carta[i]!=null) {
                if (carta[i].getPrecio() < precioMin &&carta[i].calcularPrecioCalorico().equals("Bajo")) {
                    precioMin=carta[i].getPrecio();
                    pos=i;
                }
            }
        }return (PlatoPrincipal) this.carta[pos];
    }
   
    
    
    /* TODO: Implemente un método que dado un array de  objetos de cualquier tipo y 
        un objeto de cualquier tipo devuelve el número de  objetos iguales a ese hay en el array.
     */
     public int countObjects(Object[]object, Object o){
        int count=0;
        for (int i = 0; i < object.length; i++) {
            if (object[i].equals(o)) {
                count++;
            }
        }return count;
    }
 /* TODO: Usando el método anterior, dado un plato indique cuántos postres igual a ese hay. 
        Solo se deberá proceder al contaje en caso de que el plato sea un postre, 
        si no se debe lanzar una excepción indicando que el plato dado no es un postre.  
        Si no eres capaz de realizar el método anterior crea este desde cero. 
     */
    public int countDesserts(Object[]object, Plato plato){
       
        int count=0;
        for (int i = 0; i < this.countObjects(object,  plato); i++) {
            if (plato instanceof Postre) {
                if (object[i].equals(plato)) {
                    count++;
                }
            }
        }return count;
    }

   

}
