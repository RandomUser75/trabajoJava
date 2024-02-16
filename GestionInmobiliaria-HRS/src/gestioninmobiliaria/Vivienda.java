/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package gestioninmobiliaria;

/**
 *
 * @author DAW TARDE
 */
public interface Vivienda {
    public double getSuperficie();
    public double getPrecio();
    public Operacion getOperacion();
    public String getDireccion();
    public void setSuperficie(double superficie);
    public void setPrecio(double precio);
    public void setOperacion(Operacion operacion);
    public void setDireccion(String direccion);
    public double rebajaPrecioVivienda();
    
    public Operacion laViviendaEsDeEsaOperacion(Operacion operacion);
     public double getQuantity();
     public String getPriceFromOperation(Vivienda vivienda);
     public String getViviendaSize();
     public String getCity();
     public double getTotalSurface(double [] array);
     public double getPricePerM2();
}
