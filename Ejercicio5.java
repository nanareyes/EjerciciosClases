package clas01;

import java.util.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.println("Introduce un número entero: ");
        var numero = sc.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El número es par");
        }

        else {
            System.out.println("El número es impar");
            sc.close();
        }
    }
}
