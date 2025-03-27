package OSolid.Exemplo2;

public class PagamentoPix implements RealizarPagamento {

    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com PIX.");

    }

}
