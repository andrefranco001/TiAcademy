package sequencial;

import java.util.Scanner;

public class INSS {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double salarioBruto;

        System.out.print("Informe o Salário Bruto: ");
        salarioBruto = scan.nextDouble();

        salarioBruto = salarioBruto * 0.89;
        System.out.printf("O Salário com o desconto do INSS resulta em R$ %.2f", salarioBruto);

    }
}
