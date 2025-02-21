package br.com.gledson.campominado;

import br.com.gledson.campominado.modelo.Tabuleiro;
import br.com.gledson.campominado.visao.TabuleiroConsole;

public class Aplicacao {

    public static void main(String[] args) {


        Tabuleiro tabuleiro = new Tabuleiro(3,6,6);
        new TabuleiroConsole(tabuleiro);




    }
}
