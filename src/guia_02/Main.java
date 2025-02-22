package guia_02;

import java.util.Arrays;
import java.util.Scanner;


public class Main {


    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int selected;

        do {
            selected = menu();
            switch (selected) {
                case 1:
                    Autor autor = new Autor("Joshua", "Bloch", "joshua@email.com", 'M');
                    Autor[] autores = new Autor[3];
                    autores[0] = autor;
                    System.out.println("Autor Princial");
                    System.out.print(autor);
                    System.out.println("\n");
                    Libro libro = new Libro("Effective Java", 450, 150, autores);
                    System.out.println("Datos iniciales del Libro\n");
                    System.out.println(libro);
                    System.out.println("\n");
                    libro.cambioPrecio();
                    libro.cambioStock();
                    System.out.println(libro);
                    System.out.println(libro.mostrarMensaje());
                    Autor autor1 = new Autor("Alan", "Brado", "Semtex@gmail.com", 'M');
                    Autor autor2 = new Autor("Esteban", "Kito", "demadera@hotmail.com", 'M');
                    autores[1] = autor1;
                    autores[2] = autor2;
                    Libro libro1 = new Libro("Effective Java", 500, 200, autores);
                    System.out.println(libro1);
                    Pausa.pausar();
                    limpiarPantalla();
                    break;
                case 2:
                    System.out.println("Datos del CLiente: ");
                    Cliente cliente = new Cliente("Aron", "nassa@gmail.com", 0.20);
                    Venta[] ventas = new Venta[2];
                    System.out.println(cliente.toString());
                    Venta venta1 = new Venta("Pan", "Pan rallado", 200);
                    ventas[0] = venta1;
                    Venta venta2 = new Venta("Leche", "Leche descremada", 300);
                    ventas[1] = venta2;
                    System.out.println("\nDatos de La Facturacion: ");
                    Factura factura1 = new Factura(cliente, ventas);
                    System.out.println(factura1);
                    System.out.println("Monto Total de la Compra: " + factura1.totalCompra());
                    System.out.println("Monto de la compra con Descuento: " + factura1.totalDescuento());


                    System.out.println("\n");


                    Pausa.pausar();
                    limpiarPantalla();
                    break;
                case 3:
                    Banco titular = new Banco("Pablo Perez", 'M');
                    Cuenta cuenta = new Cuenta(10000, titular);
                    System.out.println(cuenta);

                    System.out.println("\nDeposito 150.50, el balance es " + cuenta.depositar(150.50) + "\n");
                    System.out.println("Retiro 150, el balance es " + cuenta.extraer(150) + "\n");
                    System.out.println("Retiro 11000.50, el balance es " + cuenta.extraer(11000.50) + "\n");
                    System.out.println("Deposito 1250.50, el balance es " + cuenta.depositar(1250.50) + "\n");

                    System.out.println("\nOperaciones realizadas:");
                    for (String ops : cuenta.getOperaciones()) {
                        if (ops != null) System.out.println(ops);
                    }

                    Pausa.pausar();
                    limpiarPantalla();

                case 0:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    limpiarPantalla();
                    System.out.println("¡¡¡Ejercicio Inexistente.!!!");
                    Pausa.pausar();
                    limpiarPantalla();
                    break;
            }
        } while (selected != 0);
    }


    public static int menu() { // Menu
        System.out.println("\n\t____________________________________________________________________");
        System.out.println("\n");
        System.out.println("\t    GUIA 00: INTRODUCCION A JAVA.");
        System.out.println("\n\t____________________________________________________________________");
        System.out.println("\n");
        System.out.println("\t    MENU");
        System.out.println("\n\t____________________________________________________________________");
        System.out.println("\n");
        System.out.println("\t   [1].Ejercicio 01.");
        System.out.println("\t   [2].Ejercicio 02.");
        System.out.println("\t   [3].Ejercicio 03.");
        System.out.println("\n\t____________________________________________________________________");
        System.out.println("\n");
        System.out.println("\t   [0].Salir del programa.");
        System.out.println("\n\t____________________________________________________________________");
        System.out.println("\n\n\t  Elija una opcion: ");
        System.out.println("\n");
        int input = scan.nextInt();
        return input;
    }


    public static void limpiarPantalla() {         // se dejan 60 espacios creando una especie de cls de la consola
        for (int i = 0; i < 2; i++) {
            System.out.println("\n");
        }
    }


    public static class Pausa {
        public static void pausar() {
            System.out.println("\n");
            System.out.println(" ----------------------------------------");
            System.out.println("|Presionar la tecla ENTER para continuar.|");
            System.out.println(" ----------------------------------------");
            Scanner aceptar = new Scanner(System.in);
            System.out.println("\n");
            aceptar.nextLine(); // queda esperando que precionemos la tecla enter para continuar
        }
    }
}