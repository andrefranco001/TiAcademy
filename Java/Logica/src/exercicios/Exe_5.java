package exercicios;

import java.util.Scanner;

public class Exe_5 {
    public static void main(String[] args) {
        /* Veja a tabela do aumento do salário mínimo de 2015 até 2021
         Um Funcionário foi admitido em 2016 recebendo um salário inicial de aumento do salário minimo.
         Calcule o salário do funcionario no ano atual ( Programa deve receber de entrada ano e % ?)
        *         Ano      |     Percentual
        *        2015      -        8,80%
        *        2016      -       11,67%
        *        2017      -        6,47%
        *        2018      -        1,81%
        *        2019      -        4,61%
        *        2020      -        4,68%
        *        2021      -        5,26%
        *        2022      -       10,00% */

        Scanner scan = new Scanner(System.in);

        double salarioatual = 1000.00;
        int anoAdmissao = 2016;

        System.out.print("Informe o ano atual: ");
        int anoAtual = scan.nextInt();

        while (anoAdmissao != (anoAtual+1)) {
            System.out.printf("\nInforme a porcentagem do aumento do ano de %d: ", anoAdmissao);
            double aumento = scan.nextDouble();
            salarioatual = salarioatual + (salarioatual * aumento/100);
            System.out.printf("\nSalário atual: R$ %.2f", salarioatual);
            anoAdmissao++;
        }
        System.out.printf("\nO Salário do ano %d é de R$ %.2f", anoAtual, salarioatual);

        scan.close();
    }
}
