package dominio;

import java.time.LocalDate;

public class Aviao extends veiculoAereo{
    private LocalDate dataPartida;

    public LocalDate getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(LocalDate dataPartida) {
        this.dataPartida = dataPartida;
    }

    public Aviao() {
    }
    public Aviao(int codigo, String modelo, String cor, LocalDate anoModelo, LocalDate anoFabricacao,
            double pesoLiquido, int assentos, int rodas, String fabricante, String tipoCombustivel, int qtdeMotores,
            int qtdeOcupantes, int codigoCauda, String porte, LocalDate dataPartida) {
        super(codigo, modelo, cor, anoModelo, anoFabricacao, pesoLiquido, assentos, rodas, fabricante, tipoCombustivel,
                qtdeMotores, qtdeOcupantes, codigoCauda, porte);
        this.dataPartida = dataPartida;
    }

    @Override
    public void Imprimir() {
       System.out.println("Codigo: " + this.codigo);
       System.out.println("Codigo cauda: " + this.codigoCauda);
       System.out.println("Modelo: " + this.modelo);
       System.out.println("Ano do Modelo: " + this.anoModelo);
       System.out.println("Ano de Fabricacao: " + this.anoFabricacao);
       System.out.println("Peso Liquido: " + this.pesoLiquido);
       System.out.println("Assentos: " + this.assentos);
       System.out.println("Rodas: " + this.rodas);
       System.out.println("Fabricante: " + this.fabricante);
       System.out.println("Tipo de Combustivel: " + this.tipoCombustivel);
       System.out.println("Quantidade de Mototores: " + this.qtdeMotores);
       System.out.println("Quantidade de Ocupantes: " + this.qtdeOcupantes);
       System.out.println("Cor: " + this.cor);
       System.out.println("Porte: " + this.porte);
       System.out.println("Data de Partida: " + this.dataPartida); 
    }
    
}
