//******************************************
// UNIVERSIDAD DEL VALLE DE GUATEMALA
// DEPARTAMENTO DE CIENCIA DE LA COMPUTACIÓN
// CC2008 - 50
// AUTOR: María Alejandra Martinez Vásquez
// FECHA: Agosto 19 2023
// DESCRIPCIÓN: 
//		Ejercicio 3: Overloading y relaciones entre clases
//              
//******************************************

import java.util.Random;
import java.util.Scanner;

public class Formula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al sistema de boletos para Formula 1");
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su número de DPI: ");
        double dpi = scanner.nextDouble();
        scanner.nextLine(); 

        System.out.print("Ingrese su presupuesto ");
        int presupuesto = scanner.nextInt();

        System.out.println("\nLos datos personales ingresados son: ");
        System.out.println("Nombre: " + nombre);
        System.out.println("DPI " + dpi);
        System.out.println("Presupuesto " + presupuesto);

        System.out.print("¿Deseas comprar un boleto? (Sí/No): ");
        String Compra = scanner.nextLine();

        if (Compra.equalsIgnoreCase("Si")) {
        return Boletos;
        }

        else {
        System.out.println("Hasta pronto");
}

public class Boletos {

    public static void main(String[] args) {
        int cantidad = 2; 
        int rango = 15000; 
        int sumaTotal = 0;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        for (int i = 0; i < cantidad; i++) {
            int numero = numeroaleatorio(rango);
            System.out.println("Boleto #" + (i + 1) + ": " + numero);
            sumaTotal += numero;
        }
        
        System.out.println("Boleto: " + sumaTotal);
        
        if (sumaTotal % 2 != 0) {
            System.out.println("Número impar. ¡Usted ha ganado un boleto!");

            int menuboleto = random.nextInt(3);  

            switch (menuboleto) {
                case 0:
                    System.out.println("Localidad 1");
                    System.out.println("su precio es de $300");
                    break;
                case 1:
                    System.out.println("Localidad 5");
                    System.out.println("su precio es de $565");
                    break;
                case 2:
                    System.out.println("Localidad 10");
                     System.out.println("su precio es de $1495");
                    break;
            }
        } 
        
        else {
            System.out.println("Lamentamos informarle que obtuvo un numero par, no ha ganado ningún boleto.");
        }
    }

    public static int numeroaleatorio(int rango) {
        Random random = new Random();
        return random.nextInt(rango) + 1;
    }
    
    public static boolean esImpar(int numero) {
        return numero % 2 != 0;
    
          scanner.close();
    }
}


    }
}