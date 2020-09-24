/*
 * CLASE PRINCIPAL MAIN01: POO_03_AGENDA PERSONAS TELEFONOS
 */
package edu.utp.poo.agenda;
import edu.utp.poo.libreria.*;
import java.util.Scanner;
/**
 * Programación Orientada a Objetos.
 * @author Jhoel RN MH
 * jhoelrn@hotmail.com
 */
public class Main03 {
    
    static Scanner consola = new Scanner(System.in);
    
    public static int menu(){
        System.out.println("\n\n");
        System.out.println("1. Buscar");
        System.out.println("2. Añadir");
        System.out.println("3. Eliminar");
        System.out.println("4. Imprimir Lista");
        System.out.println("0. Salir");
        System.out.println("Opción => ");
        int op = consola.nextInt();
        return op;
    }
    
    


    public static void main(String[] args) {
        
        //Crear un objeto lista de teléfonos vacío (con cero elementos)
        CListaTelefonos lista = new CListaTelefonos();
        int opcion = 0, posicion = -1;
        
        String cadenabuscar = null;
        String nombre, direccion;
        long telefono;
        boolean eliminado = false;
        
        Scanner consola = new Scanner(System.in);
        
        do {
            opcion = menu();
            switch(opcion){
                case 1: // BUSCAR
                    System.out.println("\n\n BUSQUEDA DEL CONTACTO");
                    System.out.println("Ingrese un Nombre a Buscar: ");
                    cadenabuscar = consola.next();
                    posicion = lista.buscar(cadenabuscar, 0);
                    if (posicion == -1){
                        if (lista.longitud() !=0) {
                            System.out.println("Búsqueda fallida");
                        } else {
                            System.out.println("lista vacia");
                        }
                    }
                    else {
                        System.out.println("\n\n DATOS DEL CONTACTO");
                        System.out.println("Nombre: "+lista.valorEn(posicion).obtenerNombre());
                        System.out.println("Direccion: "+lista.valorEn(posicion).obtenerDireccion());
                        System.out.println("Teléfono: "+lista.valorEn(posicion).obtenerTelefono());
                    }
                break;
                
                case 2://AÑADIR
                    System.out.println("\n\n NUEVO CONTACTO");
                    System.out.println("Ingrese un nombre: ");
                    nombre = consola.next();
                    System.out.println("Ingrese una direccion: ");
                    direccion = consola.next();
                    System.out.println("Ingrese un telefono: ");
                    telefono = consola.nextLong();
                    //AGREGA UNA PERSONA A LA LISTA
                    CPersona person = new CPersona(nombre,direccion,telefono);
                    lista.añadir(person);
                break;
                
                case 3: // ELIMINAR
                    System.out.println("\n\n ELIMINAR CONTACTO");
                    System.out.println("Ingrese un telefono: ");
                    telefono = consola.nextLong();
                    eliminado = lista.eliminar(telefono);
                    if (eliminado) {
                        System.out.println("Registro Eliminado");
                    } else {
                        if (lista.longitud() != 0) {
                            System.out.println("Telefono no encontrado");
                            
                        } else {
                            System.out.println("Lista vacia");
                        }
                    }
                break;
                
                
                case 4: //IMPRIMIR LISTA
                    System.out.println("\n\n LISTA DE CONTACTOS " );
                    for (int indice = 0; indice < lista.longitud(); indice++) {
                        System.out.println("Nombre: "+lista.valorEn(indice).obtenerNombre());
                        System.out.println("Direccion: "+lista.valorEn(indice).obtenerDireccion());
                        System.out.println("Telefono: "+lista.valorEn(indice).obtenerTelefono());
                        System.out.println("-------------------------");
                    }
            }     
        } while (opcion != 0);

    }
    
}
