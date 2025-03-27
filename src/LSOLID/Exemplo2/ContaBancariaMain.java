package LSOLID.Exemplo2;

public class ContaBancariaMain {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        ContaPoupanca contaPoupanca = new ContaPoupanca();

        contaCorrente.depositar(100.0);
        contaCorrente.sacar(50.0);
        contaCorrente.getSaldo();

        contaPoupanca.depositar(100.0);
        contaPoupanca.getSaldo();
    }
}
