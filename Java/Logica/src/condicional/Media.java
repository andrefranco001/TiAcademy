package condicional;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {

        double n1, n2, n3;
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a 1ª nota: ");
        n1 = scan.nextDouble();
        System.out.print("Informe a 2ª nota: ");
        n2 = scan.nextDouble();
        System.out.print("Informe a 3ª nota: ");
        n3 = scan.nextDouble();

        double media = (n1+n2+n3)/3;
        String resultado;

        if (media >= 6.0) {
            resultado = "Aprovado";
        } else {
            resultado = "Reprovado";
        }

        System.out.printf("\nO aluno obteve média %.1f e está %s", media, resultado);
        System.out.println("\nEncerrado.");

        scan.close();
    }
}
