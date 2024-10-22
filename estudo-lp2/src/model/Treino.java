package model;

public class Treino {
    private String horario;
    private String descricao;

    public Treino(String horario, String descricao) {
        this.horario = horario;
        this.descricao = descricao;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return horario + "=" + descricao;
    }
}
