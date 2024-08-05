/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._ex7.herancaemjava;

/**
 *
 * @author breno_h_souza
 */
 class Estudante extends Pessoa {
    private String matricula;

    Estudante(String nome, String matricula) {
        super(nome);
        this.matricula = matricula;
    }

    String getMatricula() {
        return matricula;
    }

    void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    void mostrarMatricula() {
        System.out.println("Matrícula: " + matricula);
    }
}
