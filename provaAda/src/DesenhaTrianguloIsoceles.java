import java.util.Scanner;

public class DesenhaTrianguloIsoceles {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int alturaTriangulo = scan.nextInt();

        for (int i = 0; i < alturaTriangulo; i++) {
            for (int j = alturaTriangulo - i - 1; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = alturaTriangulo - 1; i >= 0; i--) {
            for (int j = alturaTriangulo - i - 1; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}