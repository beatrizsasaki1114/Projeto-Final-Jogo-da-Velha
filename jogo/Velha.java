package jogo;
import java.io.*;

import jogo.jogador.*;

public class Velha
{
    public static void main (String args [])
    {
        Tabuleiro           tabDoJogo;

        Jogador             jogador  = null;
        JogadorHumano       jogadorH = null;
        JogadorAutomatico   jogadorA = null;

        AnalistaSituacional analista;

        boolean jogadorHumanoComeca = (int)(Math.random()*2) == 0;

        do
        {
            try
            {
                tabDoJogo = new Tabuleiro ();

                if (jogadorHumanoComeca)
                {
                    jogadorH = new JogadorHumano (tabDoJogo);
                    jogadorA = new JogadorAutomatico
                              (tabDoJogo,
                               new Marca(jogadorH.getMarca().getSimbolo()=='X'?'O':'X'));
                }
                else
                {
                    jogadorA = new JogadorAutomatico (tabDoJogo);
                    jogadorH = new JogadorHumano
                              (tabDoJogo,
                               new Marca(jogadorA.getMarca().getSimbolo()=='X'?'O':'X'));
                }

                analista = new AnalistaSituacional (tabDoJogo);

                if (jogadorHumanoComeca)
                    jogador=jogadorH;
                else
                    jogador=jogadorA;

                do
                {
                    jogador.facaSuaJogada();
                    System.out.println(tabDoJogo);
                    System.out.println("\n\n--------------------\n\n");

                    if (jogador==jogadorH){
                        jogador=jogadorA;
                    }
                    else{
                        jogador=jogadorH;
                    }
                }
                while (!analista.fimDeJogo());

                Marca vencedora = analista.getMarcaDoVencedor();
                if(vencedora==null){
                    jogadorH.deuVelha();
                }else if( vencedora.equals(jogadorH.getMarca())){
                    jogadorH.vcGanhou();
                }else{
                    jogadorH.vcPerdeu();
                }

                jogadorHumanoComeca = !jogadorHumanoComeca;
            }
            catch (Exception e){
                System.err.println("Não foi possível continuar o jogo: " + e.getMessage());
                return;
            }
        }
        while (jogadorH.querMaisUmaPartida());
    }
}