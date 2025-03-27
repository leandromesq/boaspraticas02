package OSolid.Exemplo2;

public class PagamentoCartao implements RealizarPagamento {

    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com CARTÃO.");
    }

}
