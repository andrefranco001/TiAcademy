package sequencial;

import java.util.Scanner;

public class Aumento2 {
    public static void main(String[] args) {

        double salarioBruto, percentual;
        Scanner scan = new Scanner(System.in);

        System.out.print("informe o Salário Bruto: R$ ");
        salarioBruto = scan.nextDouble();
        System.out.print("Informe o Percentual de Aumento: ");
        percentual = scan.nextDouble();

        double salarioBrutoNovo = salarioBruto * (1 + percentual/100);
        System.out.printf("O Salário Bruto passou de %.2f para %.2f pois recebeu %.0fpor cento de aumento", salarioBruto, salarioBrutoNovo, percentual);
    }
}
