/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author labesp
 */
public class AsistenciaCalculatorImpl  implements CalculoAsistencia {
    
    @Override
    public double calcularPorcentaje(int[] asistencias) {
        int total = 0;
        for (int a : asistencias) {
            total += a;
        }
        return (total * 100.0) / asistencias.length;
    }
}
