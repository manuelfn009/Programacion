/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.prueba;

import java.util.Scanner;


/**
 *
 * @author manue
 */
public class Prueba {

    public static void main(String[] args) {
        menu();
    }
    
    public static void menu(){
        Scanner op = new Scanner(System.in);
        System.out.println("-----------------------");
        System.out.println("1. Sumar");
        System.out.println("2. Nombre");
        System.out.println("3. Mayor menor");
        System.out.println("4. Par impar");
        System.out.println("5. Divisiones");
        System.out.println("6. Potencia");
        System.out.println("7. Triángulo");
        System.out.println("8. Presupuesto de viaje");
        System.out.println("9. Salario");
        System.out.println("10. Cumpleaños");
        System.out.println("-----------------------");
        System.out.print("Introduce una opcion:");
        int opc = op.nextInt();
        switch (opc)  {
            case 1 -> sumar();
            case 2 -> nombre();
            case 3 -> mayormenor();
            case 4 -> parimpar();
            case 5 -> divisiones();
            case 6 -> potencia();
            case 7 -> triangulo();
            case 8 -> instituto();
            case 9 -> salario();
            case 10 -> cumpleaños();
            
        }
    }
    
    public static void sumar() {
        Scanner leer = new Scanner(System.in);
       
        int y, x;
        
        System.out.print("Introduce un numero: ");
        x= leer.nextInt();
        
        System.out.print("Introduce otro numero: ");
        y= leer.nextInt();
        
        System.out.println(x + " * " + y + " es " + x*y);
    }
      
    public static void nombre() {
                
       Scanner leer = new Scanner(System.in);
       String nombre;
       System.out.println("Introduce un nombre:");
       nombre = leer.nextLine();
        System.out.println("Tu nombre es " + nombre);

    }
       
    public static void mayormenor() {
    Scanner num = new Scanner(System.in);
      
      int num1, num2;
      
      System.out.print("Introduce un numero: ");
      num1= num.nextInt();
      
      System.out.print("Introduce otro numero: ");
      num2= num.nextInt();
       
      if (num1==num2) {
          System.out.print("Los números son iguales");
      }
       
      if (num1<num2) {
          System.out.print("El numero mayor de " + num1 + " y " + num2 + " es " + num2);
      }
       
      if (num1>num2) {
          System.out.print("El numero mayor de " + num1 + " y " + num2 + " es " + num1);
      }
    }

    public static void parimpar(){
      Scanner num = new Scanner(System.in);
      
      int num1;
      
      System.out.print("Introduce un numero: ");
      num1= num.nextInt();
     
      if (num1%2==0){
          System.out.print("El numero " + num1 +  " es par ");
      } else  {
                   System.out.print("El numero " + num1 + " es impar ");
                  }
      
    }
    
    public static void divisiones() {
    Scanner num = new Scanner(System.in);
      
      float num1, num2;
      
      System.out.print("Introduce un numero: ");
      num1= num.nextFloat();
      
      System.out.print("Introduce otro numero: ");
      num2= num.nextFloat();
      if (num2 != 0){
        float res=num1/num2;
        System.out.print(num1 + "/" + num2 + " es igual a " + res);
      } else {
        System.out.print("No se puede dividir entre 0. ERROR!");
      }
    }
    
    public static void potencia(){
      Scanner num = new Scanner(System.in);
      
      int num1, num2;
      
      System.out.print("Introduce un numero: ");
      num1= num.nextInt();
      
      System.out.print("Introduce otro numero: ");
      num2= num.nextInt();
      
      if (num2 != 0 && num2>0) {
          double res=Math.pow(num1, num2);
          System.out.print(num1 + " elevado a " + num2 + " es igual a " + res);
      }else {
          if (num2==0){
          System.out.print(num1 + " elevado a " + num2 + " es igual a 1");
          }else{
              double res=Math.pow(num1,num2);
              System.out.print(num1 + " elevado a " + num2 + " es igual a " + res);
          }
      }
    }
    
    public static void triangulo(){
      
      Scanner num = new Scanner(System.in);
      
      int a, b, c;
      
      System.out.print("Introduce la medida del lado a: ");
      a= num.nextInt();
      
      System.out.print("Introduce la medida del lado b: ");
      b= num.nextInt();
      
      System.out.print("Introduce la medida del lado c: ");
      c= num.nextInt();
      
      double a2=Math.pow(a,2);
      double b2=Math.pow(b,2);
      double c2=Math.pow(c,2);
      
      //COMPARO LOS NUMEROS PARA HALLAR EL NUMERO MAYOR
        if (a>b && a>c){
            if (a2==b2+c2){
               System.out.print("El triangulo es rectangulo ");
            }
      }
        else if (b>a && b>c){
          if (b2==a2+c2){
               System.out.print("El triangulo es rectangulo ");
            }
      }
        else if (c>a && b<c){
          if (c2==a2+b2){
               System.out.print("El triangulo es rectangulo ");
            }
      }
    
      if(a==b && b==c){
        System.out.print("El triangulo es equilatero ");
      }
      if(a!=b && b!=c && a!=c){
        System.out.print("El triangulo es escaleno ");
      }
      if(a==b && b!=c || a!=b && b==c || a==c && b!=c){
        System.out.print("El triangulo es isosceles ");
      }
        
    }
    
    public static void instituto(){
      Scanner alu = new Scanner(System.in);
      
      int nal;
      
      System.out.print("Introduce el numero de alumnos que van a ir al viaje: ");
      nal= alu.nextInt();
      
      if (nal>=50)
           System.out.print("El total a pagar con " + nal + " alumnos es de " + nal*40 + "€. Son 40€/alum.");
      else
      
      if (30<=nal && nal<=49)
          System.out.print("El total a pagar con " + nal + " alumnos es de " + nal*48 + "€. Son 48€/alum.");
      
       if (20<=nal && nal<=29)
          System.out.print("El total a pagar con " + nal + " alumnos es de " + nal*56 + "€. Son 56€/alum.");
      
       if (20>nal)
          System.out.print("El total a pagar con " + nal + " alumnos es de 2000€. Son "+ 2000/nal + "€/alum.");
       
    }
    
    public static void salario() {
        Scanner sal = new Scanner(System.in);
      
      int salr;
      
      System.out.print("Introduzca su salario: ");
      salr= sal.nextInt();
      
      if (salr>=0 && salr<=9000){
          int salinc=salr*20/100;
          System.out.print("Su salario se ha incrementado un 20%. Su nuevo salario es: " + (salr+salinc));
           }
      if (salr>=9001 && salr<=15000){
          int salinc=salr*10/100;
          System.out.print("Su salario se ha incrementado un 10%. Su nuevo salario es: " + (salr+salinc));
           }
      if (salr>=15001 && salr<=20000){
          int salinc=salr*5/100;
          System.out.print("Su salario se ha incrementado un 5%. Su nuevo salario es: " + (salr+salinc));
           }
       if (salr>20000){
          int salinc=salr*3/100;
          System.out.print("Su salario se ha incrementado un 3%. Su nuevo salario es: " + (salr+salinc));
           }
    }
    
    public static void cumpleaños(){
         Scanner num = new Scanner(System.in);
      
      int edad;
      
      System.out.print("Por favor ingrese su edad: ");
      edad= num.nextInt();
      
      if (edad>15)
          System.out.print("Para entrar tienes que traer regalo.");
         else
      if (edad==15)
          System.out.print("Entras GRATIS... Bieen..");
         else
          System.out.print("NO entras socio.");
    }
}