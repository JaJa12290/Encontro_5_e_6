package dominio;

import java.time.LocalDate;

public abstract class veiculoComum extends veiculoIdentificador implements IImpressao{
    protected String modelo;
    protected String cor;
    protected LocalDate anoModelo;
    protected LocalDate anoFabricacao;
    protected double pesoLiquido;
    protected int assentos;
    protected int rodas;
    protected String fabricante;
    protected String tipoCombustivel;
    protected int qtdeMotores;
    protected int qtdeOcupantes;
    
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public LocalDate getAnoModelo() {
        return anoModelo;
    }
    public void setAnoModelo(LocalDate anoModelo) {
        this.anoModelo = anoModelo;
    }
    public LocalDate getAnoFabricacao() {
        return anoFabricacao;
    }
    public void setAnoFabricacao(LocalDate anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
    public double getPesoLiquido() {
        return pesoLiquido;
    }
    public void setPesoLiquido(double pesoLiquido) {
        this.pesoLiquido = pesoLiquido;
    }
    public int getAssentos() {
        return assentos;
    }
    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }
    public int getRodas() {
        return rodas;
    }
    public void setRodas(int rodas) {
        this.rodas = rodas;
    }
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }
    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
    public int getQtdeMotores() {
        return qtdeMotores;
    }
    public void setQtdeMotores(int qtdeMotores) {
        this.qtdeMotores = qtdeMotores;
    }
    public int getQtdeOcupantes() {
        return qtdeOcupantes;
    }
    public void setQtdeOcupantes(int qtdeOcupantes) {
        this.qtdeOcupantes = qtdeOcupantes;
    }
    public veiculoComum() {
    }
    public veiculoComum(int codigo, String modelo, String cor, LocalDate anoModelo, LocalDate anoFabricacao,
            double pesoLiquido, int assentos, int rodas, String fabricante, String tipoCombustivel, int qtdeMotores,
            int qtdeOcupantes) {
        super(codigo);
        this.modelo = modelo;
        this.cor = cor;
        this.anoModelo = anoModelo;
        this.anoFabricacao = anoFabricacao;
        this.pesoLiquido = pesoLiquido;
        this.assentos = assentos;
        this.rodas = rodas;
        this.fabricante = fabricante;
        this.tipoCombustivel = tipoCombustivel;
        this.qtdeMotores = qtdeMotores;
        this.qtdeOcupantes = qtdeOcupantes;
    }
    
}
