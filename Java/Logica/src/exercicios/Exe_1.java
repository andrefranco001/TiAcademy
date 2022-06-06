package exercicios;

import java.util.Scanner;

public class Exe_1 {
    public static void main(String[] args) {
        /* Faça um programa que receba como entradas o nome da disciplina e a quantidade de aulas dadas. Além disso
        * o programa deve solicitar as notas de um aluno nos 4 bimestres, calcular a média e mostrar o total de faltas
        * no ano letivo. O programa deve retornar a média do aluno, indicar se o aluno foi aprovado considerando a
        * média superior a 6,0 e as presenças superior ou igual a 75% das aulas dadas */

        Scanner scan = new Scanner(System.in);

        String disciplina, resultado;
        int quantidadeAulas, faltas;
        double n1, n2, n3, n4, media;

        System.out.print("Informe a Disciplina: ");
        disciplina = scan.next();
        System.out.print("Informe a quantidade de aulas dadas: ");
        quantidadeAulas = scan.nextInt();

        System.out.print("Informe a Nota do 1º Bimestre: ");
        n1 = scan.nextDouble();
        System.out.print("Informe a Nota do 2º Bimestre: ");
        n2 = scan.nextDouble();
        System.out.print("Informe a Nota do 3º Bimestre: ");
        n3 = scan.nextDouble();
        System.out.print("Informe a Nota do 4º Bimestre: ");
        n4 = scan.nextDouble();

        System.out.print("Informe a quantidade de faltas do aluno: ");
        faltas = scan.nextInt();

        media = (n1+n2+n3+n4)/4;

        if ((media >= 6.0) && (faltas <= quantidadeAulas*0.25)){
            resultado = "Aprovado";
        } else {
            resultado = "Reprovado";
        }

        System.out.printf("O Aluno teve media de %.2f na disciplina %s, portanto o aluno está %s", media, disciplina, resultado);

        scan.close();
    }
}
