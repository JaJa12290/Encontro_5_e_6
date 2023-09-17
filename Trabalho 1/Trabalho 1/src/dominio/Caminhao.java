package dominio;

import java.time.LocalDate;

public class Caminhao extends veiculoCarga{
    private String carga;
    private String destino;
    public String getCarga() {
        return carga;
    }
    public void setCarga(String carga) {
        this.carga = carga;
    }
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public Caminhao() {
    }
    public Caminhao(int codigo, String modelo, String cor, LocalDate anoModelo, LocalDate anoFabricacao,
            double pesoLiquido, int assentos, int rodas, String fabricante, String tipoCombustivel, int qtdeMotores,
            int qtdeOcupantes, String chassi, String placa, int qtdePortas, String codigoRenavam, String estadoUF,
            String cidadeUF, double pesoTotal, int eixos, String empresa, String carga, String destino) {
        super(codigo, modelo, cor, anoModelo, anoFabricacao, pesoLiquido, assentos, rodas, fabricante, tipoCombustivel,
                qtdeMotores, qtdeOcupantes, chassi, placa, qtdePortas, codigoRenavam, estadoUF, cidadeUF, pesoTotal,
                eixos, empresa);
        this.carga = carga;
        this.destino = destino;
    }
    @Override
    public void Imprimir() {
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ano do Modelo: " + this.anoModelo);
        System.out.println("Ano de Fabricacao: " + this.anoFabricacao);
        System.out.println("Peso Liquido: " + this.pesoLiquido);
        System.out.println("Assentos: " + this.assentos);
        System.out.println("Rodas: " + this.rodas);
        System.out.println("Fabricante: " + this.fabricante);
        System.out.println("Tipo de Combustivel: " + this.tipoCombustivel);
        System.out.println("Quantidade de Mototores: " + this.qtdeMotores);
        System.out.println("Quantidade de Ocupantes: " + this.qtdeOcupantes);
        System.out.println("Chassi: " + this.chassi);
        System.out.println("Placa: " + this.placa);
        System.out.println("Quantidade de Portas: " + this.qtdePortas);
        System.out.println("Codigo Renavam: " + this.codigoRenavam);
        System.out.println("EstadoUF: " + this.estadoUF);
        System.out.println("CidadeUF: " + this.cidadeUF);
        System.out.println("Peso Total: " + this.pesoTotal);
        System.out.println("Eixos: " + this.eixos);
        System.out.println("Empresa: " + this.empresa);
        System.out.println("Carga: " + this.carga);
        System.out.println("Destino: " + this.destino);
    }  
    
}
