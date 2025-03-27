package ISOLID.Exemplo2;

public class Aviao implements VeiculoQueVoa {

    @Override
    public void dirigir() {
        System.out.println("Avião está dirigindo na pista...");
    }

    @Override
    public void voar() {
        System.out.println("Avião está voando...");
    }

}
