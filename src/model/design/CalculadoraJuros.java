/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.design;

/**
 *
 * @author Wolf390 (Alef)
 */
public class CalculadoraJuros {
    public double calcularJuros(double c, double i, double n){
        return c * i * n / 100;
    }
}
