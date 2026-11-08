package jogo.jogador;
import jogo.*;

public class JogadorAutomatico implements Jogador
{
    private Marca     marca     = null;
    private Tabuleiro tabDoJogo = null;

    public JogadorAutomatico (Tabuleiro tab) throws Exception
    {   tabDoJogo = tab;
        // atribuir tab para tabDoJogo
        // fazer o jogador escolher sua marca
        // via sorteio de numeros aleatorio
        if ((int)(Math.random()*2) == 0)
            marca=new Marca('X');
        else
            marca=new Marca('O');
    }

    public JogadorAutomatico (Tabuleiro tab, Marca mrc) throws Exception
    {
        // atribuir tab para tabDoJogo
        this.tabDoJogo = tab;
        // e mrc para marca
        this.marca = mrc;
    }

    public Marca getMarca ()
    {
        // retorna a marca do jogador
        return this.marca;
    }

        public void facaSuaJogada ()
    {
        try
        {
            //pega a marca do adversário
            Marca adv = new Marca(this.getMarca().getSimbolo()=='X' ? 'O' : 'X');

            // tentando ganhar na linha 0
            if (this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(0,0)) && this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(0,1)) && !this.tabDoJogo.haMarcaNaPosicao(0,2))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),0,2);
            else if (this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(0,0)) && this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(0,2)) && !this.tabDoJogo.haMarcaNaPosicao(0,1))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),0,1);
            else if (this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(0,1)) && this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(0,2)) && !this.tabDoJogo.haMarcaNaPosicao(0,0))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),0,0);
            else

            // tentando ganhar na linha 1
            if (this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(1,0)) && this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(1,1)) && !this.tabDoJogo.haMarcaNaPosicao(1,2))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),1,2);
            else if (this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(1,0)) && this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(1,2)) && !this.tabDoJogo.haMarcaNaPosicao(1,1))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),1,1);
            else if (this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(1,1)) && this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(1,2)) && !this.tabDoJogo.haMarcaNaPosicao(1,0))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),1,0);
            else

            // tentando ganhar na linha 2
            if (this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(2,0)) && this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(2,1)) && !this.tabDoJogo.haMarcaNaPosicao(2,2))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),2,2);
            else if (this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(2,0)) && this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(2,2)) && !this.tabDoJogo.haMarcaNaPosicao(2,1))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),2,1);
            else if (this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(2,1)) && this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(2,2)) && !this.tabDoJogo.haMarcaNaPosicao(2,0))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),2,0);
            else


            // tentando ganhar na coluna 0
            if (this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(0,0)) && this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(1,0)) && !this.tabDoJogo.haMarcaNaPosicao(2,0))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),2,0);
            else if (this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(0,0)) && this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(2,0)) && !this.tabDoJogo.haMarcaNaPosicao(1,0))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),1,0);
            else if (this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(1,0)) && this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(2,0)) && !this.tabDoJogo.haMarcaNaPosicao(0,0))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),0,0);
            else

            // tentando ganhar na coluna 1
            if (this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(0,1)) && this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(1,1)) && !this.tabDoJogo.haMarcaNaPosicao(2,1))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),2,1);
            else if (this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(0,1)) && this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(2,1)) && !this.tabDoJogo.haMarcaNaPosicao(1,1))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),1,1);
            else if (this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(1,1)) && this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(2,1)) && !this.tabDoJogo.haMarcaNaPosicao(0,1))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),0,1);
            else

            // tentando ganhar na coluna 2
            if (this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(0,2)) && this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(1,2)) && !this.tabDoJogo.haMarcaNaPosicao(2,2))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),2,2);
            else if (this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(0,2)) && this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(2,2)) && !this.tabDoJogo.haMarcaNaPosicao(1,2))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),1,2);
            else if (this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(1,2)) && this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(2,2)) && !this.tabDoJogo.haMarcaNaPosicao(0,2))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),0,2);
            else

            // tentando ganhar na diagonal principal
            if (this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(0,0)) && this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(1,1)) && !this.tabDoJogo.haMarcaNaPosicao(2,2))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),2,2);
            else if (this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(0,0)) && this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(2,2)) && !this.tabDoJogo.haMarcaNaPosicao(1,1))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),1,1);
            else if (this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(1,1)) && this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(2,2)) && !this.tabDoJogo.haMarcaNaPosicao(0,0))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),0,0);
            else

            // tentando ganhar na diagonal secundaria
            if (this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(0,2)) && this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(1,1)) && !this.tabDoJogo.haMarcaNaPosicao(2,0))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),2,0);
            else if (this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(0,2)) && this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(2,0)) && !this.tabDoJogo.haMarcaNaPosicao(1,1))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),1,1);
            else if (this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(1,1)) && this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(2,0)) && !this.tabDoJogo.haMarcaNaPosicao(0,2))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),0,2);
            else

            // tentando atrapalhar vitoria na linha 0
            if (adv.equals(this.tabDoJogo.getMarcaNaPosicao(0,0)) && adv.equals(this.tabDoJogo.getMarcaNaPosicao(0,1)) && !this.tabDoJogo.haMarcaNaPosicao(0,2))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),0,2);
            else if (adv.equals(this.tabDoJogo.getMarcaNaPosicao(0,0)) && adv.equals(this.tabDoJogo.getMarcaNaPosicao(0,2)) && !this.tabDoJogo.haMarcaNaPosicao(0,1))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),0,1);
            else if (adv.equals(this.tabDoJogo.getMarcaNaPosicao(0,1)) && adv.equals(this.tabDoJogo.getMarcaNaPosicao(0,2)) && !this.tabDoJogo.haMarcaNaPosicao(0,0))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),0,0);
            else

            // tentando atrapalhar vitoria na linha 1
            if (adv.equals(this.tabDoJogo.getMarcaNaPosicao(1,0)) && adv.equals(this.tabDoJogo.getMarcaNaPosicao(1,1)) && !this.tabDoJogo.haMarcaNaPosicao(1,2))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),1,2);
            else if (adv.equals(this.tabDoJogo.getMarcaNaPosicao(1,0)) && adv.equals(this.tabDoJogo.getMarcaNaPosicao(1,2)) && !this.tabDoJogo.haMarcaNaPosicao(1,1))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),1,1);
            else if (adv.equals(this.tabDoJogo.getMarcaNaPosicao(1,1)) && adv.equals(this.tabDoJogo.getMarcaNaPosicao(1,2)) && !this.tabDoJogo.haMarcaNaPosicao(1,0))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),1,0);
            else

            // tentando atrapalhar vitoria na linha 2
            if (adv.equals(this.tabDoJogo.getMarcaNaPosicao(2,0)) && adv.equals(this.tabDoJogo.getMarcaNaPosicao(2,1)) && !this.tabDoJogo.haMarcaNaPosicao(2,2))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),2,2);
            else if (adv.equals(this.tabDoJogo.getMarcaNaPosicao(2,0)) && adv.equals(this.tabDoJogo.getMarcaNaPosicao(2,2)) && !this.tabDoJogo.haMarcaNaPosicao(2,1))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),2,1);
            else if (adv.equals(this.tabDoJogo.getMarcaNaPosicao(2,1)) && adv.equals(this.tabDoJogo.getMarcaNaPosicao(2,2)) && !this.tabDoJogo.haMarcaNaPosicao(2,0))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),2,0);
            else

            // tentando atrapalhar vitoria na coluna 0
            if (adv.equals(this.tabDoJogo.getMarcaNaPosicao(0,0)) && adv.equals(this.tabDoJogo.getMarcaNaPosicao(1,0)) && !this.tabDoJogo.haMarcaNaPosicao(2,0))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),2,0);
            else if (adv.equals(this.tabDoJogo.getMarcaNaPosicao(0,0)) && adv.equals(this.tabDoJogo.getMarcaNaPosicao(2,0)) && !this.tabDoJogo.haMarcaNaPosicao(1,0))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),1,0);
            else if (adv.equals(this.tabDoJogo.getMarcaNaPosicao(1,0)) && adv.equals(this.tabDoJogo.getMarcaNaPosicao(2,0)) && !this.tabDoJogo.haMarcaNaPosicao(0,0))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),0,0);
            else

            // tentando atrapalhar vitoria na coluna 1
            if (adv.equals(this.tabDoJogo.getMarcaNaPosicao(0,1)) && adv.equals(this.tabDoJogo.getMarcaNaPosicao(1,1)) && !this.tabDoJogo.haMarcaNaPosicao(2,1))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),2,1);
            else if (adv.equals(this.tabDoJogo.getMarcaNaPosicao(0,1)) && adv.equals(this.tabDoJogo.getMarcaNaPosicao(2,1)) && !this.tabDoJogo.haMarcaNaPosicao(1,1))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),1,1);
            else if (adv.equals(this.tabDoJogo.getMarcaNaPosicao(1,1)) && adv.equals(this.tabDoJogo.getMarcaNaPosicao(2,1)) && !this.tabDoJogo.haMarcaNaPosicao(0,1))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),0,1);
            else

            // tentando atrapalhar vitoria na coluna 2
            if (adv.equals(this.tabDoJogo.getMarcaNaPosicao(0,2)) && adv.equals(this.tabDoJogo.getMarcaNaPosicao(1,2)) && !this.tabDoJogo.haMarcaNaPosicao(2,2))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),2,2);
            else if (adv.equals(this.tabDoJogo.getMarcaNaPosicao(0,2)) && adv.equals(this.tabDoJogo.getMarcaNaPosicao(2,2)) && !this.tabDoJogo.haMarcaNaPosicao(1,2))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),1,2);
            else if (adv.equals(this.tabDoJogo.getMarcaNaPosicao(1,2)) && adv.equals(this.tabDoJogo.getMarcaNaPosicao(2,2)) && !this.tabDoJogo.haMarcaNaPosicao(0,2))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),0,2);
            else


            // tentando atrapalhar vitoria na diagonal principal
            if (adv.equals(this.tabDoJogo.getMarcaNaPosicao(0,0)) && adv.equals(this.tabDoJogo.getMarcaNaPosicao(1,1)) && !this.tabDoJogo.haMarcaNaPosicao(2,2))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),2,2);
            else if (adv.equals(this.tabDoJogo.getMarcaNaPosicao(0,0)) && adv.equals(this.tabDoJogo.getMarcaNaPosicao(2,2)) && !this.tabDoJogo.haMarcaNaPosicao(1,1))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),1,1);
            else if (adv.equals(this.tabDoJogo.getMarcaNaPosicao(1,1)) && adv.equals(this.tabDoJogo.getMarcaNaPosicao(2,2)) && !this.tabDoJogo.haMarcaNaPosicao(0,0))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),0,0);
            else

            // tentando atrapalhar vitoria na diagonal secundaria
            if (adv.equals(this.tabDoJogo.getMarcaNaPosicao(0,2)) && adv.equals(this.tabDoJogo.getMarcaNaPosicao(1,1)) && !this.tabDoJogo.haMarcaNaPosicao(2,0))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),2,0);
            else if (adv.equals(this.tabDoJogo.getMarcaNaPosicao(0,2)) && adv.equals(this.tabDoJogo.getMarcaNaPosicao(2,0)) && !this.tabDoJogo.haMarcaNaPosicao(1,1))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),1,1);
            else if (adv.equals(this.tabDoJogo.getMarcaNaPosicao(1,1)) && adv.equals(this.tabDoJogo.getMarcaNaPosicao(2,0)) && !this.tabDoJogo.haMarcaNaPosicao(0,2))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),0,2);
            else

            // tentando jogada de futuro na linha 0
            if (this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(0,0)) && !this.tabDoJogo.haMarcaNaPosicao(0,1) && !this.tabDoJogo.haMarcaNaPosicao(0,2))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),0,1);
            else if (this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(0,1)) && !this.tabDoJogo.haMarcaNaPosicao(0,0) && !this.tabDoJogo.haMarcaNaPosicao(0,2))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),0,0);
            else if (this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(0,2)) && !this.tabDoJogo.haMarcaNaPosicao(0,0) && !this.tabDoJogo.haMarcaNaPosicao(0,1))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),0,0);
            else

            // tentando jogada de futuro na linha 1
            if (this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(1,0)) && !this.tabDoJogo.haMarcaNaPosicao(1,1) && !this.tabDoJogo.haMarcaNaPosicao(1,2))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),1,1);
            else if (this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(1,1)) && !this.tabDoJogo.haMarcaNaPosicao(1,0) && !this.tabDoJogo.haMarcaNaPosicao(1,2))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),1,0);
            else if (this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(1,2)) && !this.tabDoJogo.haMarcaNaPosicao(1,0) && !this.tabDoJogo.haMarcaNaPosicao(1,1))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),1,0);
            else

            // tentando jogada de futuro na linha 2
            if (this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(2,0)) && !this.tabDoJogo.haMarcaNaPosicao(2,1) && !this.tabDoJogo.haMarcaNaPosicao(2,2))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),2,1);
            else if (this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(2,1)) && !this.tabDoJogo.haMarcaNaPosicao(2,0) && !this.tabDoJogo.haMarcaNaPosicao(2,2))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),2,0);
            else if (this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(2,2)) && !this.tabDoJogo.haMarcaNaPosicao(2,0) && !this.tabDoJogo.haMarcaNaPosicao(2,1))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),2,0);
            else

            // tentando jogada de futuro na coluna 0
            if (this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(0,0)) && !this.tabDoJogo.haMarcaNaPosicao(1,0) && !this.tabDoJogo.haMarcaNaPosicao(2,0))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),1,0);
            else if (this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(1,0)) && !this.tabDoJogo.haMarcaNaPosicao(0,0) && !this.tabDoJogo.haMarcaNaPosicao(2,0))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),0,0);
            else if (this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(2,0)) && !this.tabDoJogo.haMarcaNaPosicao(0,0) && !this.tabDoJogo.haMarcaNaPosicao(1,0))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),0,0);
            else

            // tentando jogada de futuro na coluna 1
            if (this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(0,1)) && !this.tabDoJogo.haMarcaNaPosicao(1,1) && !this.tabDoJogo.haMarcaNaPosicao(2,1))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),1,1);
            else if (this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(1,1)) && !this.tabDoJogo.haMarcaNaPosicao(0,1) && !this.tabDoJogo.haMarcaNaPosicao(2,1))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),0,1);
            else if (this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(2,1)) && !this.tabDoJogo.haMarcaNaPosicao(0,1) && !this.tabDoJogo.haMarcaNaPosicao(1,1))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),0,1);
            else

            // tentando jogada de futuro na coluna 2
            if (this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(0,2)) && !this.tabDoJogo.haMarcaNaPosicao(1,2) && !this.tabDoJogo.haMarcaNaPosicao(2,2))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),1,2);
            else if (this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(1,2)) && !this.tabDoJogo.haMarcaNaPosicao(0,2) && !this.tabDoJogo.haMarcaNaPosicao(2,2))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),0,2);
            else if (this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(2,2)) && !this.tabDoJogo.haMarcaNaPosicao(0,2) && !this.tabDoJogo.haMarcaNaPosicao(1,2))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),0,2);
            else

            // tentando jogada de futuro na diagonal principal
            if (this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(0,0)) && !this.tabDoJogo.haMarcaNaPosicao(1,1) && !this.tabDoJogo.haMarcaNaPosicao(2,2))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),1,1);
            else if (this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(1,1)) && !this.tabDoJogo.haMarcaNaPosicao(0,0) && !this.tabDoJogo.haMarcaNaPosicao(2,2))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),0,0);
            else if (this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(2,2)) && !this.tabDoJogo.haMarcaNaPosicao(0,0) && !this.tabDoJogo.haMarcaNaPosicao(1,1))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),0,0);
            else

            // tentando jogada de futuro na diagonal secundaria
            if (this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(0,2)) && !this.tabDoJogo.haMarcaNaPosicao(1,1) && !this.tabDoJogo.haMarcaNaPosicao(2,0))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),1,1);
            else if (this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(1,1)) && !this.tabDoJogo.haMarcaNaPosicao(0,2) && !this.tabDoJogo.haMarcaNaPosicao(2,0))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),0,2);
            else if (this.getMarca().equals(this.tabDoJogo.getMarcaNaPosicao(2,0)) && !this.tabDoJogo.haMarcaNaPosicao(0,2) && !this.tabDoJogo.haMarcaNaPosicao(1,1))
                this.tabDoJogo.setMarcaNaPosicao(this.getMarca(),0,2);
            else

                
            // termine jogando num lugar qualquer que esteja livre
            {
                for (int l = 0; l < 3; l++)
                    for (int c = 0; c < 3; c++)
                        if (!this.tabDoJogo.haMarcaNaPosicao(l, c))
                        {
                            this.tabDoJogo.setMarcaNaPosicao(this.getMarca(), l, c);
                            return;
                        }
            }
        }
        catch (Exception erro)
        {} // ignorando pois sei que não estou usando posicao invalida nem comparando com equals um null
    }
}