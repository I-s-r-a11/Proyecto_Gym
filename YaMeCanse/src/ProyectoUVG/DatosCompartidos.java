/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoUVG;

/**
 *
 * @author Lenovo
 */
public class DatosCompartidos {
   private static String nombreUsuario;
   
   
   public DatosCompartidos(){
   
   }

    public static String getNombreUsuario() {
        return nombreUsuario;
    }

    public static void setNombreUsuario(String nombreUsuario) {
        DatosCompartidos.nombreUsuario = nombreUsuario;
    }
         
}
