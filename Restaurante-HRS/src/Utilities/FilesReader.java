/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;


import Platos.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author OLGA
 */
public class FilesReader {

    public static Plato[] readElementFromFile(String filePath) {
         try {
            FileReader file = new FileReader(filePath);
            BufferedReader br = new BufferedReader(file);
            // Count the number of lines in the file
            long numberOfLines = br.lines().count();

            // Create an array to store Lavadoras
            Plato[] array = new Plato[20];

            // Reset the buffered reader
            br.close();
            br = new BufferedReader(new FileReader(filePath));

            // Read each line and create Lavadora objects
            for (int i = 0; i < numberOfLines; i++) {
                String line = br.readLine();
              

                if(!line.equals("")){
                String[] parts = line.split(",");
                String nombre = parts[0].trim();
                double precio = Double.parseDouble(parts[1].trim());
                int tiempoPreparacion = Integer.parseInt(parts[2].trim());
                IngredientePrincipal ingredientePrincipal = IngredientePrincipal.valueOf(parts[3].trim());
                TipoPlato tipoPlato = null;
                Boolean esFrio=null;
                Boolean contenidoAltoAzucar=null;
                try {
                    tipoPlato = TipoPlato.valueOf(parts[4].trim());

                } catch (Exception e) {

                        esFrio = Boolean.parseBoolean(parts[4].trim());
                        contenidoAltoAzucar = Boolean.parseBoolean(parts[5].trim());
                        

                }
                if (tipoPlato!=null) {
                    array[i] = new PlatoPrincipalImpl(nombre, precio, tiempoPreparacion, ingredientePrincipal,tipoPlato);

                } else {
                    array[i] =  new PostreImpl(nombre, precio, tiempoPreparacion, ingredientePrincipal,esFrio, contenidoAltoAzucar);

                }
               
            }
                else {
                    array[i] = null;
                }
            } 
            return array;

        } catch (IOException | NumberFormatException e) {
            System.out.println(e.getMessage());
            return null;
      
        }
    }
}
