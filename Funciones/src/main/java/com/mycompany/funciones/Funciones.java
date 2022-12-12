/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.funciones;

import java.util.Scanner;

/**
 *
 * @author manue
 */
public class Funciones {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner op = new Scanner(System.in);
        System.out.println("-----------------------");
        System.out.println("1. Fibonacci");
        System.out.println("2. Numero al reves");
        System.out.println("3. Piramide de *");
        System.out.println("4. Numeros del 1 al 10");
        System.out.println("-----------------------");
        System.out.print("Introduce una opcion: ");
        int opc = op.nextInt();
        switch (opc) {
            case 1 ->
                fibonacci();
            case 2 -> {
                Scanner sc = new Scanner(System.in);
                System.out.println("Introduce un num y te muestro el num al reves");
                int n = sc.nextInt();
                numreves(n);
            }
            case 3 ->{
                Scanner sc = new Scanner(System.in);
                System.out.println("Nivel de piramide: ");
                int alt = sc.nextInt();
                int c = 0;
                piramide(alt,c);
            }
            case 4 ->{
                int cont = 1;
                
                del1al10(cont);
            }
        }

    }

    /*
    Calcular el enesimo termino de la serie fibonacci
     */
    public static void fibonacci() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce cuantos numeros de la serie Fibonacci quieres ver.");
        int opc = sc.nextInt();
        int t1 = 0;
        int t2 = 1;

        for (int veces = 0; opc > veces; veces++) {
            System.out.println("Los primeros " + opc + " numeros de la serie son:");
            System.out.print(t1 + " ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;

        }

    }

    public static void numreves(int n) {

        if (n < 10) {
            System.out.println(n);

        } else {
            int rest = n % 10;
            System.out.print(rest);
            numreves(n / 10);

        }
    }
    
    public static void piramide(int alt, int c) {
        
        for (int i = 0; i < c; i++){
            System.out.print("* ");
        }
        System.out.println(" ");
        if (c<alt) 
            piramide(alt,c+1);
        
        
    }
    
    public static void del1al10(int cont) {
              
        if (cont<=10){
            System.out.print(cont + " ");
            del1al10(cont+1);
            
            
        }
             
       
    }
}
