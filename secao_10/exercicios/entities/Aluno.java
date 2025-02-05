package secao_10.exercicios.entities;

public class Aluno {
    String nome;
    String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Aluno(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
}