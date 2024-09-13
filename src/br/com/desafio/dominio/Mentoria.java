package br.com.desafio.dominio;


import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data;

    public Mentoria() {
    }

    public double calculcarXp() {
        return 30.0;
    }

    public LocalDate getData() {
        return this.data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String toString() {
        String var10000 = this.titulo;
        return "Mentoria =" + var10000 + ", " + this.descricao + ", data=" + String.valueOf(this.data);
    }
}
