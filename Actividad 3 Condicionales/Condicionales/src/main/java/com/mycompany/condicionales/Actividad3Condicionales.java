/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.condicionales;

import java.util.Scanner;

/**
 *
 * @author Sala de Sistemas
 */


// Crear un programa en JAVA y Python que evalúe lo siguiente:

/*Se deben recibir como parámetros de entrada el nombre, apellido, edad y sexo. Evaluar la edad teniendo en 
cuenta si es mayor igual a 18 imprimir un mensaje en consola diciendo que es mayor de edad sino imprimir 
un mensaje diciendo que es menor de edad. Ademas si su sexo es Masculino imprimir un mensaje en consola 
diciendo que es un Hombre, sino imprimir un mensaje diciendo que es una mujer.*/


public class Actividad3Condicionales {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.next();

        System.out.println("Ingrese el apellido: ");
        String apellido = scanner.next();

        System.out.println("Ingrese la edad: ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese el sexo (Masculino(1) / Femenino(2)): ");
        int sexo = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("Es menor de edad.");
        }

        if (sexo == 1) {
            System.out.println("Es un Hombre.");
        } else if (sexo == 2) {
            System.out.println("Es una Mujer.");
        }
        }
    }

