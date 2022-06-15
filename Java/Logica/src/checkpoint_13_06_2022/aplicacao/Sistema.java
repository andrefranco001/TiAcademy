package checkpoint_13_06_2022.aplicacao;

import checkpoint_13_06_2022.entidades.Contrato;
import checkpoint_13_06_2022.entidades.Departamento;
import checkpoint_13_06_2022.entidades.Funcionario;
import checkpoint_13_06_2022.entidades.Nivel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) throws ParseException {

        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Departamento: ");
        String depto = scan.nextLine();
        System.out.print("Funcionário: ");
        String func = scan.nextLine();
        System.out.print("Nível: ");
        String nivel = scan.nextLine();
        System.out.print("Salário Base: ");
        double salario = scan.nextDouble();

        Funcionario funcionario = new Funcionario(func, Nivel.valueOf(nivel), salario, new Departamento(depto));

        System.out.print("Contratos associados: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.printf("Contrato nº%d", i);
            System.out.print("\nData (DD/MM/YYYY): ");
            Date data = sdf.parse(scan.next());
            System.out.print("Valor da hora: ");
            double valor = scan.nextDouble();
            System.out.print("Quantidade horas: ");
            int horas = scan.nextInt();

            Contrato contrato = new Contrato(data, valor, horas);
            funcionario.addContrato(contrato);
        }

        System.out.print("Informe mês e ano (mm/aaaa): ");
        String mesAno = scan.next();
        int mes = Integer.parseInt(mesAno.substring(0, 2));
        int ano = Integer.parseInt(mesAno.substring(3));
        System.out.println("Nome" + funcionario.getNome());
        System.out.println("Departamento" + funcionario.getDepartamento().getNome());
        System.out.println("Salário de " + mesAno + " R$ " + String.format("%,.2f", funcionario.ganho(mes, ano)));

    }
}
