/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

import co.edu.uniminuto.actividad4.ejercicio1.Operaciones;
import java.util.Scanner;

public class Ejercicio1 {

    /*1. Crear una calculadora con 8 operaciones matemáticas, se debe presentar un menú con el
nombre de las operaciones (pedir 2 números) y mostrar el resultado. Una vez mostrado el
resultado se debe mostrar otra vez el menú. Hacer validaciones de datos.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;
    
    do{
        System.out.println("\nOperaciones que puede realizar");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacionr");
        System.out.println("4. Division");
        System.out.println("5. Potenciacion");
        System.out.println("6. Raiz cuadrada");
        System.out.println("7. Salir");
        System.out.println("\nSeleccione que operecion desea realizar");
        opcion = leer.nextInt();
    
        if (opcion == 1) {
            System.out.print("Ingrese el primer numero: ");
            double numero1 = leer.nextDouble();
            System.out.print("Ingrese el segundo numero: ");
            double numero2 = leer.nextDouble();
            Operaciones miOperacion= new Operaciones(numero1,numero2);
            System.out.println("\nLa suma de " + numero1 + " y " + numero2 + ": " + miOperacion.sumar());
        }
        else if(opcion == 2) {
            System.out.print("Ingrese el primer numero: ");
            double numero1 = leer.nextDouble();
            System.out.print("Ingrese el segundo numero: ");
            double numero2 = leer.nextDouble();
            Operaciones miOperacion= new Operaciones(numero1,numero2);
            System.out.println("\nLa resta de " + numero1 + " y " + numero2 + ": " + miOperacion.restar());
        }
        else if(opcion == 3) {
            System.out.print("Ingrese el primer numero: ");
            double numero1 = leer.nextDouble();
            System.out.print("Ingrese el segundo numero: ");
            double numero2 = leer.nextDouble();
            Operaciones miOperacion= new Operaciones(numero1,numero2);
            System.out.println("\nLa multiplicacion de " + numero1 + " y " + numero2 + ": " + miOperacion.multiplicar());
        }
        else if(opcion == 4) {
            System.out.print("Ingrese el primer numero: ");
            double numero1 = leer.nextDouble();
            System.out.print("Ingrese el segundo numero: ");
            double numero2 = leer.nextDouble();
            Operaciones miOperacion= new Operaciones(numero1,numero2);
            System.out.println("\nLa division de " + numero1 + " y " + numero2 + ": " + miOperacion.dividir());
        }
        else if(opcion == 5) {
            
            System.out.print("Ingrese el numero que desea potenciar: ");
            double numero1 = leer.nextDouble();
            System.out.print("Ingrese la potencia del numero: ");
            double numero2 = leer.nextDouble();
            Operaciones miOperacion= new Operaciones(numero1,numero2);
            System.out.println("\nEl numero  " + numero1 + " potenciado en " + numero2 + " es: " + miOperacion.potenciar());
        }
        else if(opcion == 6) {
            System.out.print("Ingrese el numero del cual desea saber la raiz cuadrada: ");
            double numero1 = leer.nextDouble();
            Operaciones miOperacion= new Operaciones(numero1,numero1);
            System.out.println("\nLa raiz cuadrada de " + numero1+" es: " + miOperacion.raizCuadrada());
        }
    }while((opcion<1)||(opcion>7));
}
}
