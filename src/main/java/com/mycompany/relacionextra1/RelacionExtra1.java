package com.mycompany.relacionextra1;

import Servicio.ServicioAdopciones;
import java.util.Scanner;
/**
 *
 * @author 54343
 */
public class RelacionExtra1 {

    public static void main(String[] args) {
        ServicioAdopciones SA = new ServicioAdopciones();
        
        SA.crearPersona();
        SA.crearPerro();
        
       Scanner leer = new Scanner(System.in);
        int opcion;
         do {

            System.out.println("¿QUE DESEA HACER?");
            System.out.println("1 - Ver listado de adoptantes");
            System.out.println("2 - Ver listado de perros para adotar");
            System.out.println("3 - Que una de las personas de la lista de adotantes adote un perro disponible");
            System.out.println("4 - Ver la lista de las personas y perro que adotaron ");
            System.out.println("5 - Salir");

            System.out.println("Elija una opción");
            opcion = leer.nextInt();

            switch (opcion) {

                case 1:
                   SA.mostarAdotantes();
                    break;
                case 2:
                     SA.mostrarPerros();   
                    break;
                case 3:
                    SA.elegirAdoptado();
                    break;
                case 4:
                   SA.mostarAdotantesAdoptados();
                    break;
                case 5:
                    System.out.println("Sistema cerrado");
                default: 
                    System.out.println(" ");
                    break;
            }

        } while (opcion !=5);
    }
}
