package LSOLID.Exemplo2;

public class ContaBancaria {
    protected double saldo;

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Deposito de R$" + valor + " realizado com sucesso!");
    }

    public double getSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
        return saldo;
    }
}
