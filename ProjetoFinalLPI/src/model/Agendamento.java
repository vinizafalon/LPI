package model;

import java.util.Scanner;

public class Agendamento implements Cadastro {
    private int id;
    private String data;
    private int idCliente;

    // construtores
    public Agendamento() {
        id = 0;
        data = new String();
        idCliente = 0;
    }

    public Agendamento(int id, String data, int idCliente) {
        this.id = id;
        this.data = data;
        this.idCliente = idCliente;
    }

    // sets e gets
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public void cadastrar() throws Exception {
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("Digite a data do Agendamento:");
            data = entrada.next();
        } while (data.length() != 10);

        do {
            System.out.println("Digite o ID do Cliente");
            idCliente = entrada.nextInt();
        } while (idCliente <= 0);
    }

    @Override
    public String mostrar() {
        return "Data: " + data + "\nCliente: "+ idCliente;
    }
}
