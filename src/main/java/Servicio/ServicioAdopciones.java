package Servicio;

import Entidades.Perro;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author 54343
 */
public class ServicioAdopciones {
    ArrayList <Persona> Adoptantes = new ArrayList();
    ArrayList <Perro> Adoptados = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("/n").reset();
    
   
    
    public void crearPersona(){
      int opc;
         
        do{
            Persona P1 = new Persona();
         System.out.println("Ingrese el nombre del adoptante");
         P1.setNombre(leer.next());
         System.out.println("Ingrese el apellido del adoptante");
         P1.setApellido(leer.next());
         System.out.println("Ingrese la edad del adoptante");
         P1.setEdad(leer.nextInt());
         System.out.println("Ingrese el DNI del adoptante");
         P1.setDocumento(leer.nextInt());
         Adoptantes.add(P1);
         System.out.println("Desaa agregas mas adoptantes? 1-Si/2-No");
         opc = leer.nextInt();
        
        }while(opc==1);
    }


    public void crearPerro(){
      int opc;
     
        do{
            Perro PE1 = new Perro();    
         System.out.println("Ingrese el nombre del perro");
         PE1.setNombre(leer.next());
         System.out.println("Ingrese la raza del perro");
         PE1.setRaza(leer.next());
         System.out.println("Ingrese la edad del perro");
         PE1.setEdad(leer.nextInt());
         System.out.println("Ingrese el tamaño");
         PE1.setTamaño(leer.next());
         Adoptados.add(PE1);
         System.out.println("Desaa agregas mas perros? 1-Si/2-No");
         opc = leer.nextInt();
        
        }while(opc==1);
    }
    public void mostarAdotantes(){
        System.out.println("****La lista de adoptantes es****");
        for (Persona Adoptante : Adoptantes) {
            System.out.println(Adoptante.toString());
            
        }
    }
    public void mostrarPerros(){
        System.out.println("****La lista de perros es****");
        for (Perro Perros : Adoptados) {
        System.out.println(Perros.toString());
            
        }
    }

   public void elegirAdoptado (){
       System.out.println("¿Quien desea adoptar?");
       String adop = leer.next();
       for (Persona Adoptante : Adoptantes) {
           if(Adoptante.getNombre().equalsIgnoreCase(adop)){
           Iterator <Perro> it = Adoptados.iterator();
           mostrarPerros();
           System.out.println("Ingrese el nombre del perro que desea adoptar");
           String nombrePerro = leer.next();
           for (Perro Adoptado : Adoptados) {
             if(Adoptado.getNombre().equalsIgnoreCase(nombrePerro)){
             Adoptante.setPerro(Adoptado);
            }else{
                 System.out.println("El perro ya esta adoptado");
             }
               
           }
          while(it.hasNext()){
              if(it.next().getNombre().equalsIgnoreCase(nombrePerro)){
                  it.remove();
              }
          }
         }else{
               System.out.println("No se encontro la persona en la lista");
           }   
        }
   }
      public void mostarAdotantesAdoptados(){
        System.out.println("****La lista de adoptantes con sus adoptados****");
        for (Persona Adoptante : Adoptantes) {
            System.out.println(Adoptantes.toString());
        }
    }
}
/*Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.*/