/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class DatoTrabajo {

    static Scanner entrada = new Scanner(System.in);

    public static String obtenerNombreEmpresa() {
        String nombre;
        System.out.println("Ingrese nombre de la empresa");
        nombre = entrada.nextLine();

        return nombre;
    }

    public static String obtenerDireccionEmpresa() {
        String direccion;
        System.out.println("Ingrese dirección de la empresa");
        direccion = entrada.nextLine();

        return direccion;

    }
    // método que permita preguntar al usuario la dirección de la empresa
}
