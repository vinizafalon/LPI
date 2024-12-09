import java.util.ArrayList;
import java.util.Scanner;
import model.Agendamento;
import model.Cliente;
import model.Funcionario;
import model.Servico;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();
        ArrayList<Servico> listaServicos = new ArrayList<>();
        ArrayList<Agendamento> listaAgendamentos = new ArrayList<>();

        int opcao = 0;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("\n\n---MENU---");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Cadastrar Funcionário");
            System.out.println("3 - Cadastrar Serviço");
            System.out.println("4 - Cadastrar Agendamento");
            System.out.println("11 - Listar Clientes");
            System.out.println("12 - Listar Funcionários");
            System.out.println("13 - Listar Serviços");
            System.out.println("14 - Listar Agendamentos");
            System.out.println("100 - SAIR");
            System.out.println("Digite uma opção:");
            opcao = entrada.nextInt();
            
            switch (opcao) {
                case 1:
                    Cliente cliente = new Cliente();
                    cliente.cadastrar();
                    listaClientes.add(cliente);
                    break;
                case 2:
                    Funcionario funcionario = new Funcionario();
                    funcionario.cadastrar();
                    listaFuncionarios.add(funcionario);
                    break;
                case 3:
                    Servico servico = new Servico();
                    servico.cadastrar();
                    listaServicos.add(servico);
                    break;
                case 4:
                    Agendamento agendamento = new Agendamento();
                    agendamento.cadastrar();
                    listaAgendamentos.add(agendamento);
                    break;
                case 5:

                    break;
                case 11:
                    System.out.println("#####################  LISTAGEM ################");
                    for (Cliente c : listaClientes) {
                        System.out.println("-------------------------------");
                        System.out.println(c.mostrar());
                    }
                    break;
                case 12:
                    System.out.println("#####################  LISTAGEM ################");
                    for (Funcionario f : listaFuncionarios) {
                        System.out.println("-------------------------------");
                        System.out.println(f.mostrar());
                    }
                    break;
                case 13:
                    System.out.println("#####################  LISTAGEM ################");
                    for (Servico s : listaServicos) {
                        System.out.println("-------------------------------");
                        System.out.println(s.mostrar());

                    }
                    break;
                case 14:
                    System.out.println("#####################  LISTAGEM ################");
                    for (Agendamento a : listaAgendamentos) {
                        System.out.println("-------------------------------");
                        System.out.println(a.mostrar());
                    }
                    break;
                default:
                    break;
            }
        } while (opcao != 100);
    }
}