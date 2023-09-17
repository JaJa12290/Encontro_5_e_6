package dominio;

import java.time.LocalDate;

public abstract class veiculoCarga extends veiculoTerrestre{
    protected double pesoTotal;
    protected int eixos;
    protected String empresa;
    
    public double getPesoTotal() {
        return pesoTotal;
    }
    public void setPesoTotal(double pesoTotal) {
        this.pesoTotal = pesoTotal;
    }
    public int getEixos() {
        return eixos;
    }
    public void setEixos(int eixos) {
        this.eixos = eixos;
    }
    public String getEmpresa() {
        return empresa;
    }
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    public veiculoCarga() {
    }
    public veiculoCarga(int codigo, String modelo, String cor, LocalDate anoModelo, LocalDate anoFabricacao,
            double pesoLiquido, int assentos, int rodas, String fabricante, String tipoCombustivel, int qtdeMotores,
            int qtdeOcupantes, String chassi, String placa, int qtdePortas, String codigoRenavam, String estadoUF,
            String cidadeUF, double pesoTotal, int eixos, String empresa) {
        super(codigo, modelo, cor, anoModelo, anoFabricacao, pesoLiquido, assentos, rodas, fabricante, tipoCombustivel,
                qtdeMotores, qtdeOcupantes, chassi, placa, qtdePortas, codigoRenavam, estadoUF, cidadeUF);
        this.pesoTotal = pesoTotal;
        this.eixos = eixos;
        this.empresa = empresa;
    }
     
}
