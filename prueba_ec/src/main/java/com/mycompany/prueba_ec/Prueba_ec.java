/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.prueba_ec;

import java.util.Scanner;

/**
 *
 * @author manue
 */
/*
Realizar la simulación de un cajero automático para el caso particular de un cliente que ya se ha identificado y
tiene 2350€ en la cuenta, de modo que las opciones que tiene son:

	1 - Sacar dinero
	2 - Ingresar dinero
	3 - Consultar saldo
	4 - Solicitar préstamo
	5 - Salir

Detalle:
 1) Cuando el usuario elige sacar dinero se debe preguntar cuánto quiere sacar. 
Hay que tener en cuenta que no puede sacar más dinero del que posee en la cuenta.
 2) Cuando el usuario elige Ingresar dinero no puede ingresar más de 1000€.
 3) la consulta del saldo muestra en pantalla el saldo actual de la cuenta.
 4) Si solicita un présatmo, hay que pedir la cantidad que solicita y si esa cantidad no supera 
el doble de dinero de la cuenta, se le concederá. En caso contrario, no.
 5) Cuando se seleccione una de las acciones anteriores, al finalizar se debe volver a preguntar 
qué opción desea realizar hasta que se seleccione la opción 5, que finaliza el programa.
 */

public class Prueba_ec {

    public static void main(String[] args) {
        int opc;
        int d = 2350;
        do {
            Scanner op = new Scanner(System.in);

            System.out.println("1 - Sacar dinero");
            System.out.println("2 - Ingresar dinero");
            System.out.println("3 - Consultar saldo");
            System.out.println("4 - Solicitar préstamo");
            System.out.println("5 - Salir");

            System.out.print("Introduce que desea hacer: ");
            opc = op.nextInt();

            if (opc >= 1 && opc <= 5) {

                switch (opc) {

                    case 1:

                        System.out.print("¿Cuanto dinero desea sacar? ");
                        int dine = op.nextInt();
                        if (dine <= d) {
                            System.out.println("Ha sacado " + dine + "€");
                            d = d - dine;
                        } else {
                            System.out.println("No dispone del saldo suficiente.");
                        }
                        break;

                    case 2:
                        System.out.print("¿Cuanto dinero desea ingresar? ");
                        int dinmas = op.nextInt();
                        if (dinmas <= 1000) {
                            System.out.println("Ha ingresado " + dinmas + "€");
                            d = d + dinmas;
                        } else {
                            System.out.println("No puede ingresar mas de 1000€.");
                        }
                        break;

                    case 3:
                        System.out.println("Tienes " + d + "€ en tu cuenta");
                        break;

                    case 4:
                        System.out.println("¿Que cantidad quieres tener de prestamo?");
                        int pres = op.nextInt();
                        int doble = d * 2;
                        if (pres > doble) {
                            System.out.println("No puedes introducir esa cantidad porque supera el doble de tu saldo.");
                        }else d=d+pres;
                        break;

                    case 5:
                        System.out.println("Adiós");
                        break;

                }
            } else {
                System.out.println("Has introducido una opcion incorrecta");
            }
        } while (opc != 5);
    }
}
