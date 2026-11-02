package jogo;
import java.util.Objects;

public class Marca
{
    private char simbolo;

    public Marca (char smb) throws Exception
    {
        if(smb != 'X' && smb != 'O') throw new IllegalArgumentException("Marca invalida");
        this.simbolo = smb;
    }

    public char getSimbolo ()
    {
        return this.simbolo;
    }

    @Override
    public String toString ()
    {
        return ""+simbolo;
    }

    @Override
    public boolean equals (Object obj)
    {
        if(obj == this) return true;
        if(obj == null || obj.getClass()!= this.getClass()) return false;
        Marca outra = (Marca) obj;
        return this.simbolo == outra.simbolo;
    }

    @Override
    public int hashCode ()
    {
        return Objects.hash(simbolo);
    }
}