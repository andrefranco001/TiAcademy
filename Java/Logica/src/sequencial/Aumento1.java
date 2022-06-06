package sequencial;

import java.util.Scanner;

public class Aumento1 {
    public static void main(String[] args) {

        double salarioBruto;
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o Salário Bruto: R$ ");
        salarioBruto = scan.nextDouble();

        salarioBruto = salarioBruto * 1.05;

        System.out.printf("O Novo Sálario Bruto é R$ %.2f", salarioBruto);
        scan.close();

    }
}
