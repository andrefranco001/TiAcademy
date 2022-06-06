package repeticao;

import java.util.Scanner;

public class MediaAlunosFor {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double total = 0;
        int contador;

        for(contador = 0; contador <= 9; contador++) {
            System.out.printf("Digite a %dª nota: ", contador+1);
            double nota = scan.nextDouble();
            total += nota;
        }

        double media = total / contador;

        System.out.printf("\nTotal de alunos da classe: %d", contador);
        System.out.printf("\nO total de notas dos alunos: %.1f", total);
        System.out.printf("\nA Média da classe %.1f", media);

        scan.close();
    }
}
