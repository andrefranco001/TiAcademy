package checkpoint_30_05_2022;

import java.util.Scanner;

public class Registro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String disciplina, resutaltado;
        int quantidade, faltas;
        double n1, n2, n3, n4, media;

        System.out.print("Digite a disciplina: ");
        disciplina = sc.next();

        System.out.print("Informe a quantidade de aulas: ");
        quantidade = sc.nextInt();

        System.out.println("Informe as 4 Notas: ");
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        n3 = sc.nextDouble();
        n4 = sc.nextDouble();

        System.out.print("Informe a quantidade de faltas: ");
        faltas = sc.nextInt();

        media = (n1+n2+n3+n4)/4;

        if ((media >= 6.0) && (faltas < quantidade * 0.25)) {
            resutaltado = "Aprovado";
        } else {
            resutaltado = "Reprovado";
        }

        System.out.printf("A disciplina de %s teve %d aulas.\n", disciplina, quantidade);
        System.out.printf("O aluno tirou %.1f, %.1f, %.1f, %.1f e obteve média %.1f.\n",n1, n2, n3, n4, media);
        System.out.printf("O aluno faltou %d vezes.\n", faltas);
        System.out.printf("O aluno está %s", resutaltado);
    }
}
