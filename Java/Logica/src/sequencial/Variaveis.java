package sequencial;

public class Variaveis {
    public static void main(String[] args) {

        int quantidade = 1500;
        float valorMercadoria = 750.28f;
        double peso = 78.3;
        char genero = 'F';
        System.out.printf("A quantidade de itens em estoque é %d\n",quantidade);
        System.out.printf("O Valor da Parcela é R$%.1f\n", valorMercadoria);
        System.out.printf("O Erinaldo pesa %.2f quilos\n", peso);
        System.out.printf("Do Genero %c tem matriculadas %d alunas", genero, quantidade);

    }
}
