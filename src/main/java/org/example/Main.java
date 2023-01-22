package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Calculadora imc = new Calculadora();
        Scanner entrada = new Scanner(System.in);
        /*System.out.println("Indica cual es tu genero : /n1 Hombre (H) /n2 Mujer (M) ");
        String genero = entrada.nextLine();*/
        System.out.println("Hola, introduce tu nombre ");
        String nombre = entrada.nextLine();
        System.out.println("Hola " + nombre + " " + "Introduce tu altura ");
        int altura = entrada.nextInt();
        if (altura < 0 || altura >= 3) {
            System.out.println("Introduce una altura correcta ");
        }
    }
}