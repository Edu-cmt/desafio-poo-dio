package br.com.desafio.dominio;


public abstract class Conteudo {
    protected String titulo;
    protected String descricao;
    protected static final double XP_PADRAO = 10.0;

    public Conteudo() {
    }

    public abstract double calculcarXp();

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
