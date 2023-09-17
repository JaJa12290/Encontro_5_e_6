package dominio;

import java.time.LocalDate;

public class Motocicleta extends veiculoUtilitario {
    private int cilindradas;

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public Motocicleta() {
    }

    public Motocicleta(int codigo, String modelo, String cor, LocalDate anoModelo, LocalDate anoFabricacao,
            double pesoLiquido, int assentos, int rodas, String fabricante, String tipoCombustivel, int qtdeMotores,
            int qtdeOcupantes, String chassi, String placa, int qtdePortas, String codigoRenavam, String estadoUF,
            String cidadeUF, String nomeProprietario, String tipoVeiculo, int cilindradas) {
        super(codigo, modelo, cor, anoModelo, anoFabricacao, pesoLiquido, assentos, rodas, fabricante, tipoCombustivel,
                qtdeMotores, qtdeOcupantes, chassi, placa, qtdePortas, codigoRenavam, estadoUF, cidadeUF,
                nomeProprietario, tipoVeiculo);
        this.cilindradas = cilindradas;
    }
    @Override
    public void Imprimir() {
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Modelo" + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ano do Modelo: " + this.anoModelo);
        System.out.println("Ano da Fabricação: " + this.anoFabricacao);
        System.out.println("Peso Liquido: " + this.pesoLiquido);
        System.out.println("Assentos: " + this.assentos);
        System.out.println("Rodas: " + this.rodas);
        System.out.println("Fabricante: " + this.fabricante);
        System.out.println("Tipo de Combustivel: " + this.tipoCombustivel);
        System.out.println("Quantidade de Motores: " + this.qtdeMotores);
        System.out.println("Quantidade de Ocupantes: " + this.qtdeOcupantes);
        System.out.println("Chassi: " + this.chassi);
        System.out.println("Placa: " + this.placa);
        System.out.println("Qantidade de Portas: " + this.qtdePortas);
        System.out.println("Codigo Renavam: " + this.codigoRenavam);
        System.out.println("Estado UF: " + this.estadoUF);
        System.out.println("Cidade UF: " + this.nomeProprietario);
        System.out.println("Tipo do Veiculo: " + this.tipoVeiculo);
        System.out.println("Cilindrada: " + this.cilindradas);
    }
    
    
}
