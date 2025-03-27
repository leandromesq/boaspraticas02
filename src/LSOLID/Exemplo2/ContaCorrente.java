package LSOLID.Exemplo2;

public class ContaCorrente extends ContaBancaria {
    public void sacar(double valor) {
        saldo -= valor;
        System.out.println("Saque de R$" + valor + " realizado com sucesso!");
    }
}
