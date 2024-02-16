/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Platos;

/**
 *
 * @author OLGA
 */
public interface Plato {

    IngredientePrincipal getIngredientePrincipal();

    String getNombre();

    double getPrecio();

    int getTiempoPreparacion();

    void setIngredientePrincipal(IngredientePrincipal ingredientePrincipal);

    void setNombre(String nombre);

    void setPrecio(double precio);
    public String calcularPrecioCalorico();
    void setTiempoPreparacion(int tiempoPreparacion);
    
}
