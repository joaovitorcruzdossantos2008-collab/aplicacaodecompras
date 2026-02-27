import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
         int escolha = 0;

        System.out.println("**********************************");
        System.out.println("Digite o limite do cartão: ");
       double limite = leitura.nextDouble();
       Cartaodecredito cartao = new Cartaodecredito(limite);

       int sair = 1;
        while (sair != 0) {
            System.out.println("Digite a descricao da compra: ");
            String descricao = leitura.next();
            System.out.println("Digite o valor da compra: ");
            double valor = leitura.nextDouble();

            ArrayList<compras> listadecompras = new ArrayList<>();
            compras compras =new compras(descricao, valor);
            listadecompras.add(compras);
            boolean comprarealizada = cartao.lancacompra(compras);



           if(comprarealizada) {
               System.out.println("\nCompra realizada!");
               Collections.sort(cartao.getCompras());
               System.out.println("Digite 0 para sair o 1 para continuar");
               int continuar = leitura.nextInt();
           }else {
               sair = 0;
               System.out.println("Saldo insuficiente");
               System.out.println("****************************************");
               System.out.println("Compras realizadas:" + listadecompras);
               System.out.println("*****************************************");
               System.out.println("Saldo do cartão: " +cartao.getSaldo());

           }



        }
    }
}

