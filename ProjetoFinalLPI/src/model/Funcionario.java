package model;

import java.util.Scanner;

public class Funcionario extends Pessoa implements Cadastro {
    private double salario;

    // construtores
    public Funcionario() {
        salario = 0;
    }

    public Funcionario(double salario) {
        this.salario = salario;
    }

    @Override
    public void cadastrar() throws Exception {
        super.cadastrar();

        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("Digite o Salário");
            salario = entrada.nextDouble();
        } while (salario <= 0);
    }

    @Override
    public String mostrar() {
        String pessoaString = super.mostrar();
        return pessoaString + "\nSalário: " + salario;
    }
}
