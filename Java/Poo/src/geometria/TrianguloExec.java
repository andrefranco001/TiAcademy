package geometria;

import java.util.Scanner;

public class TrianguloExec {

    public static void main(String[] args) {
        Triangulo a = new Triangulo();
        Triangulo b = new Triangulo();

        entrada(a);
        if (a.validar()) {
            System.out.println(a.toString());
        }
        else {
        System.out.println("\nOs lados informados não representam um Triângulo\n\n");
        }

        entrada(b);
        if (b.validar()) {
            System.out.println(b);
        }
        else {
            System.out.println("\nOs lados informados não representam um Triângulo\n\n");
        }

    }

    public static void entrada(Triangulo lado) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\n\nDigite os valores dos lados: ");
        lado.x = scan.nextDouble();
        lado.y = scan.nextDouble();
        lado.z = scan.nextDouble();
    }
}

