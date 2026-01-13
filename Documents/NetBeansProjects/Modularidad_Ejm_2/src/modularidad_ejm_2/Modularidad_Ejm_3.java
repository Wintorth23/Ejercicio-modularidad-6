/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modularidad_ejm_2;
import java.util.*;
/**
 *
 * @author jepeh
 */
public class Modularidad_Ejm_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner sc = new Scanner(System.in);
        
        // Instanciamos nuestro servicio de lógica
        CalculoNomina servicio = new CalculoNomina();

        System.out.print("Nombre del empleado: ");
        String nombre = sc.nextLine();

        System.out.print("Cantidad de sueldos: ");
        int n = sc.nextInt();
        double[] sueldos = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Sueldo " + (i + 1) + ": ");
            sueldos[i] = sc.nextDouble();
        }

        Empleado emp = new Empleado(nombre, sueldos);

        // Usamos el servicio para calcular
        double promedio = servicio.calcularPromedio(emp.sueldos);
        boolean aceptable = servicio.esSueldoAceptable(promedio);

        System.out.print("¿Desea aplicar bono? (1-Si / 0-No): ");
        int op = sc.nextInt();

        if (op == 1) {
            // AQUI ESTÁ LA MAGIA DE SOLID:
            // Le pasamos la estrategia específica (BonoFijo).
            // Si mañana quieres un bono porcentual, solo cambias "new BonoFijo()" por "new BonoPorcentaje()"
            promedio = servicio.procesarBono(promedio, new BonoFijo());
        }

        ReporteNomina.mostrar(emp, promedio, aceptable);
        sc.close();
    }
}
