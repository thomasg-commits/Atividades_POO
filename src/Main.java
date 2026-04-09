import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // a) ArrayList para armazenar a frota de carros
        ArrayList<Carro> frota = new ArrayList<>();
        int opcao = 0;

        System.out.println("Bem-vindo ao Sistema de Gerenciamento de Frota!");

        // Loop do Menu Principal
        do {
            System.out.println("\n==================================");
            System.out.println("1) Cadastrar Carro");
            System.out.println("2) Listar todos");
            System.out.println("3) Total cadastrado");
            System.out.println("4) Sair");
            System.out.print("Escolha uma opção: ");

            // Lê a opção do usuário
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o "Enter" (quebra de linha) que o nextInt deixa para trás

            switch (opcao) {
                case 1:
                    System.out.println("\n--- Cadastro de Veículo ---");
                    System.out.print("Digite a marca: ");
                    String marca = scanner.nextLine();

                    System.out.print("Digite o modelo: ");
                    String modelo = scanner.nextLine();

                    System.out.print("Digite o ano: ");
                    int ano = scanner.nextInt();

                    // c) Usando o construtor para criar o objeto
                    Carro novoCarro = new Carro(marca, modelo, ano);

                    // Salvando na lista
                    frota.add(novoCarro);
                    System.out.println("✅ Veículo cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("\n--- Lista de Veículos ---");
                    if (frota.isEmpty()) {
                        System.out.println("Nenhum carro cadastrado ainda.");
                    } else {
                        // Usando um for-each para percorrer a lista
                        for (Carro c : frota) {
                            c.exibir();
                        }
                    }
                    break;

                case 3:
                    System.out.println("\n--- Estatísticas ---");
                    // d) Acessando a variável static direto pelo nome da Classe
                    System.out.println("Total de carros processados pelo sistema: " + Carro.totalCarros);
                    System.out.println("Total de carros na lista atual: " + frota.size());
                    break;

                case 4:
                    System.out.println("\nSaindo do sistema... Até logo!");
                    break;

                default:
                    System.out.println("\n❌ Opção inválida. Tente novamente.");
            }

        } while (opcao != 4);

        scanner.close(); // Boa prática: fechar o Scanner ao final do programa
    }
}
