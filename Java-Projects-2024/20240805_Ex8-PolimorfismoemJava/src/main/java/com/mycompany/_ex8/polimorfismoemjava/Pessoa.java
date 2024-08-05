/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._ex8.polimorfismoemjava;

/**
 *
 * @author breno_h_souza
 */
public class Pessoa {
    
    private String nome;

    Pessoa(String nome) {
        this.nome = nome;
    }

    String getNome() {
        return nome;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    void dizerOla() {
        System.out.println("Olá, meu nome é " + nome);
    }
    
}
