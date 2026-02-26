/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alquilerdeautos;

import javax.swing.JOptionPane;

/**
 *
 * @author fboga
 */
public class AlquilerDeAutos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre;
        String cantidad;
        String categoria;
        String placa;
        String marca;
        String seguro;
        String gps;
        String lectura;
        
        double precio = 0;
        double Dias = 0;
        double descuento;
        double subtotal;
        double total;
        double puntos = 0;
        double totalpagar;
        double totalpuntos;
        double cedula;
        double recargog = 0;
        double recargos = 0;
        
        //Solicitar informacion del tramite
        
        lectura = JOptionPane.showInputDialog("Digite su cedula");
        cedula = Double.parseDouble(lectura);
        
        
        nombre= JOptionPane.showInputDialog("Digite el nombre del cliente");
        nombre = nombre.trim();
        nombre = nombre.toUpperCase();
        
        
        
        cantidad= JOptionPane.showInputDialog("la cantidad de autos que desea registrar");
        cantidad = cantidad.trim();
        cantidad = cantidad.toUpperCase();
    
        
        categoria= JOptionPane.showInputDialog("Digite si el cliente es un cliente VIP");
        categoria = categoria.trim();
        categoria = categoria.toUpperCase();
        
        
        placa= JOptionPane.showInputDialog("Digite el numero de la placa");
        placa = placa.trim();
        placa = placa.toUpperCase();

        marca = JOptionPane.showInputDialog("Digite la marca del vehiculo");

        seguro = JOptionPane.showInputDialog("Digite si el vehiculo si trae Seguro o no:");
        seguro = seguro.toUpperCase();

        gps = JOptionPane.showInputDialog("Digite si el vehiculo si trae GPS o no");
        gps = gps.toUpperCase();
        
        
        int mes = 1;
        String solicitaData= JOptionPane.showInputDialog("Digite el mes");
        mes=Integer.parseInt(solicitaData);
        switch (mes) {
            case 1:
                JOptionPane.showMessageDialog(null, "enero");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Febre");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "marzo");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "abril");
               
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "mayo");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "junio");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "julio");
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "agostor");
                break;
            case 9:
                JOptionPane.showMessageDialog(null, "Setiembre");
                
            case 10:
                JOptionPane.showMessageDialog(null, "octubre");    
                
            case 11:
                JOptionPane.showMessageDialog(null, "noviembre");  
                
             case 12:
                JOptionPane.showMessageDialog(null, "diciembre");   
                
                
                
            default:
                JOptionPane.showMessageDialog(null, "Mes con error");
        }
        

        // descuento
        if (Dias > 7) {
            descuento = precio * 0.15 * Dias;
        } else {
            descuento = 0;
        }
        
        //puntos de lealtad por muchos dias
        
        if (Dias > 7) {
            puntos = 5;
        } else {
            descuento = 0;
        }

        //recargo por GPS 
        
        
              
        
           
            
             
        //recargo por GPS 
        
        //if (seguro = no) {
         //   recargos = 5000 * Dias;
        //} else {
          //  gps = si;
         //   recargos = 0;
        //}
        
        // Calculos
        subtotal = precio;
        
        total = precio - descuento;
        
        totalpuntos = puntos * 2;
        
        totalpagar = subtotal + descuento;
        
   
        
        JOptionPane.showMessageDialog(null,
                "------------------------------------------------------------\n\n" +
                                "RESUMEN FINAL DE ALQUILERES\n\n"+
                "------------------------------------------------------------\n\n" +
                 "Cliente:\"" + nombre + "\"\n\n" +
                "Cedula:\"" + cedula + "\n\n" +
                "Categoria\"" + categoria + "\n\n" +
                "Mes de registro:\"" + mes + "\n\n" +
                "---------------------------------------\n\n" +
                "Cantidad de vehiculos procesados:\"" + cantidad + "\n\n" +
                "Subtotal antes de descuento VIP:\"" + recargog + recargos + subtotal + "\n\n" +
                "puntos antes del bono VIP:\"" + puntos + "\n\n" +
                
                "***APLICANDO BENEFICIOS VIP (5% DESCUENTO / PUNTOS X2)***"+
                        
                "TOTAL A PAGAR: \"" + totalpagar + "\n\n" +
                "PUNTOS DE LEALTAD TOTALES; \"" + totalpuntos + "\n\n" );
                        

       
               
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
                                      
                        }
}
