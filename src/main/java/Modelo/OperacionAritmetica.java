/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author SAMUEL
 */
public class OperacionAritmetica extends Operacion {

    private String tipo;

    public OperacionAritmetica(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public double calcular(double... numeros) {

        double numero1 = numeros[0];
        double numero2 = numeros[1];

        switch (tipo) {
            case "suma":
                return numero1 + numero2;

            case "resta":
                return numero1 - numero2;

            case "multiplicacion":
                return numero1 * numero2;

            case "division":
                if (numero2 == 0) {
                    throw new ArithmeticException("No se puede dividir entre cero");
                }
                return numero1 / numero2;

            default:
                throw new IllegalArgumentException("Operación no válida");
        }
    }
}