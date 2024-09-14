package br.com.alura.projetoFinal.modelos;

public class Podcasts extends Audio {
    private int numeroEpisodio;
    private String host;
    private String descricao;

    public int getNumeroEpisodio() {
        return numeroEpisodio;
    }

    public void setNumeroEpisodio(int numeroEpisodio) {
        this.numeroEpisodio = numeroEpisodio;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalDecurtidas() > 500){
            return 10;
        } else {
            return 7;
        }
    }
}
