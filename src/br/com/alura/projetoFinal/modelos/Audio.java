package br.com.alura.projetoFinal.modelos;

public class Audio {
    private String titulo;
    private double duracao;
    private int totalDeReproducoes;
    private int totalDecurtidas;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getTotalDecurtidas() {
        return totalDecurtidas;
    }


    public int getClassificacao() {
        return classificacao;
    }


    public void curtir(){
        this.totalDecurtidas ++;
    }

    public void reproduzir(){
        this.totalDeReproducoes ++;
    }
}
