/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author labesp
 */
public class AsistenciaValidatorImpl implements AsistenciaValidador{
    private static final double minimo = 70.0;

    @Override
    public boolean cumple(double porcentaje) {
        return porcentaje >= minimo;
    }
}
