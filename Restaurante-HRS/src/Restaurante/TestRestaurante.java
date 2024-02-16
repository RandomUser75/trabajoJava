/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Restaurante;

import Utilities.FilesReader;
import Utilities.*;
import Platos.*;
import static Platos.IngredientePrincipal.GRANO;

/**
 *
 * @author OLGA
 */
public class TestRestaurante {

    public static void main(String[] args) {
        Plato[] platos = FilesReader.readElementFromFile("src/Utilities/platos.txt");
        /* TODO: Crea un restaurante con: 
          - Nombre: Restaurante los álamos
          - Teléfono: +34687459871
          - Valoración: 4.1
          - Carta: platos
         */
        // TODO: Mostrar por pantalla el restaurante: 
        Restaurant restaurante=new RestauranteImpl("Pepe", "+34444444444", 4);
        restaurante.setCarta(platos);
        System.out.println("El restaurante creado es: " + restaurante);

        /* TODO: Elimina el siguiente plato:  
            Nombre: Crepe 
            Precio: 6 euros
            Tiempo preparación: 10 minutos
            Ingrediente principal: grano
         */
        Plato plato=new PlatoImpl("Crepe", 6, 10, GRANO);
        System.out.println("El plato eliminado se encontraba en la posición del array: " + restaurante.deleteDish(plato));
        /* TODO: Muestra por pantalla el nombre del plato principal con aporte calórico bajo, más barato.  */
        System.out.println("El plato principal con aporte calórico bajo y más barato es: " + restaurante.returnCheapestPrincipalDish());

        /* TODO: Muestra por pantalla el número de postres  hay en la carta igual a: 
            - Nombre: Ensalada de frutas, 
            - Precio: 6.75, 
            - Tiempo de preparación: 15.
            - Ingrediente principal: FRUTA
            - esFrio: true
            - contenidoAltoAzucar: false
         */
        
        System.out.println("Postres iguales al dado hay: " + restaurante.countDesserts(platos, plato));
        // Cambia el número de teléfono por un valor inválido y comprueba que: 
        // - Salta la excepción
        // - El teléfono no se modifica
        restaurante.setTel("3462246");
    }

}
