package checkpoint_13_06_2022.entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Funcionario {
    private String nome;
    private Nivel nivel;
    private double salarioBase;
    private Departamento departamento;
    private List<Contrato> contratos = new ArrayList<>();

    public Funcionario() {

    }

    public Funcionario(String nome, Nivel nivel, double salarioBase, Departamento departamento) {
        this.nome = nome;
        this.nivel = nivel;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

   public List<Contrato> getContratos() {
        return contratos;
    }

    /*public void setContratos(List<Contrato> contratos) {
        this.contratos = contratos;
    }*/

    public void addContrato(Contrato contrato) {
        contratos.add(contrato);
    }

    public void removeContrato(Contrato contrato) {
        contratos.remove(contrato);
    }

    public double ganho(int ano, int mes) {
        double soma = salarioBase;
        Calendar calendario = Calendar.getInstance();
        for (Contrato contrato : contratos) {
            calendario.setTime(contrato.getData());
            int anoContrato = calendario.get(Calendar.YEAR);
            int mesContrato = calendario.get(Calendar.MONTH);

            if (ano == anoContrato && mes == mesContrato) {
                soma += contrato.valorTotal();
            }
        }
        return soma;
    }
}
