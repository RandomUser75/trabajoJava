/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Restaurante;

import Excepciones.IncorrectPhoneNumber;
import Platos.Plato;
import Platos.PlatoPrincipal;

/**
 *
 * @author killer
 */
public interface Restaurant {

    int countDesserts(Object[] object, Plato plato);
    /* TODO: Implemente un método que dado un array de  objetos de cualquier tipo y
    un objeto de cualquier tipo devuelve el número de  objetos iguales a ese hay en el array.
     */
    /* TODO: Usando el método anterior, dado un plato indique cuántos postres igual a ese hay.
    Solo se deberá proceder al contaje en caso de que el plato sea un postre,
    si no se debe lanzar una excepción indicando que el plato dado no es un postre.
    Si no eres capaz de realizar el método anterior crea este desde cero.
     */

    int countObjects(Object[] object, Object o);

    // TODO: Implementa un método que elimine un plato de la carta.
    int deleteDish(Plato plato);
    // TODO: Implemente un método que devuelva  el PlatoPrincipal más barato que tenga un aporte calórico bajo.

    Plato[] getCarta();

    String getNombre();

    String getTel();

    double getValoracion();

    PlatoPrincipal returnCheapestPrincipalDish();

    void setCarta(Plato[] carta);

    
    void setNombre(String nombre);

    void setTel(String tel);

    void setValoracion(double valoracion);
    
}
