package modulo02.atividades01.model;

public class Aluno {

    String nome;
    double nota1;
    double nota2;

    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double media(){
        double m =  (nota1 + nota2) / 2 ;
        return m;
    }

    public void imprimir(){
        IO.println(nome+": "+media());
    }
}
