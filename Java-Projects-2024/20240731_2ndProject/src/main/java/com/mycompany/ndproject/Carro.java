/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ndproject;

/**
 *
 * @author breno_h_souza
 */
public class  Carro extends Veiculo {
    private int portas;

    public Carro(int portas) {
      super(4);
      this.portas = portas;
    }

    public void portas() {
        System.out.println("Carro tem " + this.portas + " portas.");
    }
}
