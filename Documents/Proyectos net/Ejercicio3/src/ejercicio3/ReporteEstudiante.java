/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author labesp
 */
public class ReporteEstudiante	implements Reporte {
    @Override
    public void mostrar(String nombre, double porcentaje, boolean cumple) {
        System.out.println("\n--- REPORTE DE ASISTENCIA ---");
        System.out.println("Estudiante: " + nombre);
        System.out.printf("Porcentaje de asistencia: %.2f%%\n", porcentaje);
        System.out.println("Estado: " + 
            (cumple ? "Cumple con el requisito" : "No cumple con el requisito"));
    }
}
