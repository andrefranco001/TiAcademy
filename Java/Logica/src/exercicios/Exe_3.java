package exercicios;

import java.util.Scanner;

public class Exe_3 {
    public static void main(String[] args) {
        /*O Programa deve receber um valor inteiro de entrada entre 1 e 7, onde 1 é domingo e 7 é sábado,
        * referente aos dias da semana. O retorno deve ser o dia da semana */

        Scanner scan =  new Scanner(System.in);
        int diaSemana;

        System.out.print("Informe um valor entre 1 e 7: ");
        diaSemana = scan.nextInt();
        switch (diaSemana){
            case 1:
                System.out.print("Domingo");
                break;
            case 2:
                System.out.print("Segunda-Feira");
                break;
            case 3:
                System.out.print("Terça-Feira");
                break;
            case 4:
                System.out.print("Quarta-Feira");
                break;
            case 5:
                System.out.print("Quinta-Feira");
                break;
            case 6:
                System.out.print("Sexta-Feira");
                break;
            case 7:
                System.out.print("Sábado");
                break;
            default:
                System.out.print("Valor Inválido, não existe esse dia da semana");
        }
        scan.close();
    }
}