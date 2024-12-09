package model;

import java.util.Scanner;

public class Servico implements Cadastro {
    private int id;
    private String descricao;
    private int idFuncionario;

    // construtores
    public Servico() {
        id = 0;
        descricao = new String();
        idFuncionario = 0;
    }

    public Servico(int id, String descricao, int idFuncionario) {
        this.id = id;
        this.descricao = descricao;
        this.idFuncionario = idFuncionario;
    }

    // sets e gets
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    @Override
    public void cadastrar() throws Exception {
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("Digite o ID");
            id = entrada.nextInt();
        } while (id <= 0);

        do {
            System.out.println("Digite a Descrição");
            descricao = entrada.next();
        } while (descricao.length() <= 3);        

        do {
            System.out.println("Digite o ID do Funcionário");
            idFuncionario = entrada.nextInt();
        } while (idFuncionario <= 0);
    }

    @Override
    public String mostrar() {
        return "Serviço: " + descricao + "\nFuncionário: "+ idFuncionario;
    }
}
