package clas01;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        var numero = sc.nextInt();
        var doble = Math.pow(numero, 2);
        var triple = Math.pow(numero, 3);
        System.out.println("El doble del número es " + doble + " y el triple del número es: " + triple);
        sc.close();
    }
}