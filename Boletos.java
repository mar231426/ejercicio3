import java.util.Random;
import java.util.Scanner;

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

