/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import paquete02.*;
import paquete03.DatosUbicacion;
import paquete04.DatoAcademico;
import paquete05.DatoFinal;
import paquete06.Informe;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        String nombre;
        String ciudad;
        String apellidoRetornado;
        String empresa;
        String direccion;

        double[] misNotas;
        double promedio;

        nombre = DatoPersonal.obtenerNombre();
        apellidoRetornado = DatoPersonal.obtenerApellido();
        ciudad = DatosUbicacion.obtenerCiudad();
        empresa = DatoTrabajo.obtenerNombreEmpresa();
        direccion = DatoTrabajo.obtenerDireccionEmpresa();
        misNotas = DatoAcademico.obtenerNotas(4);
        promedio = DatoFinal.obtenerPromedio(misNotas);
        Informe.imprimir(nombre, apellidoRetornado, ciudad, empresa, direccion,
                misNotas,
                promedio);

    }

}
/*
Se está solicitando un aplicación donde se ingresen los nombres y apellidos
de una persona junto a su ciudad, luego se solicitarán de 4 notas para final-
mente sacar el promedio y presentarlo en pantalla. Todo esto se debe hacer
mediante la importación de otros archivos del mismo proyecto.



 */
