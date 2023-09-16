package dominio;

import java.time.LocalDate;

public abstract class veiculoAereo extends veiculoComum{
    protected int codigoCauda;
    protected String porte;
    
    public int getCodigoCauda() {
        return codigoCauda;
    }
    public void setCodigoCauda(int codigoCauda) {
        this.codigoCauda = codigoCauda;
    }
    public String getPorte() {
        return porte;
    }
    public void setPorte(String porte) {
        this.porte = porte;
    }
    public veiculoAereo() {
    }
    public veiculoAereo(int codigo, String modelo, String cor, LocalDate anoModelo, LocalDate anoFabricacao,
            double pesoLiquido, int assentos, int rodas, String fabricante, String tipoCombustivel, int qtdeMotores,
            int qtdeOcupantes, int codigoCauda, String porte) {
        super(codigo, modelo, cor, anoModelo, anoFabricacao, pesoLiquido, assentos, rodas, fabricante, tipoCombustivel,
                qtdeMotores, qtdeOcupantes);
        this.codigoCauda = codigoCauda;
        this.porte = porte;
    }
    
}