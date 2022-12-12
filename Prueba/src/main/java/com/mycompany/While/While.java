/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.While;

import java.util.Scanner;


/**
 *
 * @author manue
 */
public class While {
    public static void main(String[] args) {
        menu();
    }
    
    public static void menu(){
        Scanner op = new Scanner(System.in);
        System.out.println("-----------------------");
        System.out.println("1. numeros del uno al cien (while)");
        System.out.println("2. numeros del uno al cien (for)");
        System.out.println("3. numeros del uno al cien (do // while)");
        System.out.println("4. numeros del uno al que se elija");
        System.out.println("5. Haz la media");
        System.out.println("6. Adivina el nombre");
        System.out.println("7. Dados");
        System.out.println("8. Calculadora");
        System.out.println("-----------------------");
        System.out.print("Introduce una opcion:");
        int opc = op.nextInt();
        switch (opc)  {
            case 1 -> uacwhi();
            case 2 -> ucfor();
            case 3 -> uacdowhi();
            case 4 -> uaqsd();
            case 5 -> media();
            case 6 -> nombre();
            //case 7 -> dados();
            case 8 -> calculadora();
            
        }
        
    }
     public static void uacwhi(){
         int n=0;
         while (n<=100) {
             System.out.println("Numero " + n);
             n++;
                   
         }   
     }
     
      public static void ucfor(){
         for (int n=0; n<=100; n++) {
             System.out.println("Numero " + n);
                            
         }}
      
      public static void uacdowhi(){
         for (int n=0; n<=100; n++) {
             System.out.println("Numero " + n);
                            
         }}
      
       public static void uaqsd(){
          Scanner num=new Scanner(System.in);
          System.out.print("Introduce un numero:");
          int n = num.nextInt();
         for (int y=0; y<=n; y++) {
             System.out.println("Numero " + y);
                  
         }}
       
       public static void media(){
          Scanner num=new Scanner(System.in);
          System.out.print("Introduce un numero:");
          int n = num.nextInt();
          
         }
       
       public static void nombre(){
          
          int i=0;
          while (i!=1){
            Scanner num=new Scanner(System.in);
            System.out.print("Introduce un nombre, intentando adivinar el mío :");
            String n = num.next();
            String nombre="Manuel";
            if (nombre.equals(n)){
                System.out.println("Correcto");
                i=1;
            }else{
                System.out.println("Nombre incorrecto, intentelo de nuevo.");
            
            }
              
            }
          
         }
       
       /*public static void dados(){
           int dado1,dado2;
           String parar="";
           Scanner num=new Scanner(System.in);
           do{
           dado1= (int) (Math.random()*6+1);
           dado2= (int) (Math.random()*6+1);
            System.out.print("Dado 1: "+dado1);
            System.out.print("Dado 2: "+dado1);
            System.out.print("Resultado: "+(dado1+dado2));
            if (dado1==dado2){
                
            }
        
       }*/
       
       public static void calculadora(){
           int opcion;
           do{
               System.out.println("-------CALCULADORA-------");
               System.out.println("0. Salir");
               System.out.println("1. Sumar");
               System.out.println("2. Restar");
               System.out.println("3. Dividir");
               System.out.println("4. Multiplicar");
               System.out.println("-------------------------");

               Scanner sc = new Scanner(System.in);
               opcion = sc.nextInt();
               int n1 = 0, n2 = 0;

               if(opcion>=0 && opcion<=4){
                   System.out.print("Introduce el primer numero.");
                   Scanner num1 = new Scanner(System.in);
                   n1= num1.nextInt();
                   System.out.print("Introduce el segundo numero.");
                   Scanner num2 = new Scanner(System.in);
                   n2= num2.nextInt();
               }

               switch (opcion) {
                   case 1:
                       System.out.println("El resultado de " + n1 + "+" + n2 + " es " +(n1+n2));
                       break;
                   case 2:
                       System.out.println("El resultado de " + n1 + "-" + n2 + " es " +(n1-n2));
                       break;
                   case 3:
                       System.out.println("El resultado de " + n1 + "/" + n2 + " es " +(n1/n2));
                       break;
                   case 4:
                       System.out.println("El resultado de " + n1 + "*" + n2 + " es " +(n1*n2));
                       break;
                   case 0:
                       System.out.println("Hasta luego!");
                       break;
                   default:
                       System.out.println("No has elegido una opcion valida.");
                       break;
               }
         
      
           }while(opcion!=0);
           
       }
           
           
}
