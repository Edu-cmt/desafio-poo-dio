package br.com.desafio.dominio;

public class Curso extends Conteudo {
    private int cargaHoraria;

    public Curso() {
    }

    public double calculcarXp() {
        return 10.0 * (double)this.cargaHoraria;
    }

    public int getCargaHoraria() {
        return this.cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String toString() {
        return "Curso =" + this.titulo + ", " + this.descricao + ", " + this.cargaHoraria + "h";
    }
}
