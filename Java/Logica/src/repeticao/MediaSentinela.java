package repeticao;

import java.util.Scanner;

public class MediaSentinela {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double total = 0;
        int contador = 0;

        System.out.print("Digite uma nota ou -1 para sair: ");
        double nota = scan.nextDouble();

        while (nota != -1){
            total += nota;
            contador++;

            System.out.print("Digite uma nota ou -1 para sair: ");
            nota = scan.nextDouble();
        }

        if (contador != 0) {
            double media = total / contador;
            System.out.printf("\nO Total de alunos é %d", contador);
            System.out.printf("\nTotal de notas computadas: %.1f", total);
            System.out.printf("\nMédia da classe: %.1f", media);
        } else {
            System.out.println("\nSem notas cadastradas");
        }

        scan.close();

    }
}
