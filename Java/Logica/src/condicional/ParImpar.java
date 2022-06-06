package condicional;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num;
        String resultado;

        System.out.print("Informe um número: ");
        num = scan.nextInt();

        if (num % 2 == 0) {
            resultado = "par";
        } else {
            resultado = "impar";
        }

        System.out.printf("\nO número %d é %s", num, resultado);
        System.out.println("\nEncerrando a execução.");

        scan.close();
    }
}
