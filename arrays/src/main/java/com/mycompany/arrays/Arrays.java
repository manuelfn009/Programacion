/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.arrays;

import java.util.Scanner;

/**
 *
 * @author manue
 */
public class Arrays {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner op = new Scanner(System.in);
        System.out.println("-----------------------");
        System.out.println("1. Array 1 (Media)");
        System.out.println("2. Array 2 (Numeros Primos)");
        System.out.println("3. Array 3 (¿Arrays iguales?)");
        System.out.println("4. Array 4 (¿Pertenece un numero al array?)");
        System.out.println("5. Array 5 (¿Pertenece un nombre al array?)");
        System.out.println("6. Array 6 (¿Cuantas veces aparece un nombre en el array?)");
        System.out.println("7. Array 7 (Ordenar array)");
        System.out.println("-----------------------");
        System.out.print("Introduce una opcion: ");
        int opc = op.nextInt();
        switch (opc) {
            case 1 ->
                array1();
            case 2 ->
                array2();
            case 3 ->
                array3();
            case 4 ->
                array4();
            case 5 ->
                array5();
            case 6 ->
                array6();

        }
    }

    public static void array1() {
        final int TAM = 5;
        Scanner sc = new Scanner(System.in);

        int v[] = new int[TAM];

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce la posicion " + i + " del vector: ");
            v[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("La posicion " + i + " de v contiene: " + v[i]);
        }

        int acum = 0;
        int media;
        //CALCULAR LA MEDIA

        for (int i = 0; i < TAM; i++) {
            acum += v[i];
        }

        media = acum / TAM;
        System.out.println("La media del vector es " + media);

    }

    //ARRAY QUE MUESTRE LOS NUMEROS PRIMOS QUE SE ENCUENTRAN EN ESE ARRAY
    public static boolean esPrimo(int n) {
        boolean result = true;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                result = false;
            }
        }
        return result;

    }

    public static void array2() {
        final int TAM = 5;
        Scanner sc = new Scanner(System.in);

        int v[] = new int[TAM];

        for (int i = 0; i < TAM; i++) {
            System.out.print("Introduce la posicion " + i + " del vector: ");
            v[i] = sc.nextInt();
        }

        int cont = 0;
        for (int i = 0; i < TAM; i++) {
            if (esPrimo(v[i])) {
                cont++;
                System.out.println("El valor " + v[i] + " es primo.");
            } else {
                System.out.println("El valor " + v[i] + " no es primo.");
            }
        }
        System.out.println("Hay " + cont + " primos en el vector");

    }

    //CREAR UN PROCEDIMIENTO QUE PIDA AL USUARIO QUE CARGUE DOS VECTORES DE 4 POSICIONES Y DIGA SI SON IGUALES
    public static void array3() {
        final int TAM = 4;
        Scanner sc = new Scanner(System.in);

        int v[] = new int[TAM];
        int b[] = new int[TAM];

        for (int i = 0; i < TAM; i++) {
            System.out.print("Introduce la posicion " + i + " del vector: ");
            v[i] = sc.nextInt();
        }

        for (int i = 0; i < TAM; i++) {
            System.out.print("Introduce la posicion " + i + " del vector: ");
            b[i] = sc.nextInt();
        }

    }

    //CREAR UNA FUNCION QUE RECIBA UN ARRAY DE NUMEROS ENTEROS Y UN NUMERO Y DIGA SI ESE NUMERO SE ENCUENTRA DENTRO DEL ARRAY
    public static boolean contiene(int v[], int n) {
        boolean result = false;

        for (int i = 0; 1 < v.length; i++) {
            if (v[i] == n) {
                result = true;
            }
        }

        return result;

    }

    public static void array4() {
        final int TAM = 4;
        int v[] = new int[TAM];
        
        v[0] = 2;
        v[1] = 5;
        v[2] = 3;
        v[3] = 1;
        

        if (contiene(v, 2)) {
            System.out.println("El numero 2 esta en el vector.");
        } else {
            System.out.println("El numero 2 no esta en el vector");
        }

    }

    //CREAR UNA FUNCION QUE RECIBA UN ARRAY DE NOMBRES Y UN NOMBRE Y DIGA SI ESE NOMBRE SE ENCUENTRA DENTRO DEL ARRAY
    public static boolean contieneS(String v[], String n) {
        boolean result = false;

        for (int i = 0; i < v.length; i++) {
            if (v[i].equals(n)) {
                result = true;
            }
        }

        return result;

    }

    public static void array5() {
        Scanner sc = new Scanner(System.in);
        String v[] = new String[5];
 
        for (int i = 0; i < v.length; i++) {
            System.out.println("Introduce la posicion un nombre ");
            v[i] = sc.nextLine();
        }
        System.out.println("Introduce un nombre a comprobar.");
        
        if (contieneS(v, sc.nextLine())) {
            System.out.println("El nombre esta en el vector.");
        } else {
            System.out.println("El nombre no esta en el vector.");
        }

    }
    
    //CREAR UNA FUNCION QUE RECIBA UN ARRAY DE NOMBRES Y UN NOMBRE Y DIGA SI ESE NOMBRE SE ENCUENTRA DENTRO DEL ARRAY Y CUANTAS VECES ESTA
    
    public static int veces(String v[], String n) {
        int cont = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i].equals(n)) {
                cont++;
            }
        }
        return cont;
    }

    public static void array6() {
        Scanner sc = new Scanner(System.in);
        String v[] = new String[5];
 
        for (int i = 0; i < v.length; i++) {
            System.out.println("Introduce la posicion un nombre ");
            v[i] = sc.nextLine();
        }
        System.out.println("Introduce un nombre a comprobar.");
      
       
            System.out.println("El nombre esta en el vector " + veces(v, sc.nextLine()) + " veces.");
        
        
    }
    
    //ORDENAR NUMERICAMENTE UN ARRAY
    
    public static void array7() {
    final int TAM = 4;
        Scanner sc = new Scanner(System.in);

        int v[] = new int[TAM];
        
        for (int i = 0; i < TAM; i++) {
            System.out.print("Introduce la posicion " + i + " del vector: ");
            v[i] = sc.nextInt();
        }
        
        
    }
    
    //CONCATENAR ARRAYS
    
    public static void mostrarVector(int[] v) {
        for (int i : v) {
            System.out.print(i + "  ");
        }
    }
    
    public static void concatenarVectores(){
        int v1[] = {2,1,3};
        int v2[] = {5,7};
        
        int tam = v1.length + v2.length;        
        int v3[] = new int[tam];
        
        for (int i = 0; i < v1.length; i++) {
            v3[i] = v1[i];
        }
        for (int i = v1.length; i < tam; i++) {
            v3[i] = v2[i-v1.length];
        }
        mostrarVector(v3);
    }
}
