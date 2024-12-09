package model;

import java.util.Scanner;

public class Cliente extends Pessoa implements Cadastro {
    private double divida;
    private String cpf;

    // construtores
    public Cliente() {
        divida = 0;
        cpf = new String();
    }

    public Cliente(double divida, String cpf) {
        this.divida = divida;
        this.cpf = cpf;
    }

    // sets e gets
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void cadastrar() throws Exception {
        super.cadastrar();

        Scanner entrada = new Scanner(System.in);     

        do {
            System.out.println("Digite o CPF:");
            cpf = entrada.next();
        } while (cpf.length() != 11);
        do {
            System.out.println("Digite a Dívida");
            divida = entrada.nextDouble();
        } while (divida <= 0);
    }

    @Override
    public String mostrar() {
        String pessoaString = super.mostrar();
        return pessoaString + "\nCPF: " + cpf + "\nDívida: " + divida;
    }
}
