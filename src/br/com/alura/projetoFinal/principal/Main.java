package br.com.alura.projetoFinal.principal;

import br.com.alura.projetoFinal.modelos.MinhasPreferidas;
import br.com.alura.projetoFinal.modelos.Musicas;
import br.com.alura.projetoFinal.modelos.Podcasts;

public class Main {
    public static void main(String[] args) {
        Musicas minhaMusica = new Musicas();
        minhaMusica.setTitulo("Californication");
        minhaMusica.setArtista("Red Hot Chili Peppers");

        for (int i = 0; i < 100; i++) {
            minhaMusica.reproduzir();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curtir();
        }

        Podcasts meuPodcast = new Podcasts();
        meuPodcast.setTitulo("Para dar nome as coisas");
        meuPodcast.setHost("Nat");

        for (int i = 0; i < 89; i++) {
            meuPodcast.reproduzir();
        }

        for (int i = 0; i < 150; i++) {
            meuPodcast.curtir();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }
}