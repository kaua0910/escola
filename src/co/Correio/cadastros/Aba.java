package co.Correio.cadastros;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Aba {


    public static void menuClientes(ArrayList<Cliente> lista, int opcao, String Cpf) {
        try (Scanner input = new Scanner(System.in)) {


            while (opcao != 7) {

                System.out.println("Digite uma opçãos: \n1:cadastro \n 2:listar \n3:procurar CPF \n 4:remover cliente " +
                        "\n 5:editar cliente   \n6:salvar clientes \n7:sair");
                opcao = input.nextInt();

                while (opcao > 7 || opcao == 0) {
                    System.out.println("opçao invalida, digite outra: ");
                    opcao = input.nextInt();
                }

                if (opcao == 1) {

                    input.nextLine();
                    System.out.println("\nDigite seu nome:");
                    String nome = input.nextLine();

                    System.out.println("Digite seu sobrenome:");
                    String sobrenome = input.nextLine();

                    System.out.println("Digite seu email:");
                    String email = input.nextLine();

                    System.out.println("Digite sua senha: ");
                    String senha = input.nextLine();

                    System.out.println("Digite seu telefone:");
                    String telefone = input.nextLine();

                    System.out.println("Digite seu CPF:");
                    String cpf = input.nextLine();
                    Cliente cliente = new Cliente(
                            nome,
                            sobrenome,
                            email,
                            senha,
                            telefone,
                            cpf
                    );
                    boolean cpfexistente = false;
                    for (Cliente cliente1 : lista) {
                        if (cpf.equalsIgnoreCase(cliente1.Getcpf())) {
                            cpfexistente = true;
                            break;
                        }
                    }
                        if (cpfexistente) {
                            System.out.println("ja possui um usuario com esse cpf\n");
                        }
                        else  {
                            lista.add(cliente);
                        }




                } else if (opcao == 2) {
                    listadeClientes(lista);
                } else if (opcao == 3) {
                    System.out.println("Digite seu CPF:");
                    input.nextLine();
                    String cpfDigitado = input.nextLine();
                    analisarCPF(lista, cpfDigitado);
                } else if (opcao == 4) {
                    input.nextLine();
                    System.out.println("Digite seu Cpf:");
                    String cpfDigitado = input.nextLine();
                    removerCliente(lista, cpfDigitado);
                } else if (opcao == 5) {

                    editordeClientes(lista, Cpf);

                }
                else if (opcao == 6) {
                    salvarCliente(lista);
                }
                    else {
                    System.out.println("Encerrando...");

                }
            }
        }
    }

    public static void salvarCliente(ArrayList<Cliente> lista) {
        for (Cliente cliente : lista) {
            String linha = cliente.GetUsername() + ":" + cliente.GetLastname()
                    + ":" + cliente.GetEmail()
                    + ":" + cliente.GetPassword() + ":"
                    + cliente.GetTelefone()
                    + ":" + cliente.Getcpf();
            System.out.println(linha);
        }
    }
    public static void analisarCPF(ArrayList<Cliente> lista, String cpf) {

        for (Cliente cliente : lista) {


            if (cpf.equalsIgnoreCase(cliente.Getcpf())) {
                System.out.println("cliente encontrado: ");
                System.out.println(cliente.TodasasInfo());
                return;

            }

        }

        System.out.println("Cpf invalido: 1");
    }

    public static void removerCliente(ArrayList<Cliente> lista, String cpf) {

        for (int i = 0; i < lista.size(); i++) {

            if (cpf.equals(lista.get(i).Getcpf())) {
                System.out.println("cliente removido: ");
                System.out.println(lista.get(i).TodasasInfo());
                lista.remove(i);
                return;

            }
        }
        System.out.println("Cpf invalido: ");
    }

    public static void editordeClientes(ArrayList<Cliente> lista, String CPF) {
        Scanner input2 = new Scanner(System.in);
        System.out.println("Digite seu CPF:");
        String cpfdigitado2 = input2.nextLine();




        for (Cliente cliente : lista) {
            if (cpfdigitado2.equalsIgnoreCase(cliente.Getcpf())){
                System.out.println("cliente encontrado: \n");



            System.out.println("qual informaçao vc deseja editar: \n1nome: \n2sobrenome: \n3email: \n4password: \n5telefone: \n6sair:");
            int opcao2 = input2.nextInt();
            input2.nextLine();

            if (opcao2 == 1) {
                System.out.println("Digite seu nome:");
                cliente.SetUsername(input2.nextLine());
            } else if (opcao2 == 2) {
                System.out.println("Digite seu sobrenome:");
                cliente.SetLastname(input2.nextLine());
            } else if (opcao2 == 3) {
                System.out.println("Digite seu email:");
                cliente.SetEmail(input2.nextLine());
            } else if (opcao2 == 4) {
                System.out.println("Digite sua senha:");
                cliente.Setpassword(input2.nextLine());
            } else if (opcao2 == 5) {
                System.out.println("Digite seu telefone:");
                cliente.SetTelefone(input2.nextLine());
            } else {
                System.out.println("encerrando");

            }
            return;
        }


        }

        System.out.println("Cpf invalido::");

    }


    public static void listadeClientes(ArrayList<Cliente> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Cliente" + (i + 1) + ": " + lista.get(i).TodasasInfo());
        }

    }

    public static void mostrarCLientes(ArrayList<Cliente> lista) {
        System.out.println("Informaçoes dos clientes: " + lista.size());
    }


    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();

        Adress adress = new Adress();
        Scanner input = new Scanner(System.in);
        Adress adress1 = new Adress();

menuClientes(clientes, 0, "" );
//System.out.println("digite sua Cidade: ");
//adress.SetCidade(input.nextLine());
//
//System.out.println("digite sua Estado: ");
//adress.SetEstado(input.nextLine());
//
//System.out.println("digite sua Pais: ");
//adress.SetPais(input.nextLine());
//
//String endereço = adress.Local();
//
//System.out.println("endereço cadastrado: " + endereço);


    }
}
