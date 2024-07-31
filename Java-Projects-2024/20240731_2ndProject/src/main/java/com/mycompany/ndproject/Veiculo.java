/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ndproject;

/**
 *
 * @author breno_h_souza
 */
public class Veiculo {
    
    protected int rodas;

    public Veiculo(int rodas) {
      this.rodas = rodas;
    }

    public void numeroDeRodas() {
        System.out.println("Veículo tem " + this.rodas + " rodas");
    }
    
}
