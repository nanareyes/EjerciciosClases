package clas01;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.println("Introduce los °C: ");
        var numero = sc.nextInt();
        var fahrenheit = 32 + (9 * numero / 5);
        System.out.println("La equivalencia a grados fahrenheit es:  " + fahrenheit + "°");
        sc.close();

    }
}
