
import java.util.Arrays;

public class Tabuleiro implements Cloneable
{
    // a principio, toda igual a null
    private Marca matriz [][] = new Marca [3][3];
    
    // construtor padrao
    public Tabuleiro(){}
    
    public boolean haMarcaNaPosicao (int lin, int col) throws Exception
    {
        if(lin<0 || lin>2 || col<0 || col>2) throw new IllegalArgumentException("Posicao invalida");
        return this.matriz[lin][col]!=null;
    }

    public Marca getMarcaNaPosicao (int lin, int col) throws Exception
    {
        if(lin<0 || lin>2 || col<0 || col>2) throw new IllegalArgumentException("Posicao invalida");
        return this.matriz[lin][col];
    }

    public void setMarcaNaPosicao (Marca mrc, int lin, int col) throws Exception
    {
        if(lin<0 || lin>2 || col<0 || col>2) throw new IllegalArgumentException("Posicao invalida");
        if(matriz[lin][col]!= null) throw new IllegalArgumentException("Posicao ja ocupada");
        if(mrc== null) throw new IllegalArgumentException("Marca invalida");
        this.matriz[lin][col]= mrc;
    }

    @Override
    public String toString ()
    {
        String texto = "";
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(this.matriz[i][j]== null){
                    texto+= " ";
                }else{
                    texto +=this.matriz[i][j];
                }
                if(j<2){
                    texto += " | ";
                }
            }
            if(i<2){
                texto += "\n----------\n";
            }
        }
        return texto;
    }

    @Override
    public boolean equals (Object obj)
    {
        if(this == obj) return true;
        if(obj== null || getClass()!= obj.getClass()) return false;
        Tabuleiro outro = (Tabuleiro) obj;
        return Arrays.deepEquals(this.matriz, outro.matriz);
    }

    @Override
    public int hashCode ()
    {
        return Arrays.deepHashCode(this.matriz);
    }

    // construtor de copia
    public Tabuleiro (Tabuleiro modelo) throws Exception
    {
        if(modelo==null) throw new IllegalArgumentException("Modelo ausente");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                this.matriz[i][j]=modelo.getMarcaNaPosicao(i,j);
            }
        }
    }

    @Override
    public Object clone ()
    {
        try{
            Tabuleiro copia = (Tabuleiro) super.clone();
            copia.matriz = new Marca[3][3];
            for(int i=0; i<3;i++){
                for(int j=0; j<3;j++){
                    copia.matriz[i][j]= this.matriz[i][j];
                }
            }
            return copia;
        }catch(CloneNotSupportedException erro){
            throw new AssertionError("Erro ao clonar o tabuleiro", erro);
        }
       
    }
}