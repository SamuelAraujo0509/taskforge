package modulo02.atividades01.model;

public class Tarefa {

    private String nome;
    private String descricao;
    private int prioridade;
    private String responsavel;
    private double horas;
    private int status;

    public Tarefa(String nome, String descricao, int prioridade, String responsavel, double horas, int status) {
        this.nome = nome;
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.responsavel = responsavel;
        this.horas = horas;
        this.status = status;
    }

    public void imprimirCartao(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
