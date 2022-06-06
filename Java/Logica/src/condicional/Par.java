package condicional;

import java.util.Scanner;

public class Par {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num;

        System.out.print("Informe um número: ");
        num = scan.nextInt();

        if (num % 2 == 0) {
            System.out.printf("O número %d é par.\n", num);
        }
        System.out.println("\nEncerrando a execução.");

        scan.close();

    }
}
