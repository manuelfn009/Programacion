/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.repaso;

import java.util.Scanner;

/**
 *
 * @author manue
 */
public class Repaso {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Ejercicio 1");
        System.out.println("2. Ejercicio 2");
        System.out.println("3. Ejercicio 3");
        System.out.print("Introduce una opcion:");
        int opc = sc.nextInt();
        switch (opc) {
            case 1:
                Ejercicio1();
            case 2:
                Ejercicio2();
            case 3:
                Ejercicio3();
        }

    }

    /*
    1.) Realiza un procedimiento que pida al usuario un tamaño que se usará
    para crear dos arrays con esa longitud. Se cargarán con los datos que
    introduzca el usuario y devolverá la cantidad de valores posicionales
    iguales, es decir, aquellos que tienen mismo índice y contenido.
     */
    public static void Ejercicio1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce de que tamaño quieres que sean los vectores: ");
        final int TAM = sc.nextInt();
        int v1[] = new int[TAM];
        int v2[] = new int[TAM];

        for (int i = 0; i < TAM; i++) {
            System.out.print("Introduce un numero para v1: ");
            v1[i] = sc.nextInt();
        }

        for (int i = 0; i < TAM; i++) {
            System.out.print("Introduce un numero para v2: ");
            v2[i] = sc.nextInt();
        }

        int cont = 0;
        for (int i = 0; i < TAM; i++) {
            if (v1[i] == v2[i]) {
                cont++;
            }

        }
        System.out.println("Hay " + cont + " numeros posicionales");
    }

    /*
     2.) Realiza un procedimiento que pida al usuario un tamaño que se usará
    para crear un array con esa longitud. Se cargarán con los datos que
    introduzca el usuario y mostrará cuántos números son positivos, cuántos 
    negativos y cuántos son cero.
     */
    public static void Ejercicio2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce de que tamaño quieres que sea el vector: ");
        final int TAM = sc.nextInt();
        int v[] = new int[TAM];

        //carga del array
        for (int i = 0; i < TAM; i++) {
            System.out.print("Introduce un numero para v: ");
            v[i] = sc.nextInt();
        }

        //numeros negativos
        int contneg = 0;
        for (int i = 0; i < TAM; i++) {
            if (v[i] < 0) {
                contneg++;
            }
        }
        System.out.println("Hay " + contneg + " numeros negativos");

        //numeros positivos
        int contpos = 0;
        for (int i = 0; i < TAM; i++) {
            if (v[i] > 0) {
                contpos++;
            }
        }
        System.out.println("Hay " + contpos + " numeros positivos");

        //numeros 0
        int cont0 = 0;
        for (int i = 0; i < TAM; i++) {
            if (v[i] == 0) {
                cont0++;
            }
        }
        System.out.println("Hay " + cont0 + " numeros 0");

    }

    /*
     3.) Realiza un procedimiento para leer la altura de N personas y una vez
    calculada la altura media, decir si hay más personas con altura superior 
    a la media, si es al contrario o si hay las mismas.
     */
    public static void Ejercicio3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce de cuantas personas quieres que se lea la altura: ");
        final int TAM = sc.nextInt();
        int v[] = new int[TAM];

        for (int i = 0; i < TAM; i++) {
            System.out.print("Introduce una altura en cm (Ej: 167) ");
            v[i] = sc.nextInt();
        }

        //Calculo de la altura media
        int media;
        int acum = 0;
        for (int i = 0; i < TAM; i++) {
            acum += v[i];
        }

        media = acum / TAM;
        System.out.println("La media de altura es " + media);

        //calculo de personas que supera, iguala o es inferior a la media
        int contmay = 0;
        int continf = 0;
        for (int i = 0; i < TAM; i++) {
            if (v[i] > media) {
                contmay++;
            } else if (v[i] < media) {
                continf++;
            }
        }

        if (continf == contmay) {
            System.out.println("Hay el mismo numero de personas que la superan y que no.");
        } else if (continf < contmay) {
            System.out.println("Hay mas personas que superan la media.");
        } else {
            System.out.println("Hay mas personas por debajo de la media.");
        }

    }
}
