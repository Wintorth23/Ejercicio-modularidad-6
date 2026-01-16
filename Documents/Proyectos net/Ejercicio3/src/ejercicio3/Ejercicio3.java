/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author labesp
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

        AsistenciaCalculatorImpl calculator = new AsistenciaCalculatorImpl();
        AsistenciaValidatorImpl validator = new AsistenciaValidatorImpl();
        ReporteEstudiante reporte = new ReporteEstudiante();

        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = sc.nextLine();
	System.out.println("Ingrese la cantidad de dias que desea ingresar la asistencia");
	int Nn = sc.nextInt();
	sc.nextLine();
        int[] asistencias = new int[Nn];
        System.out.println("Ingrese la asistencia (1 = asistio, 0 = falto):");

        for (int i = 0; i < asistencias.length; i++) {
            System.out.print("Dia " + (i + 1) + ": ");
            asistencias[i] = sc.nextInt();
        }

        double porcentaje = calculator.calcularPorcentaje(asistencias);
        boolean cumple = validator.cumple(porcentaje);

        reporte.mostrar(nombre, porcentaje, cumple);

        sc.close();
    }
    
}
