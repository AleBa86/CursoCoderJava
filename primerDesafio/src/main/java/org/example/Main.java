package org.example;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor ingresa el numero a analizar: ");
        float numeroIngresado = scanner.nextFloat();
        String str = String.valueOf(numeroIngresado);
        int numeroEntero = Integer.parseInt(str.substring(0, str.indexOf(46)));
        float numeroDecimal = Float.parseFloat(str.substring(str.indexOf(46)));
        System.out.println("Esta es la parte entera del numero ingresado: " + numeroEntero);
        System.out.println("Esta es la parte dec del numero ingresado: " + numeroDecimal);
    }
}