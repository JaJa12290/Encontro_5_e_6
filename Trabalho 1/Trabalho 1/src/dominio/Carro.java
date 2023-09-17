package dominio;

import java.time.LocalDate;

public class Carro extends veiculoUtilitario {
    private int cavalos;

    public int getCavalos() {
        return cavalos;
    }

    public void setCavalos(int cavalos) {
        this.cavalos = cavalos;
    }

    public Carro() {
    }

    public Carro(int codigo, String modelo, String cor, LocalDate anoModelo, LocalDate anoFabricacao,
            double pesoLiquido, int assentos, int rodas, String fabricante, String tipoCombustivel, int qtdeMotores,
            int qtdeOcupantes, String chassi, String placa, int qtdePortas, String codigoRenavam, String estadoUF,
            String cidadeUF, String nomeProprietario, String tipoVeiculo, int cavalos) {
        super(codigo, modelo, cor, anoModelo, anoFabricacao, pesoLiquido, assentos, rodas, fabricante, tipoCombustivel,
                qtdeMotores, qtdeOcupantes, chassi, placa, qtdePortas, codigoRenavam, estadoUF, cidadeUF,
                nomeProprietario, tipoVeiculo);
        this.cavalos = cavalos;
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
        System.out.println("Nome do Proprietario: " + this.nomeProprietario);
        System.out.println("Tipo do Veiculo: " + this.tipoVeiculo);
        System.out.println("Cavalos: " + this.cavalos);

    }
}