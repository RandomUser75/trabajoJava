/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Platos;

/**
 *
 * @author OLGA
 */
public class PostreImpl extends PlatoImpl implements Postre {

    private boolean frio;
    private boolean contenidoAzucarAlto=false;

    public boolean isContenidoAzucarAlto() {
        return contenidoAzucarAlto;
    }

    public void setContenidoAzucarAlto(boolean esContenidoAzucarAlto) {
        this.contenidoAzucarAlto = esContenidoAzucarAlto;
    }

    @Override
    public boolean isFrio() {
        return frio;
    }

    @Override
    public void setFrio(boolean esFrio) {
        this.frio = esFrio;
    }
    // TODO: Cree un constructor que incluya por parámetro todas sus propiedades. 

    public PostreImpl(String nombre, double precio, int tiempoPreparacion, IngredientePrincipal ingredientePrincipal, boolean esFrio, boolean esContenidoAzucar) {
      super(nombre, precio, tiempoPreparacion, ingredientePrincipal);
      this.frio=esFrio;
      this.contenidoAzucarAlto=esContenidoAzucar;
      
    }
    // TODO: Dos platos son iguales si tienen el mismo nombre,  el mismo precio y el mismo valor si es frío. 

    public boolean equals(Object o){
        boolean r=false;
        if (o instanceof Postre) {
            Postre p=(Postre)o;
            r=super.equals(p)&&this.isFrio()==p.isFrio();
        }return r;
    }
    
    // TODO: Crea el método que representa todas las propiedades en formato cadena. 

    public String toString(){
        return super.toString() + "Frio: " + this.frio + "Contenido azucar: " + this.contenidoAzucarAlto;
    }
    
    /* TODO: Se calculará el contenido calórico en función del ingrediente principal y si el contenido de azúcar es alto: 
        - Si es verdura o fruta  y el contenido de azúcar no es alto el aporte calórico será BAJO. 
        - Si es verdura o fruta  y el contenido de azúcar es alto el aporte calórico será MEDIO.
        - Si es proteínas o lácteo el aporte calórico  y el contenido de ázucar no es alto será MEDIO. 
        - Si es proteínas o lácteo el aporte calórico  y el contenido de azúcar es alto será ALTO. 
        - Si es grano el contenido el aporte calórico será ALTO independientemente del contenido de azúcar. 
     */
    public String setContenidoCaloricoYAzucar(){
        if (this.ingredientePrincipal==this.ingredientePrincipal.VERDURA||this.ingredientePrincipal==this.ingredientePrincipal.FRUTA) {
            return "Bajo";
        }else if (this.ingredientePrincipal==this.ingredientePrincipal.VERDURA||this.ingredientePrincipal==this.ingredientePrincipal.FRUTA&&this.contenidoAzucarAlto) {
            return "Medio";
        }else if (this.ingredientePrincipal==this.ingredientePrincipal.PROTEINAS||this.ingredientePrincipal==this.ingredientePrincipal.LACTEOS) {
            return "Medio";
        }else if (this.ingredientePrincipal==this.ingredientePrincipal.PROTEINAS||this.ingredientePrincipal==this.ingredientePrincipal.LACTEOS&&this.contenidoAzucarAlto) {
            return "Alto";
        }else if (this.ingredientePrincipal==this.ingredientePrincipal.GRANO) {
            return "Alto";
        }return "";
    }
    
}
