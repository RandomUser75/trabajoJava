/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Platos;

import Platos.TipoPlato;

/**
 *
 * @author OLGA
 */
public class PlatoPrincipalImpl extends PlatoImpl implements PlatoPrincipal {
    private TipoPlato tipoPlato;

    // TODO: Cree un constructor que incluya por parámetro todas sus propiedades. 

    public PlatoPrincipalImpl(String nombre, double precio, int tiempoPreparacion, IngredientePrincipal ingredientePrincipal, TipoPlato tipoPlato) {
        super(nombre, precio, tiempoPreparacion, ingredientePrincipal);
        this.tipoPlato = tipoPlato;
    }

    @Override
    public TipoPlato getTipoPlato() {
        return tipoPlato;
    }

    @Override
    public void setTipoPlato(TipoPlato tipoPlato) {
        this.tipoPlato = tipoPlato;
    }
    
    // TODO: Dos platos son iguales si tienen el mismo nombre y el mismo precio. 
    
    public boolean equals(Object o){
        boolean r=false;
        if(o instanceof PlatoPrincipal){
            PlatoPrincipal pp=(PlatoPrincipal)o;
            r=super.equals(pp);
        }return r;
    }
    
    
    // TODO: Crea el método que representa todas las propiedades en formato cadena. 
    
    
    public String toString(){
        return super.toString() + "Tipo plato: " + this.tipoPlato ;
    }
    

}
