package ISOLID.Exemplo2;

public class VeiculoMain {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Aviao aviao = new Aviao();
        aviao.dirigir();
        aviao.voar();
        carro.dirigir();
    }
}
