package br.com.docodigoaocontrato.taskforge.DTO;

public class TarefaDTO {

    private Long id;
    private String nome;
    private int prioridade;
    private boolean concluida;

    public TarefaDTO(Long id, String nome, int prioridade, boolean concluida) {
        this.id = id;
        this.nome = nome;
        this.prioridade = prioridade;
        this.concluida = concluida;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }
}
