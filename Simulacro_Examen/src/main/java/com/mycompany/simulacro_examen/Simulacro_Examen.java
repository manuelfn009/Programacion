/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.simulacro_examen;

import java.util.Scanner;

/**
 *
 * @author manue
 */
public class Simulacro_Examen {

    public static void main(String[] args) {
        Ejercicio2();
    }

    /*public static void funcion() {
        int x = 0, y = 0;
        final int TAM = 5;
  

        int v[] = new int[TAM];
        v[0] = 5;
        v[1] = 7;
        v[2] = 1;
        v[3] = 6;
        v[4] = 3;
        
        for (int z = 0; z < v.length; z++) {
            if (v[z] > x) {
                x = v[z];
                y = z;
            }
        }
        System.out.println(y);
     }*/
 /*
    Escribe un programa que almacene los nombres y las notas de los alumnos de una clase para poder realizar las siguientes operaciones:
    ● Cuando el programa se inicia muestra un mensaje de información y:
        ○ pide el número de alumnos y lo almacena
        ○ pide y guarda el nombre y la nota de cada alumn@
    ● Tras realizar lo anterior, se muestra un mensaje indicando que la carga de datos se
    ha completado
    ● Por último, muestra un menú que permite las siguientes operaciones:
        ○ 1 - Mostrar la media de la clase
        ○ 2 - Mostrar el nombre del alumn@ con la nota más alta
        ○ 3 - Mostrar el nombre del alumn@ con la nota más baja
        ○ 4 - Mostrar todos los alumnos y sus notas
        ○ 5 - Salir del programa

     */
    public static void Ejercicio2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce cuantos alumnos hay en clase: ");
        final int TAM = sc.nextInt();
        String v1[] = new String[TAM];
        int v2[] = new int[TAM];

        for (int i = 0; i < TAM; i++) {
            System.out.print("Introduce un nombre: ");
            v1[i] = sc.next();
            System.out.print("Introduce la nota de " + v1[i] + ":");
            v2[i] = sc.nextInt();
        }
        int opc;
        do {
            System.out.println("-----------------------");
            System.out.println("1. Media");
            System.out.println("2. Nota mayor");
            System.out.println("3. Nota menor");
            System.out.println("4. Notas de clase");
            System.out.println("5. Salir");
            System.out.println("-----------------------");
            System.out.print("Introduce una opcion:");
            opc = sc.nextInt();
            int acum = 0;
            int media;
            int num = 0;
            int mayor = 0;
            int menor = 10;
            if (opc >= 1 && opc <= 5) {
                switch (opc) {
                    case 1:
                        for (int i = 0; i < TAM; i++) {
                            acum += v2[i];
                        }

                        media = acum / TAM;
                        System.out.println("La media de la clase es " + media);
                        break;
                    case 2:
                        String nomba = v1[0];
                        for (int i = 0; i < TAM; i++) {
                            if (v2[i] > mayor) {
                                mayor = v2[i];
                                nomba = v1[i];
                            }

                        }
                        System.out.println("El alumno con la nota mas alta es " + nomba);
                        break;
                    case 3:
                        String nombb = v1[0];
                        for (int i = 0; i < TAM; i++) {

                            if (v2[i] < menor) {
                                menor = v2[i];
                                nombb = v1[i];
                            }
                            System.out.println("El alumno con la nota mas baja es " + nombb);
                        }
                        break;
                    case 4:
                        System.out.println("Alumn@ - Nota");
                        System.out.println("-------------");
                        for (int cont = 0; cont < TAM; cont++) {
                            System.out.print(v1[cont] + " - ");
                            System.out.println(v2[cont]);
                        }
                        break;
                    case 5:
                        System.out.println("Adios.");
                        break;
                }
            }else{
                System.out.println("Opcion icorrecta.");
            }

        } while (opc != 5);
    }
}
