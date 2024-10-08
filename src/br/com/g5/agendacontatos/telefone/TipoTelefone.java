package br.com.g5.agendacontatos.telefone;

public enum TipoTelefone {
    CELULAR("Celular"),
    CASA("Casa"),
    TRABALHO("Trabalho"),
    ESCOLA("Escola"),
    PRINCIPAL("Principal"),
    OUTRO("Outro");

    private final String descricao;

    TipoTelefone(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }
}
