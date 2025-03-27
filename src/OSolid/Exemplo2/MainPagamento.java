package OSolid.Exemplo2;

public class MainPagamento {
    public static void main(String[] args) {
        SistemaPagamento sistemaPagamento = new SistemaPagamento();
        final double valor = 100.0;
        sistemaPagamento.realizarPagamento(valor, new PagamentoCartao());
        sistemaPagamento.realizarPagamento(valor, new PagamentoPix());
        sistemaPagamento.realizarPagamento(valor, new PagamentoBoleto());
    }
}
