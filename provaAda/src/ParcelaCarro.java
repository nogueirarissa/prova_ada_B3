import java.util.Scanner;

public class ParcelaCarro {

    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor total do carro:");
        double valorCarro = scan.nextDouble();

        if (valorCarro < 1000) {
            System.out.println("Desculpe, o valor mínimo para parcelamento é de 1000,00 reais.");
        } else {
            double valorMinimoParcela = 1000;
            int numeroParcelas = (int) (valorCarro / valorMinimoParcela);

            System.out.println("O carro pode ser parcelado em até: " + numeroParcelas+" vezes.");
        }

    }
}
