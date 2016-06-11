package com.lucasrez.model;

/**
 * Created by lucasrez on 5/30/16.
 */
public class Trainees {
    private String nome;
    private String idade;

    public Trainees() {
    }

    public Trainees(String nome, String idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
}
