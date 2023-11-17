import java.util.Scanner;

public class CalculadoraEmprestimo {
    public static void main (String [] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor que você deseja para o empréstimo: ");
        double totalSaldoDevedor = scan.nextDouble();

        System.out.print("Digite a taxa de juros mensal no formato de porcentagem: ");
        double jurosMensal = scan.nextDouble() / 100;

        System.out.print("Digite o número de meses: ");
        int totalDeMeses = scan.nextInt();


        double amortizacao = totalSaldoDevedor / totalDeMeses;
        double saldoDevedorAtual = totalSaldoDevedor;
        double totalQuitado = 0;
        double totalAmortizado = 0;
        double totalJurosPago = 0;


        System.out.println("Valor fixo da amortização R$"+amortizacao+","+"Saldo devedor total R$"+totalSaldoDevedor+" com um juros de "+jurosMensal*100+"% ao mês");

        for (int i = 1; i<= totalDeMeses; i++){
            double juros = saldoDevedorAtual * jurosMensal;
            double parcelaMensal = juros + amortizacao;

            totalQuitado += parcelaMensal;
            totalAmortizado += amortizacao;
            totalJurosPago += juros;

            saldoDevedorAtual -= amortizacao;

            System.out.println("Parcela "+i+" | "+"Juros: R$ "+juros+" | "+"Prestação: R$ "+parcelaMensal+" | "+"Saldo Devedor: R$"+saldoDevedorAtual);
        }

        System.out.println("Prestação R$ "+totalQuitado+ " Juros R$: "+ totalJurosPago+" Amortização R$: "+totalAmortizado);

    }
}
