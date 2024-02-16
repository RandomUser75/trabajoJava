/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package gestioninmobiliaria;

/**
 *
 * @author DAW TARDE
 */
public class ViviendaImpl implements Vivienda {
    /**
     * Definir variables
     */
    private double superficie;
    private double precio;
    Operacion operacion;
    String direccion;
    private final double REBAJA = 0.1; 
    //Ej 2 Crear tres constructores:
    /**
     * Tiene como parámetro:
     * @param superficie
     * @param precio
     * @param operacion
     * @param direccion 
     */
    public ViviendaImpl(double superficie, double precio, Operacion operacion, String direccion){
        this.superficie=superficie;
        try{
            verificarPrecioNegativo(precio);
            this.precio=precio;
        }catch(PrecioNoNegativo e){
            System.out.println(e.getMessage());
        }
        this.operacion=operacion;
        this.direccion=direccion;
    }
    
    /**
     * 
     * Tiene como parametro:
     * @param direccion 
     * Los demás valores por defecto
     */
    
    public ViviendaImpl(String direccion){
        this.superficie=90.0;
        this.precio=150000.0;
        this.operacion=Operacion.VENTA;
        this.direccion=direccion;
    }
    /**
     * Contructor vacio(por defecto)
     */
    
    public ViviendaImpl(){
        this.superficie=0;
        this.precio=0;
        this.operacion=Operacion.VENTA;
        this.direccion=null;
    }
    //Ej 1 Crear la clase y la interfaz con sus métodos observables y modificables
    /**
     * Obtiene la superficie de la vivienda
     * @return la superficie de la vivienda
     */
    public double getSuperficie(){
        return this.superficie;
    }
    /**
     * Obtiene el precio de la vivienda
     * @return el precio de la vivienda
     */
    public double getPrecio(){
        return this.precio;
    }
    /**
     * Obtiene el tipo de operacion de la vivienda
     * @return tipo de operacion de la vivienda
     */
    public Operacion getOperacion(){
        return this.operacion;
    }
    /**
     * Obtiene la direccion de la vivienda
     * @return la direccion de la vivienda
     */
    public String getDireccion(){
        return this.direccion;
    }
    /**
     * Establece la superficie de la vivienda por parametro
     * @param superficie 
     */
    public void setSuperficie(double superficie){
        this.superficie=superficie;
    }
    /**
     * Establece el precio de la vivienda por parametro
     * @param precio 
     */
    public void setPrecio(double precio){
          try{
            verificarPrecioNegativo(precio);
            this.precio=precio;
        }catch(PrecioNoNegativo e){
            System.out.println(e.getMessage());
        }
    }
    /**
     * Establece el tipo de operacion de la vivienda por parametro

     * @param operacion 
     */
    public void setOperacion(Operacion operacion){
        this.operacion=operacion;
    }
    /**
     * Establece la direccion de la vivienda por parametro
     * @param direccion 
     */
    public void setDireccion(String direccion){
        this.direccion=direccion;
    }
    //Ej 3 Crear un método que rebaje el precio de la vivienda a un 10%. El valor de rebaja debe ser creado en una constante.
    /**
     *
     * @return el precio de la vivienda con rebaja aplicada
     */
    public double rebajaPrecioVivienda(){
        return this.precio=this.precio-(this.precio*this.REBAJA);
        
    }
    //Ej 4Crear el método toString que muestre la información de la Vivienda en el siguiente formato:
    /**
     * 
     * @return cada valor de las variables asignadas a un objeto creadas anteriormente
     */
    public String toString(){
        return "Dirección: " + this.direccion + ", Precio: "+ this.precio + ", Superficie: " + this.superficie + ", Operacion" + this.operacion; 
    }
    /**
     * 
     * @param operacion
     * @return operacion si el tipo de operacion de la vivienda es igual al tipo de operacion pasado por parametro
     */
    //Ej 5 Cree un método que dada una operación, alquiler, venta o alquiler con opción a compra, devuelva si la vivienda es de esa operación.
    public Operacion laViviendaEsDeEsaOperacion(Operacion operacion){
        return this.operacion=operacion;
    }
    //Ej 6 Crear un método que devuelva la cantidad que se lleva la inmobiliaria por la gestión. En el caso de las viviendas en alquiler se lleva un 8% del precio, en el caso de las viviendas en venta se lleva un 14% y en el alquiler con opción a compra un 11%
    /**
     * 
     * @return cuanto se lleva la inmobiliaria dependiendo del tipo de operacion
     */
    public double getQuantity(){
        if(this.operacion==Operacion.ALQUILER){
            return this.precio*0.08;
        }else if(this.operacion==Operacion.VENTA){
            return this.precio*0.14;
        }else{
            return this.precio*0.11;
        }
    }
    //Ej 7 Crear un método que dado otra Vivienda y sí únicamente la operación en ambas en la misma, es decir, ambas están en Venta o en alquiler nos devuelva la dirección de la vivienda con mayor precio por metro cuadrado. En el caso de que las viviendas  no tengan la misma operación  devuelva “Las viviendas no tienen la misma dirección”. Para ello, necesitará crear un método que calcule el precio por metro cuadrado. 
    /**
     * 
     * @return precio por metro cuadrado de la vivienda
     */
    public double getPricePerM2(){
        return this.precio/this.superficie;
    }
    /**
     * 
     * @param vivienda
     * @return direccion de la vivienda que mas precio por metro cuadrado tenga si son de la misma operacion
     */
    public String getPriceFromOperation(Vivienda vivienda){
        if(this.operacion==Operacion.VENTA&&vivienda.getOperacion()==Operacion.VENTA||this.operacion==Operacion.ALQUILER&&vivienda.getOperacion()==Operacion.ALQUILER){
            if(this.getPricePerM2()>vivienda.getPricePerM2()){
                return this.direccion;
            }else{
                return vivienda.getDireccion();
            }
        }else{
            return "Las viviendas no tienen la misma dirección";
        }
    }
    //Ej 8 Cree un método que devuelva un String que diga si la vivienda es pequeña, mediana o grande.
    /**
     * 
     * @return si la vivienda es pequeña, mediana o grande dependiendo de la superficie 
     */
    public String getViviendaSize(){
        if(this.superficie<70){
            return "Pequeña";
        }else if(this.superficie>70&&this.superficie<90){
            return "Mediana";
        }else{
            return "Grande";
        }
    }
    //Ej 9Cree un método que devuelva la localidad en la que se encuentra la vivienda. El formato de la dirección siempre se escribirá así:
    /**
     * 
     * @return la localidad de la vivienda
     */
    public String getCity(){
       String localidad=direccion.substring(direccion.lastIndexOf(" ")+1);
       return localidad;
    }
    //Ej 10: Cree un método que dado un array con las superficies de cada una de las estancias de la vivienda te calcule la superficie total y modifique la superficie.
    /**
     * 
     * @param array
     * @return superficie total de otras superficies pasadas por parametro
     */
    public double getTotalSurface(double [] array){
        double total=0;
        for(int i=0;i<array.length;i++){
            total=total+array[i];
        }this.setSuperficie(total);
        return superficie;
    }
    
    //Ej 3
    /**
     * Metodo que compara dos objetos y devuelve true o false segun se cumpla la condicion
     */
    public boolean equals(Object o){
        boolean r=false;
        if(o instanceof Vivienda){
            Vivienda v=(Vivienda)o;
            r=this.getDireccion().equals(v.getDireccion());
        }return r;
    }
    //Ej 5
    /**
     * Cuando el precio sea negativo, saldrá una excepción
     */
    private void verificarPrecioNegativo(double precio) throws PrecioNoNegativo{
        if (precio<0) {
            throw new PrecioNoNegativo("El precio ño puede ser negativo");
        }
    }
}


