package repeticao;

import java.util.Scanner;

public class MediaAlunos {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double total = 0;
        int contador = 0;

        while (contador <= 9) {
            System.out.printf("Digite a %dª nota: ", contador+1);
            double nota = scan.nextDouble();
            total += nota;
            contador++;
        }

        double media = total / contador;

        System.out.printf("\n\nTotal de todas as notas é %.1f", total);
        System.out.printf("\nTotal de alunos: %d", contador);
        System.out.printf("\nMédia da classe é %.1f", media);

        scan.close();
    }
}
