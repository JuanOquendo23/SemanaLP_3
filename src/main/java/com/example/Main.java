package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
    Scanner cantidadCompra = new Scanner(System.in);
    System.out.println("Ingrese la cantidad de compra: ");
    double valor1 = cantidadCompra.nextDouble();

    cantidadCompra.close();

    int puntosAcumulados = (int) (valor1 / 10);

    System.out.println("puntos acumulados: " + puntosAcumulados);

    // niveles

    String nivelFidelizacion;

    if (puntosAcumulados <= 100) {
      nivelFidelizacion = "bronce";
    } else if (puntosAcumulados <= 500) {
      nivelFidelizacion = "plata";
    } else if (puntosAcumulados <= 1000) {
      nivelFidelizacion = "oro";
    } else {
      nivelFidelizacion = "platino";
    }

    System.out.println("Tu nivel de fidelizacion es: " + nivelFidelizacion);

    // Descuentos

    if (nivelFidelizacion.equals("oro") || nivelFidelizacion.equals("platino")) {
      System.out.println("Felicidades has ganado un descuento del 10% en tus proximas compras");

    }
   if (nivelFidelizacion.equals("platino")) {System.out.println("Felicidades has ganado un cupon para tu proximo producto");
    
   }
  }
    }
