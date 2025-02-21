package br.com.gledson.campominado.visao;

import br.com.gledson.campominado.excecao.ExplosaoException;
import br.com.gledson.campominado.excecao.SairException;
import br.com.gledson.campominado.modelo.Tabuleiro;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class TabuleiroConsole {

    private Tabuleiro tabuleiro;
    private Scanner entrada  = new Scanner(System.in);


    public  TabuleiroConsole(Tabuleiro tabuleiro){
        this.tabuleiro=tabuleiro;

        executarJogo();
    }


    private void executarJogo(){
        try{
            boolean continuar = true;
                cicloDoJogo();

            while (continuar){
                System.out.println("Outra partida? (S/n) ");
                String resposta = entrada.nextLine();
                if ("n".equalsIgnoreCase(resposta)){
                    continuar = false;
                }else {
                    tabuleiro.reiniciarJogo();
                }
            }
        }catch (SairException e){
            System.out.println("Tchau !!!!");
        }finally {
            entrada.close();
        }
    }

    private void cicloDoJogo() {
        try {


            while (!tabuleiro.objetivoAlcancado()){
                System.out.println(tabuleiro);

                String digitado = capturarValorDigitado(" Digite (x,y) : ");
                Iterator<Integer> xy = Arrays.stream(digitado.split(",")).map(e -> Integer.parseInt(e.trim())).iterator();

               digitado= capturarValorDigitado("1 - Abrir  ou 2 - (Des)Marcar: ");
               if("1".equals(digitado)){
                   tabuleiro.abrir(xy.next(), xy.next());
               } else if ("2".equals(digitado)) {
                   tabuleiro.alternarMarcacao(xy.next(), xy.next());
               }



            }


            System.out.println(tabuleiro);
            System.out.println("Voce Ganhou ! =)");
        } catch (ExplosaoException e) {
            System.out.println(tabuleiro);
            System.out.println("Voce Perdeu ! X(");
        }
    }

    private String capturarValorDigitado( String texto){
        System.out.print(texto);
        String digitado = entrada.nextLine();

        if("sair".equalsIgnoreCase(digitado)){
            throw new SairException();
        }
        return digitado;
    }
}
