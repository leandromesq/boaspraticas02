package SSolid.Exemplo2;

import java.util.Scanner;

public class ProcessadorEncomendas {
    private LeitorDeEncomendas leitorDeEncomenda;
    private CalculadoraDeFretes calculadoraDeFrete;
    private SalvarEmArquivo salvarEmArquivo;
    Scanner sc = new Scanner(System.in);

    public ProcessadorEncomendas() {
        leitorDeEncomenda = new LeitorDeEncomendas();
        calculadoraDeFrete = new CalculadoraDeFretes();
        salvarEmArquivo = new SalvarEmArquivo();
    }

    public void processar() {
        String idEncomenda = leitorDeEncomenda.lerIdEncomenda();
        System.out.println("Digite o peso (em kg): ");
        double peso = sc.nextDouble();
        double valorFrete = calculadoraDeFrete.calcularFrete(peso);
        System.out.println("Valor do frete calculado: " + valorFrete);
        salvarEmArquivo.salvar(idEncomenda, valorFrete);
    }
}
