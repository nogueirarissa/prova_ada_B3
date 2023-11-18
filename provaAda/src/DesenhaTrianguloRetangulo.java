import java.util.Scanner;

public class DesenhaTrianguloRetangulo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int alturaTriangulo = scan.nextInt();

        for (int i = 0; i < alturaTriangulo; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
