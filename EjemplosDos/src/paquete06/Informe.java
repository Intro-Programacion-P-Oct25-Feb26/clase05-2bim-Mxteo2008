/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06;

/**
 *
 * @author UTPL
 */
public class Informe {

    public static void imprimir(String a, String b, String c, String d, String e,
            double[] f, double g){
        String notas = "";
        String mensaje = "";
        
        for(int i = 0; i < f.length; i++){
            notas = String.format("%s%.2f\n", notas, f[i]);
        }
    
        mensaje = String.format("%sLos datos ingresados son:\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Ciudad: %s\n"
                + "Nombre de la empresa: %s\n"
                + "Dirección de la empresa: %s\n"
                + "Notas:\n%s\n"
                + "Promedio: %.2f\n "
                + "", mensaje, 
                a,
                b,
                c,
                d, 
                e, 
                notas, 
                g);
        
        System.out.printf("%s", mensaje);

    }
}
