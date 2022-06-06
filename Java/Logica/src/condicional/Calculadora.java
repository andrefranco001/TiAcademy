package condicional;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        int opcao;
        double num1, num2;
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o 1º Valor: ");
        num1 = scan.nextDouble();
        System.out.print("Informe o 2º Valor: ");
        num2 = scan.nextDouble();

        System.out.println("\n\nCalculadora");
        System.out.println("\n1. Soma \n2. Subtração \n3. Multiplicação \n4. Divisão");
        System.out.println("\nEscolha uma opção:");
        opcao = scan.nextInt();

        switch(opcao){
            case 1:
                System.out.printf("%.2f + %.2f = %.2f", num1, num2, num1+num2);
                break;
            case 2:
                System.out.printf("%.2f - %.2f = %.2f", num1, num2, num1-num2);
                break;
            case 3:
                System.out.printf("%.2f * %.2f = %.2f", num1, num2, num1*num2);
                break;
            case 4:
                System.out.printf("%.2f / %.2f = %.2f", num1, num2, num1/num2);
                break;
            default:
                System.out.println("Opção Inválida");
        }

        scan.close();
    }
}
