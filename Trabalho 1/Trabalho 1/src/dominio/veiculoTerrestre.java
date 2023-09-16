package dominio;

import java.time.LocalDate;

public abstract class veiculoTerrestre extends veiculoComum{
    protected String chassi;
    protected String placa;
    protected int qtdePortas;
    protected String codigoRenavam;
    protected String estadoUF;
    protected String cidadeUF;

    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public int getQtdePortas() {
        return qtdePortas;
    }
    public void setQtdePortas(int qtdePortas) {
        this.qtdePortas = qtdePortas;
    }
    public String getCodigoRenavam() {
        return codigoRenavam;
    }
    public void setCodigoRenavam(String codigoRenavam) {
        this.codigoRenavam = codigoRenavam;
    }
    public String getEstadoUF() {
        return estadoUF;
    }
    public void setEstadoUF(String estadoUF) {
        this.estadoUF = estadoUF;
    }
    public String getCidadeUF() {
        return cidadeUF;
    }
    public void setCidadeUF(String cidadeUF) {
        this.cidadeUF = cidadeUF;
    }
    public veiculoTerrestre() {
    }
    public veiculoTerrestre(int codigo, String modelo, String cor, LocalDate anoModelo, LocalDate anoFabricacao,
            double pesoLiquido, int assentos, int rodas, String fabricante, String tipoCombustivel, int qtdeMotores,
            int qtdeOcupantes, String chassi, String placa, int qtdePortas, String codigoRenavam, String estadoUF,
            String cidadeUF) {
        super(codigo, modelo, cor, anoModelo, anoFabricacao, pesoLiquido, assentos, rodas, fabricante, tipoCombustivel,
                qtdeMotores, qtdeOcupantes);
        this.chassi = chassi;
        this.placa = placa;
        this.qtdePortas = qtdePortas;
        this.codigoRenavam = codigoRenavam;
        this.estadoUF = estadoUF;
        this.cidadeUF = cidadeUF;
    }
    
} 
