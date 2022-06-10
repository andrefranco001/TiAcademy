package desafio_de_logica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Uma loja varejista de departamentos está catalogando os produtos em estoque com as seguintes infos:
         * Preço Unitario, Quantidade e Categoria
         * Categoria (Aceita apenas C [cama, mesa e banho], E [eletrodomesticos] e V [Vestuario]
         * A loja trabalha com 15 tipos de produtos
         *
         *  Calculo de impostos:
         *  Tipo                | Aliquota
         *  Cama, mesa e banho  -  37,41%
         *  Eletrodomesticos    -  43,14%
         *  Vestuário           -  38,42%
         *
         * Calculo de lucro:
         * Tipo                | Margem
         * Cama, mesa e banho  -  30%
         * Eletrodomesticos    -  35%
         * Vestuário           -  50%
         * */
        Scanner scan = new Scanner(System.in);

        // Variaveis
        String categoria;

        int     cadastrosC = 0, cadastrosE = 0, cadastrosV = 0,
                quantidadeTotalC = 0, quantidadeTotalE = 0, quantidadeTotalV = 0,
                contador;

        double  valorTotalC = 0, valorTotalE = 0, valorTotalV = 0,
                lucroC = 0.3, lucroE = 0.35, lucroV = 0.5,
                impostoProduto = 0, precoUnitario, quantidade, valorProdutoAtual;

        boolean run;

        for (contador = 1; contador <= 15; contador++) {
            System.out.printf("\nInforme a categoria do %dº produto: ", contador);
            categoria = scan.next().toUpperCase();
            run = true;
            while (run) {
                if (categoria.equals("C")) {
                    cadastrosC++;
                    impostoProduto = 0.3741; // 37,41%
                    run = false;
                }
                else if (categoria.equals("E")) {
                    cadastrosE++;
                    impostoProduto = 0.4314; // 43,14%
                    run = false;
                }
                else if (categoria.equals("V")) {
                    cadastrosV++;
                    impostoProduto = 0.3842; // 38,42%
                    run = false;
                }
                else {
                    System.out.print("Categoria inválida, favor informe C, E ou V");
                    System.out.printf("\nInforme a categoria do %d° produto: ", contador);
                    categoria = scan.next().toUpperCase();
                }
            }

            // Preço unitário
            String inputPrecoUnitario;
            System.out.printf("Preço Unitário do %d° produto: ", contador);
            inputPrecoUnitario = scan.next().replace(",","."); // trocando o , por . pois o double é . mas o digitado é ,
            try {
                precoUnitario = Double.parseDouble(inputPrecoUnitario);
                while (precoUnitario <= 0) {
                    System.out.printf("Preço Unitário do %d° produto: ", contador);
                    inputPrecoUnitario = scan.next().replace(",",".");
                    precoUnitario = Double.parseDouble(inputPrecoUnitario);
                }
            }
            catch (RuntimeException e) {
                throw new RuntimeException("Valor informado não é númerico, encerrando o programa");
            }

            // Quantidade
            String inputQuantidade;
            System.out.printf("Quantidade do %dº produto: ", contador);
            inputQuantidade = scan.next().replace(",","."); // trocando o , por . pois o double é . mas o digitado é ,
            try {
                quantidade = Double.parseDouble(inputQuantidade); // Ex: "2.5" para 2.5
                quantidade = (int) quantidade; // Caso input tenha casa decimal, será considerado a parte inteira
                while (quantidade <= 1){
                    System.out.printf("Quantidade do %d° produto: ", contador);
                    inputQuantidade = scan.next().replace(",",".");
                    quantidade = Double.parseDouble(inputQuantidade);
                    quantidade = (int) quantidade;
                }
            }
            catch (RuntimeException e){
                throw new RuntimeException("Valor informado não é númerico, encerrando o programa");
            }

            // Calcular valor com imposto, resultado com lucro e multiplicar pela quantidade
            if (categoria.equals("C")) {
                valorProdutoAtual = precoUnitario + (precoUnitario * impostoProduto);
                valorProdutoAtual = (valorProdutoAtual +(valorProdutoAtual * lucroC)) * quantidade;
                valorTotalC += valorProdutoAtual;
                quantidadeTotalC += quantidade;
            }
            else if (categoria.equals("E")) {
                valorProdutoAtual = precoUnitario + (precoUnitario * impostoProduto);
                valorProdutoAtual = (valorProdutoAtual +(valorProdutoAtual * lucroE)) * quantidade;
                valorTotalE += valorProdutoAtual;
                quantidadeTotalE += quantidade;
            }
            else {
                valorProdutoAtual = precoUnitario + (precoUnitario * impostoProduto);
                valorProdutoAtual = (valorProdutoAtual +(valorProdutoAtual * lucroV)) * quantidade;
                valorTotalV += valorProdutoAtual;
                quantidadeTotalV += quantidade;
            }
        }

        // Mostrar os resultados de cada categoria e a soma dos 3
        System.out.printf("\n\nTotal de produtos cadastrados: %d", contador-1);
        System.out.print("\n\n---Cama, Mesa e Banho---");
        System.out.printf("\nProdutos desta categoria: %d", cadastrosC);
        System.out.printf("\nQuantidade total cadastradas: %d", quantidadeTotalC);
        System.out.print("\nO Imposto da categoria Cama, Mesa e Banho é de 37,41%");
        System.out.printf("\nValor Total: R$ %,.2f", valorTotalC);

        System.out.print("\n\n---Eletrodomesticos---");
        System.out.printf("\nProdutos desta categoria: %d", cadastrosE);
        System.out.printf("\nQuantidade total cadastradas: %d", quantidadeTotalE);
        System.out.print("\nO Imposto da categoria Eletrodomesticos é de 43,14%");
        System.out.printf("\nValor Total: R$ %,.2f", valorTotalE);

        System.out.print("\n\n---Vestuario---");
        System.out.printf("\nProdutos desta categoria: %d", cadastrosV);
        System.out.printf("\nQuantidade total cadastradas: %d", quantidadeTotalV);
        System.out.print("\nO Imposto da categoria Vestuario é de 38,42%");
        System.out.printf("\nValor Total: R$ %,.2f\n", valorTotalV);

        System.out.printf("\nSoma dos %d produtos é de R$ %,.2f\n", contador-1, valorTotalC+valorTotalE+valorTotalV);

        scan.close(); //
    }
}