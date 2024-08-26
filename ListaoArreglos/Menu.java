/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaoarreglos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DRE
 */
public class Menu {

    public static void main(String[] args) {
        ArrayList<String> persona = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu Principal \n1 Crear personas \n2 Eliminar lista \n3 Lista persona \n4 Buscar persona \n5 Salir");
        System.out.println("");
        System.out.println("Eliga una opcion: ");
        int opcion = scanner.nextInt();

        switch (opcion) {

            case 1:
                System.out.println("");
                System.out.println("SELECCIONASTE LA OPCION CREAR PERSONAS");
                System.out.println("DIGITE TU IDENTIFICACION");
                int id = scanner.nextInt();

                System.out.println("Digite su nombre completo: ");
                String nombre = scanner.next();
                persona.add(nombre);
                System.out.println("Persona agregada: " + nombre);
                id++;
                break;
            case 2:
                System.out.println("SELECCIONASTE LA OPCION ELIMINAR PERSONA");
                persona.add("carlos");
                persona.add("Dario");
                persona.add("Ivan");
                persona.remove(1);
                System.out.println("Lista despues de eliminarla" + persona);
                break;
            case 3:
                System.out.println("SELECCIONASTE LA OPCION LISTA PERSONA");
                persona.add("carlos");
                persona.add("Dario");
                persona.add("Ivan");
                System.out.println("LISTA DE PERSONA" + persona);
                break;
            case 4:
                System.out.print("Introduce el nombre de la persona a buscar: ");
                String nombreBuscado = scanner.next();

                persona.add("carlos");
                persona.add("Dario");
                persona.add("Ivan");

                if (persona.contains(nombreBuscado)) {
                    System.out.println("La persona " + nombreBuscado + " esta en el array.");
                } else {
                    System.out.println("La persona " + nombreBuscado + " no se encuentra en el array.");
                }
                    break;
            case 5:               
            System.out.println("");
         
                }
        }
    }



