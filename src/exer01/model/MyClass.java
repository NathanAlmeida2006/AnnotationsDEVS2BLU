package exer01.model;

import exer01.annotations.Info;

@Info(autor = "Nathan", data = "09/05/2006")
public class MyClass {
    private String nome;
    private int idade;

    public MyClass(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
