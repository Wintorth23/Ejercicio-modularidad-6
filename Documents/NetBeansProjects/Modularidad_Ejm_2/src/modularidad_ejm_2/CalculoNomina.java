package modularidad_ejm_2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jepeh
 */
public class CalculoNomina {
       public double calcularPromedio(double[] sueldos) {
        double suma = 0;
        for (double sueldo : sueldos) {
            suma += sueldo;
        }
        return (sueldos.length > 0) ? suma / sueldos.length : 0;
    }

    public boolean esSueldoAceptable(double promedio) {
        return promedio >= 500;
    }

    // AHORA: Recibe la estrategia, no calcula el bono "a la fuerza"
    public double procesarBono(double promedio, EstrategiaBono bono) {
        return bono.aplicar(promedio);
    }
}