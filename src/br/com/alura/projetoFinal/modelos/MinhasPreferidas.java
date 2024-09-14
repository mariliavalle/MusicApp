package br.com.alura.projetoFinal.modelos;

public class MinhasPreferidas {
    public void inclui(Audio audio){
        if (audio.getClassificacao() >= 8) {
            System.out.println(audio.getTitulo() + "é considerado sucesso absoluto!");
        } else {
            System.out.println(audio.getTitulo() + " é uma excelente opção para escutar depois!");
        }
    }
}
