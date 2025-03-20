package SSolid.Exemplo2;

import java.util.Scanner;

public class LeitorDeEncomendas {
    public String lerIdEncomenda() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o ID da encomenda: ");
        return sc.nextLine();
    }
}
