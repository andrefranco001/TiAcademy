package exercicios;

import java.util.Scanner;

public class Exe_4 {
    public static void main(String[] args) {
        /*Faça um programa que receba a nota de 10 alunos. Para cada nota recebida, se a nota for maior
        * ou igual a 6.0 o aluni está aprovado, caso contrário o aluno está reprovado. No final da execução
        * o programa deve apresentar a quantidade de alunos aprovados e reprovados, além da média da turma*/
        Scanner scan = new Scanner(System.in);

        double total = 0;
        int contador;
        int aprovados = 0, reprovados = 0;

        for(contador=0; contador < 10; contador++) {
            System.out.printf("Informe a %dª nota: ", contador+1);
            double nota = scan.nextDouble();
            total += nota;

            if (nota >= 6.0){
                aprovados++;
            } else {
                reprovados++;
            }
        }

        double media = total / contador;

        System.out.printf("\n\nAlunos aprovados: %d", aprovados);
        System.out.printf("\nAlunos reprovados: %d", reprovados);
        System.out.printf("\nMédia da turma: %.1f", media);

        scan.close();
    }
}
