/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatec.poo.model;

import java.time.LocalDate;

/**
 *
 * @author erixian
 */
public class Paciente extends Pessoa {
    private LocalDate dataNascimento;
    private double altura;
    private double peso;

    public Paciente(String cpf, String nome, LocalDate dataNasc) {
        super(cpf, nome);
        this.dataNascimento = dataNasc;
    }
    
    public double calcIMC() {
        return 0.0;
    }
    
    public int calcIdade(LocalDate dataNasc) {
        return 0;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }
    
}
