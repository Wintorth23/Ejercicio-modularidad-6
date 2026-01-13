/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modularidad_ejm_2;

/**
 *
 * @author jepeh
 */
public class BonoFijo implements EstrategiaBono {
    @Override
    public double aplicar(double sueldoPromedio) {
        return sueldoPromedio + 50;
    }
}
