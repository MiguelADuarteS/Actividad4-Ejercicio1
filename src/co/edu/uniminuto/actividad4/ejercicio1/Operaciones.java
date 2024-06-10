/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uniminuto.actividad4.ejercicio1;

/**
 *
 * @author mduar
 */
public class Operaciones {

    private double numero1;
    private double numero2;

    public Operaciones() {

    }

    public Operaciones(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double sumar() {
        double suma = this.numero1 + this.numero2;
        return suma;
    }
     public double restar() {
        double resta = this.numero1 - this.numero2;
        return resta;
    }
     public double multiplicar() {
        double multiplicacion = this.numero1 * this.numero2;
        return multiplicacion;
    }
     public double dividir() {
        double division = this.numero1 / this.numero2;
        return division;
    }
     public double potenciar() {
        double potencia = Math.pow(numero1, numero2);
        return potencia;
    }
     public double raizCuadrada() {
        double raiz = Math.sqrt(numero1);
        return raiz;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Operaciones{");
        sb.append("numero1=").append(numero1);
        sb.append(", numero2=").append(numero2);
        sb.append('}');
        return sb.toString();
    }
}
