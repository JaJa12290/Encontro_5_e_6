import java.time.LocalDate;

import dominio.*;

public class App {
    public static void main(String[] args) throws Exception {
        Aviao a1 = new Aviao(7623, "Cessna 210", "Branco", LocalDate.ofYearDay(1957, 10), LocalDate.ofYearDay(1980, 25), 1045.21, 6, 3, "Cessna Aircraft Company", "Avgas", 1, 6, 104351, "Pequeno",LocalDate.of(1991, 11, 15));
        Caminhao cm1 = new Caminhao(58931, "Scania R 480", "Cinza", LocalDate.ofYearDay(2004, 15), LocalDate.ofYearDay(2006, 31), 9917, 2, 10, "Scania", "Diesel", 1, 2, "9BU219583WC4L0H01", "HMO1N65", 2, "00B72561", "MS", "DRD", 15213, 3, "Kibon", "Palistos de Picolé", "Camapuã");
        Onibus o1 = new Onibus(1312, "Mecedes", "Preto", LocalDate.ofYearDay(2050, 2), LocalDate.ofYearDay(2007, 21), 3001, 31, 10, "Mercedes", "Diesel", 1, 31, "9BU219583WK230H01", "HAE3L31", 3, "00B72561", "MS", "CPG", 5012, 2, "Trasnportes MS", "Guaicurus", 102);
        Motocicleta m1 = new Motocicleta(1741, "Biz", "Vermelha", LocalDate.ofYearDay(2005, 10), LocalDate.ofYearDay(2006, 29), 102, 2, 2, "Honda", "Gasolina", 1, 2, "9BUJ71583WK251H01", "MAP3L62", 0, "00B7252445", "MS", "CPG", "Joaozinho de Tal", "Motoneta", 125);
        Carro c1 = new Carro(40921, "Grand Siena", "Prata", LocalDate.ofYearDay(2021, 9), LocalDate.ofYearDay(2021, 31), 1094, 5, 4, "Fiat", "Gasolina ou Etanol", 1, 5, "9BUJ71453WK900H01", "HMQ6Y21", 4, "00B725238", "MS", "CPG", "Pedrinho Fulano", "Sedan", 84);


        System.out.println("Informações do Avião: \n");
        a1.Imprimir();
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
        System.out.println("\nInformações do Caminhão: \n");
        cm1.Imprimir();
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
        System.out.println("\nInformações do Ônibus: \n");
        o1.Imprimir();
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
        System.out.println("\nInformações da Motocicleta: \n");
        m1.Imprimir();
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
        System.out.println("\nInformações do Carro: \n");
        c1.Imprimir();
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
    }
}
 