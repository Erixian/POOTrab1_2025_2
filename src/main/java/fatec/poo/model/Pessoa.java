/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatec.poo.model;

/**
 *
 * @author erixian
 */
public class Pessoa {
    private String cpf;
    private String nome;
    private String enderco;
    private String telefone;

    public Pessoa(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getEnderco() {
        return enderco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setEnderco(String enderco) {
        this.enderco = enderco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
