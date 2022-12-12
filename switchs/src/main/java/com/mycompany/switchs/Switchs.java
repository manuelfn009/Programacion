/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.switchs;

import java.util.Scanner;

/**
 *
 * @author manue
 */
public class Switchs {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner op = new Scanner(System.in);
        System.out.println("-----------------------");
        System.out.println("1. Mes");
        System.out.println("2. Areas");
        System.out.println("3. Notas de evaluaciones");
        System.out.println("-----------------------");
        System.out.print("Introduce una opcion:");
        int opc = op.nextInt();
        switch (opc) {
            case 1 ->
                mes();
            case 2 ->
                area();
            case 3 ->
                notas();

        }

    }

    /*Escribe un programa que lea una variable entera mes (un valor entre
    1 y 12) y compruebe si el valor corresponde a un mes de 30 días, de 31 o
    de 28. Supondremos que febrero tiene 28 días. Se mostrará además el
    Ejercicios de programación
    5
    nombre del mes. Se debe comprobar que el valor introducido esté
    comprendido entre 1 y 12. */
    
    public static void mes() {
        int nmes;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduce un numero de mes del 1 al 12.");
            nmes = sc.nextInt();
        } while (nmes < 1 || nmes > 12);

        switch (nmes) {
            case 1:
                System.out.println("El mes es enero. El mes tiene 31 dias.");
                break;
            case 2:
                System.out.println("El mes es febrero. El mes tiene 28 dias");
                break;
            case 3:
                System.out.println("El mes es marzo. El mes tiene 31 dias.");
                break;
            case 4:
                System.out.println("El mes es abril. El mes tiene 30 dias.");
                break;
            case 5:
                System.out.println("El mes es mayo. El mes tiene 31 dias.");
                break;
            case 6:
                System.out.println("El mes es junio. El mes tiene 30 dias.");
                break;
            case 7:
                System.out.println("El mes es julio. El mes tiene 31 dias.");
                break;
            case 8:
                System.out.println("El mes es agosto. El mes tiene 31 dias.");
                break;
            case 9:
                System.out.println("El mes es septiembre. El mes tiene 30 dias.");
                break;
            case 10:
                System.out.println("El mes es octubre. El mes tiene 31 dias.");
                break;
            case 11:
                System.out.println("El mes es noviembre. El mes tiene 30 dias.");
                break;
            case 12:
                System.out.println("El mes es diciembre. El mes tiene 31 dias.");
                break;

        }

    }

    /*Diseña un programa que realice la opción seleccionada de acuerdo con
    el siguiente menú:
    a.- Área del triángulo (Solicitar base y altura)
    b.- Área del Cuadrado (Solicitar lado)
    c.- Área del Círculo (Solicitar radio)
    d.- Área del Rectángulo (Solicitar base y altura)
    ¡¡Nota!! Es decir, si el usuario pulsa la letra o carácter ‘a’ el programa pide al
    usuario que introduzca la base y altura del triángulo y calcula su área.*/
    
    public static void area() {
        Scanner sc = new Scanner(System.in);
        System.out.println("a.- Área del triángulo");
        System.out.println("b.- Área del Cuadrado");
        System.out.println("c.- Área del Círculo");
        System.out.println("d.- Área del Rectángulo");
        String opc;

        do {
            System.out.print("Introduce una opcion: ");
            opc = sc.next();
            opc.toLowerCase();
        } while (!opc.equals("a") || !opc.equals("b") || !opc.equals("c") || !opc.equals("d"));

        switch (opc) {
            case "a":
                System.out.print("Introduce la base:");
                int bas = sc.nextInt();
                System.out.print("Introduce la altura:");
                int alt = sc.nextInt();
                System.out.println("El area del triangulo es " + (bas * alt / 2));
                break;

            case "b":
                System.out.print("Introduce el lado:");
                int lado = sc.nextInt();
                System.out.println("El area del cuadrado es " + (Math.pow(lado, 2)));
                break;

            case "c":
                System.out.print("Introduce el radio:");
                int r = sc.nextInt();
                System.out.println("El area del cuadrado es " + (Math.PI * Math.pow(r, 2)));
                break;

            case "d":
                System.out.print("Introduce la base:");
                int basr = sc.nextInt();
                System.out.print("Introduce la altura:");
                int altr = sc.nextInt();
                System.out.println("El area del triangulo es " + (basr * altr));
                break;

        }
    }
    
    /*Escribe un programa que pida la nota de las tres evaluaciones, y si
    están aprobadas realizar la media para calcular la nota final. Evaluación
    aprobada >= 5. Si no, escribe que evaluación debe recuperar.*/
    
    public static void notas(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la nota de la primera evaluacion: ");
        int ev1 = sc.nextInt();
        System.out.print("Introduce la nota de la segunda evaluacion: ");
        int ev2 = sc.nextInt();
        System.out.print("Introduce la nota de la tercera evaluacion: ");
        int ev3 = sc.nextInt();
        
        if(ev1>=5 && ev2>=5 && ev3>=5){
            System.out.println("Has aprobado todas las evaluaciones y la media es: " + (ev1+ev2+ev3)/3);
        }else{
            if (ev1<5) {
                System.out.println("Debes que recuperar la primera evaluacion.");
            }
            if (ev2<5) {
                System.out.println("Debes que recuperar la segunda evaluacion.");
            }
            if (ev3<5) {
                System.out.println("Debes que recuperar la tercera evaluacion.");
            }
        }
    }

}
