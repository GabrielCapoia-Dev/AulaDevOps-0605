package org.example;

public class DisciplinaDuble {
    private String nome;
    private String turno;

    public DisciplinaDuble(String nome, String turno){
        this.nome = "devops";
        this.turno = "noite";
    }

    public String getNome() {return nome;}

    public String getTurno() {return turno;}

    public void setNome(String nome) {this.nome = nome;}

    public void setTurno(String turno) {this.turno = turno;}

    public int qtdAlunos(){
        int numAluno;
        return 3;
    }
}
