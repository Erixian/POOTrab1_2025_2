/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatec.poo.model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author erixian
 */
public class Paciente extends Pessoa {
    private LocalDate dataNascimento;
    private double altura;
    private double peso;
    private ArrayList<Consulta> consultas; 
    

    public Paciente(String cpf, String nome, LocalDate dataNasc) {
        super(cpf, nome);
        this.dataNascimento = dataNasc;
        consultas = new ArrayList<Consulta>();
    }
    
    public void addConsulta(Consulta c){
        consultas.add(c);
        c.setPaciente(this);
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
