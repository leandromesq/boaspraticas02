package DSOLID.Exemplo2;

public class ServicoPagamento {
    private Logger logger;

    public ServicoPagamento(Logger logger) {
        this.logger = logger;
    }

    public void pagar(double valor) {
        // Lógica de pagamento
        logger.log("Pagamento de R$" + valor + " realizado com sucesso!");
    }
}
