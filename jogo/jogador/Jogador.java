package jogador;

public interface Jogador
{
    //Atributos comuns aos jogadores
    private Marca marca;
    private Tabuleiro tabDoJogo;
    
    //Classes comunos aos jogadores
    public Marca getMarca();
    public void facaSuaJogada();
    

}