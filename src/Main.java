public class Main {
    public static void main(String[] args) {

        System.out.println("--- Sistema de Cadastro de Clientes ---");

        // Usando o Construtor 1 (Todos os dados, com número aleatório)
        Cliente c1 = new Cliente("Mariana Costa", "mariana.costa@email.com", "(21) 97531-8642");

        // Usando o Construtor 2 (Sem telefone)
        Cliente c2 = new Cliente("Roberto Almeida", "roberto.al@email.com");

        // Usando o Construtor 3 (Apenas nome)
        Cliente c3 = new Cliente("Juliana Ferreira");

        // Imprimindo os dados
        System.out.println("\nLista de Clientes Cadastrados:");
        c1.exibir();
        c2.exibir();
        c3.exibir();

        // Imprimindo o total de clientes cadastrados usando a variável static
        System.out.println("\nTotal de clientes cadastrados no sistema: " + Cliente.totalClientes);
    }
}