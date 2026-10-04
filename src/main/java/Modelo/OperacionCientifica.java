/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author SAMUEL
 */
public class OperacionCientifica extends Operacion {

    private String tipo;

    public OperacionCientifica(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public double calcular(double... numeros) {

        double numero = numeros[0];

        switch (tipo) {
            case "raizCuadrada":
                if (numero < 0) {
                    throw new ArithmeticException("No se puede calcular raíz cuadrada de un número negativo");
                }
                return Math.sqrt(numero);

            case "raizCubica":
                return Math.cbrt(numero);

            case "logaritmoNatural":
                if (numero <= 0) {
                    throw new ArithmeticException("El logaritmo natural debe ser de un número mayor que cero");
                }
                return Math.log(numero);

            default:
                throw new IllegalArgumentException("Operación no válida");
        }
    }
}