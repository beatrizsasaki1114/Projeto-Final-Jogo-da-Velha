package jogo;
import java.util.Objects;
import jogo.*;

public class AnalistaSituacional
{
    private Tabuleiro tabDoJogo;

    public AnalistaSituacional (Tabuleiro tab) throws Exception
    {
        if(tab == null) throw new IllegalArgumentException("Tabuleiro nulo");
        this.tabDoJogo = tab;
    }

    private Marca verificarSequencia(
        int linha1, int coluna1,
        int linha2, int coluna2,
        int linha3, int coluna3){

            Marca primeira= tabDoJogo.getMarcaNaPosicao(linha1,coluna1);
            Marca segunda= tabDoJogo.getMarcaNaPosicao(linha2,coluna2);
            Marca terceira= tabDoJogo.getMarcaNaPosicao(linha3,coluna3);

            if(primeira!= null && primeira.equals(segunda) && primeira.equals(terceira)){
                return primeira;
            }
            return null;
    }

    public Marca getMarcaDoVencedor ()
    {
        try{
            for(int i=0; i<3; i++){
                // verificação da linha
               Marca vencedora= verificarSequencia(i,0,i,1,i,2);
                if(vencedora!= null){
                    return vencedora;
                }

                // verificação da coluna
                vencedora= verificarSequencia(0,i,1,i,2,i);
                if(vencedora!= null){
                    return vencedora;
                }
            }

            // verificação das diagonais
            Marca vencedora = verificarSequencia(0,0,1,1,2,2);
            // se a diagonal principal não tiver vencedor, verifica a diagonal secundária
            return vencedora!= null ? vencedora:verificarSequencia(0,2,1,1,2,0);
         
        }catch(Exception erro){
            throw new IllegalStateException("Erro ao analisar o tabuleiro", erro);
        }
    }

    private boolean tabuleiroCheio ()
    {
        try{
            for(int i=0; i<3;i++){
                for(int j=0; j<3; j++){
                    if(tabDoJogo.getMarcaNaPosicao(i,j)== null){
                        return false;
                    }
                }
            }
            return true;
        }catch(Exception erro){
            throw new IllegalStateException("Erro ao analisar o tabuleiro", erro);
        }
       
    }

    public boolean fimDeJogo ()
    {
        return getMarcaDoVencedor()!= null || tabuleiroCheio();
    }

    @Override
    public String toString ()
    {
        if(getMarcaDoVencedor()!= null){
            return "O jogo terminou com a vitoria do jogador de marca "+getMarcaDoVencedor();
        }
        if(tabuleiroCheio()){
            return "O jogo terminou em empate";
        }
        return "O jogo está em andamento";
    }

    @Override
    public boolean equals (Object obj)
    {
        if(obj== this) return true;
        if(obj== null || getClass()!= obj.getClass()) return false;
        AnalistaSituacional outro= (AnalistaSituacional) obj;
        return this.tabDoJogo.equals(outro.tabDoJogo);
    }   

    @Override
    public int hashCode ()
    {
        return Objects.hash(tabDoJogo);
    }
}