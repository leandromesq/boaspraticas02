package OSolid.Exemplo1;

public class MainCalculadora {

    public static void main(String[] args) {
        CalculadoraDesconto calculadoraDesconto = new CalculadoraDesconto();
        double valor = 100.0;
        System.out.println("Desconto Black Friday: " + calculadoraDesconto.calcular(valor, new DescontoBlackFriday()));
        System.out.println("Desconto Natal: " + calculadoraDesconto.calcular(valor, new DescontoNatal()));
        System.out.println("Desconto Aniversario: " + calculadoraDesconto.calcular(valor, new DescontoAniversario()));
    }
}
