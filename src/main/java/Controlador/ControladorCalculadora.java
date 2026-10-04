/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.Operacion;
import Modelo.OperacionAritmetica;
import Modelo.OperacionCientifica;

/**
 *
 * @author SAMUEL
 */
public class ControladorCalculadora {

    public double realizarOperacion(String tipo, double... numeros) {

        Operacion operacion;

        switch (tipo) {

            case "suma":
                operacion = new OperacionAritmetica("suma");
                break;

            case "resta":
                operacion = new OperacionAritmetica("resta");
                break;

            case "multiplicacion":
                operacion = new OperacionAritmetica("multiplicacion");
                break;

            case "division":
                operacion = new OperacionAritmetica("division");
                break;

            case "raizCuadrada":
                operacion = new OperacionCientifica("raizCuadrada");
                break;

            case "raizCubica":
                operacion = new OperacionCientifica("raizCubica");
                break;

            case "logaritmoNatural":
                operacion = new OperacionCientifica("logaritmoNatural");
                break;

            default:
                throw new IllegalArgumentException("Operación no válida");
        }

        return operacion.calcular(numeros);
    }
}