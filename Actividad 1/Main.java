/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.usuario;

/**
 *
 * @author DRE
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Usuario {
     String nombreCompleto;
     String nickname;
     int clave;
     String tipo;
     String fechaCreacion;

    public Usuario(String nombreCompleto, String nickname, int clave, String tipo, String fechaCreacion) {
        this.nombreCompleto = nombreCompleto;
        this.nickname = nickname;
        this.clave = clave;
        this.tipo = tipo;
        this.fechaCreacion = fechaCreacion;
    }

    public String getNickname() {
        return nickname;
    }

    public String getDatos() {
        return "Nombre Completo: " + nombreCompleto + "Nickname: " + nickname + "Clave: " 
                + clave +  "Tipo: " + tipo +"Fecha de Creación: " + fechaCreacion;
     }
}

public class Main {
    static Map<String, Usuario> usuarios = new HashMap<>();
     static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nMenu:");
            
            System.out.println("1. Agregar Usuario");
            System.out.println("2. Buscar Usuario");
            System.out.println("3. Eliminar Usuario");
            System.out.println("4. Salir");

            System.out.print("Seleccione una opcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); 
            
             switch (opcion) {
                case 1:
                    agregarUsuario();
                    break;
                case 2:
                    buscarUsuario();
                    break;
                case 3:
                    eliminarUsuario();
                    break;
                case 4:
                    System.out.println("Salir.");                   
                    return;
                    }
        }
    }

    private static void agregarUsuario() {
        System.out.print("Ingrese el nombre completo: ");
        String nombreCompleto = scanner.nextLine();
        System.out.print("Ingrese el nickname: ");
        String nickname = scanner.nextLine();        
       
       if (usuarios.get(nickname) != null) {
            System.out.println("El nickname " + nickname + " ya existe Por favor puedes  elegir otro.");
            return;
       }
       
        System.out.print("Ingrese la clave: ");
        int clave = scanner.nextInt();
        System.out.print("Ingrese el tipo de usuario: ");
        String tipo = scanner.next();
        System.out.print("Ingrese la fecha de creación: ");
        String fechaCreacion = scanner.next();

        
        Usuario usuario = new Usuario(nombreCompleto, nickname, clave, tipo, fechaCreacion);
        usuarios.put(nickname, usuario);
        System.out.println("Usuario " + nickname + " agregado exitosamente.");

    }

    private static void buscarUsuario() {
        System.out.print("Ingrese el nickname del usuario a buscar: ");
        String nickname = scanner.nextLine();
        Usuario usuario = usuarios.get(nickname);
        if (usuario != null) {
            System.out.println("Usuario encontrado:\n" + usuario.getDatos());
        } else {
            System.out.println("Usuario no encontrado.");
        }
    }

    private static void eliminarUsuario() {
        System.out.print("Ingrese el nickname del usuario a eliminar: ");
        String nickname = scanner.next();
        if (usuarios.remove(nickname) != null) {
            System.out.println("Usuario " + nickname + " eliminado exitosamente.");
        } else {
            System.out.println("Usuario no encontrado.");
        }
    }
}