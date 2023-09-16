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
    
}
