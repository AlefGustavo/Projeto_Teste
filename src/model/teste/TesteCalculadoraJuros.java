/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.teste;

import model.design.CalculadoraJuros;

/**
 *
 * @author Wolf390 (Alef)
 */
public class TesteCalculadoraJuros {
    public static void main(String[] args) {
        //Criação e Instância Objeto da Classe Calculadora de Juros.
        CalculadoraJuros cj = new CalculadoraJuros();
        
        //Apresentando Testes.
        System.out.println("\n\t\t\t ---Calculadora de Juros---\n");
        System.out.printf("Capital: R$%.2f\nJuros: R$%.2f\n", 1000.0, cj.calcularJuros(1000.0, 10.0, 3.0));
    }
    
}
