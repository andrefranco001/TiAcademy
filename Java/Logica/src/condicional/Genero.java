package condicional;

import java.util.Scanner;

public class Genero {
    public static void main(String[] args) {

        char genero;
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o genero (F ou M): ");
        genero = scan.next().charAt(0);
        genero = Character.toUpperCase(genero);

        System.out.println((genero == 'F') ? "Feminino" : (genero == 'M') ? "Masculino" : "valor Inválido");
        scan.close();
    }
}
