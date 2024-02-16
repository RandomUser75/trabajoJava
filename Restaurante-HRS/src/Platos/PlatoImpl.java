/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Platos;

import Excepciones.NotNegativePrice;

/**
 *
 * @author OLGA
 */
public class PlatoImpl implements Plato {
    protected String nombre;
    protected double precio;
    protected int tiempoPreparacion;
    protected IngredientePrincipal ingredientePrincipal;

    public PlatoImpl(String nombre, double precio, int tiempoPreparacion, IngredientePrincipal ingredientePrincipal) {
        this.nombre = nombre;
        try{
            isNegativePrice( precio);
            this.precio = precio;
        }catch(NotNegativePrice e){
            System.out.println(e.getMessage());
        }
        this.tiempoPreparacion = tiempoPreparacion;
        this.ingredientePrincipal = ingredientePrincipal;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", precio=" + precio + ", tiempoPreparacion=" + tiempoPreparacion + ", ingredientePrincipal=" + ingredientePrincipal;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public void setPrecio(double precio) {
        try{
            isNegativePrice( precio);
            this.precio = precio;
        }catch(NotNegativePrice e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public int getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    @Override
    public void setTiempoPreparacion(int tiempoPreparacion) {
        this.tiempoPreparacion = tiempoPreparacion;
    }

    @Override
    public IngredientePrincipal getIngredientePrincipal() {
        return ingredientePrincipal;
    }

    @Override
    public void setIngredientePrincipal(IngredientePrincipal ingredientePrincipal) {
        this.ingredientePrincipal = ingredientePrincipal;
    }
    private void isNegativePrice(double precio) throws NotNegativePrice{
        if (precio<0) {
            throw new NotNegativePrice("El precio no puede ser negativo");
        }
    }
    

    // TODO:  Dos platos son iguales si tienen el mismo nombre y el mismo precio. 
    
    public boolean equals(Object o){
        boolean r=false;
        if (o instanceof Plato) {
            Plato p=(Plato) o;
            r=this.getNombre().equals(p.getNombre())&&this.getPrecio()==p.getPrecio();
        }return r;
    }
    
     /* TODO: Se calculará el contenido calórico en función del ingrediente principal: 
        - Si es verdura o fruta el aporte calórico será BAJO. 
        - Si es proteínas o lácteo el aporte calórico será MEDIO. 
        - Si es grano el contenido el aporte calórico será ALTO.
    */
    public String calcularPrecioCalorico(){
        switch(this.ingredientePrincipal){
            case VERDURA:
                return "Bajo";
                
            case PROTEINAS:
                return "Medio";
            case LACTEOS:
                return "Medio";
            case GRANO:
                return "Alto";
        }return "";
    }
    
}
