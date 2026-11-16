package jogo.jogador;
//Garante a importação do .BufferedReader, IOException e InputStreatReader
import java.io.*;
import jogo.*;

public class JogadorHumano implements Jogador
{
    private Marca          marca     = null;
    private Tabuleiro      tabDoJogo = null;
    private BufferedReader teclado   = new BufferedReader
                                        (new InputStreamReader
                                        (System.in));

    public JogadorHumano (Tabuleiro tab) throws Exception
    {
        // atribuir tab para tabDoJogo
        this.tabDoJogo = tab;
        // pedir para o jogador escolher
        System.out.println("Você deseja usar o X ou a O");
        // sua marca e permitir digitacao
        String minhaMarca = teclado.readLine().trim().toUpperCase();
        this.marca = new Marca (minhaMarca.charAt(0));
    }

    public JogadorHumano (Tabuleiro tab, Marca mrc) throws Exception
    {
        // atribuir tab para tabDoJogo
        if (tab == null) throw new IllegalArgumentException ("Tabuleiro ausente");
        this.tabDoJogo = tab;
        // e mrc para marca
        if (mrc == null) throw new IllegalArgumentException ("Marca ausente");
        this.marca = mrc;
    }

    public Marca getMarca ()
    {
        // retorna a marca do jogador
        return this.marca;
    }

        public void facaSuaJogada ()
    {
        while (true)
        {
            try
            {
                // pergunta para o jogador onde ele quer jogar, permitindo digitacao
                System.out.println("\n\nEm qual linha você quer jogar? 0, 1 ou 2");
                int linha = Integer.parseInt(teclado.readLine().trim());
                System.out.println("\nEm qual coluna você quer jogar? 0, 1 ou 2");
                int coluna = Integer.parseInt(teclado.readLine().trim());

                // so joga se a posicao for valida e estiver livre
                if (!tabDoJogo.haMarcaNaPosicao(linha, coluna))
                {
                    tabDoJogo.setMarcaNaPosicao(this.marca, linha, coluna);
                    return;
                }
                System.out.println("Posição já ocupada.\nDigite novamente!");
            }
            catch (Exception erro)
            {
                // texto nao numerico, posicao fora de 0..2 ou erro de leitura
                System.out.println("Posição inválida.\nDigite novamente!");
            }
        }
    }

    public void vcGanhou ()
    {
        // mostra mensagem indicando vitoria
        System.out.println("Você ganhou o jogo!");
    }

    public void vcPerdeu ()
    {
        // mostra mensagem indicando derrota
        System.out.println("Você perdeu o jogo!");
    }

    public void deuVelha ()
    {
        // mostra mensagem indicando empate
        System.out.println("Você empatou o jogo/ deu velha!");
    }

    public boolean querMaisUmaPartida ()
    {
        try{
            // perguntar se deseja jogar de novo
            System.out.println("Você deseja mais uma jogada:\n1-Sim 2-Não");
            // permitindo digitacao e retornando
            int jogarNovamente = Integer.parseInt(teclado.readLine().trim());
            // true ou false, conforme a resposta
            return (jogarNovamente == 1) ? true : false;
        }catch(IOException erro){
            return false;
        }
        
    }
}