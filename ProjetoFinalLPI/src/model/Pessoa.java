package model;

import java.util.Scanner;

public class Pessoa {
    private int id;
    private String nome;
    private String email;

    public void cadastrar() throws Exception {
        Scanner entrada = new Scanner(System.in);
        
        do {
            try {
                System.out.println("Digite o ID:");
                id = entrada.nextInt();
            } catch (Exception e) {
                System.out.println("Erro ao digitar o ID:" + e.getMessage());
            }
        } while (id <= 0);
        do {
            System.out.println("Digite o Nome:");
            nome = entrada.next();
        } while (nome.length() <= 3);
        do {
            System.out.println("Digite o E-mail:");
            email = entrada.next();
        } while (email.length() <= 10);

        //entrada.close();
    }

    public String mostrar() {
        return "ID:" + id + "\nNome:" + nome + "\nEmail:" + email;
    }
}