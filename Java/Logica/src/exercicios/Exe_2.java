package exercicios;

import java.util.Scanner;

public class Exe_2 {
    public static void main(String[] args) {
        /*O Programa recebe a renda de um funcionario. Calcule e mostre o desconto do imposto de renda com base
        * na tabela a seguir:
        *       Valor            |    Aliquota
        *  Até R$ 1903,98        -      Isento
        *  R$ 2826,65            -      7,5%
        *  R$ 3751,06            -       15%
        *  R$ 4664,68            -     22,5%
        * > R$ 4664,68           -     27,5% */

        Scanner scan = new Scanner(System.in);
        double renda, ir;

        System.out.print("Informe o Salário: ");
        renda = scan.nextDouble();

        if (renda <= 1903.98) {
           ir = 0;
        } else if (renda <= 2826.65) {
            ir = 0.075;
            renda = renda - (renda * ir);
        } else if (renda <= 3751.06) {
            ir = 0.15;
            renda = renda - (renda * ir);
        } else if (renda <= 4664.68) {
            ir = 0.225;
            renda = renda - (renda * ir);
        } else {
            ir = 0.275;
            renda = renda - (renda * ir);
        }

        System.out.printf("O imposto de renda (em porcentagem) para seu salário é de %.1f", ir * 100);
        System.out.printf("\nSeu Salário final é de %.2f", renda);

        scan.close();
    }
}
