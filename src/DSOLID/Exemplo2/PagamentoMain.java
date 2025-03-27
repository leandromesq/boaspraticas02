package DSOLID.Exemplo2;

public class PagamentoMain {
    public static void main(String[] args) {
        Logger logger = new ConsoleLogger();
        ServicoPagamento servicoPagamento = new ServicoPagamento(logger);
        servicoPagamento.pagar(100.0);

    }
}
