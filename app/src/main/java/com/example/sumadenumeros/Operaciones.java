package com.example.sumadenumeros;

public class Operaciones {

    private double resultado;

    public Operaciones(double resultado) {
        this.resultado = resultado;
    }



    public double getResultado() {
        return resultado;
    }

    public static double sumar(double num1, double num2){
        return num1+num2;
    }
    public static double restar(double num1, double num2){
        return num1-num2;
    }

    public static double multiplicacion(double num1, double num2){
        return num1*num2;
    }
    public static double division(double num1, double num2){
        if (num2 == 0) throw new IllegalArgumentException("No se puede dividir por cero");
        return num1/num2;
    }








}
