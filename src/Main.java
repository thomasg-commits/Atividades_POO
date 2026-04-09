public class Main {
    public static void main(String[] args) {

        System.out.println("--- Cadastro de Clientes ---");

        // e) Criando os objetos usando os diferentes construtores

        // Usando o Construtor 1 (Todos os dados)
        Cliente c1 = new Cliente("Ana Silva", "ana@email.com", "(11) 98888-7777");

        // Usando o Construtor 2 (Sem telefone)
        Cliente c2 = new Cliente("Bruno Souza", "bruno@email.com");

        // Usando o Construtor 3 (Apenas nome)
        Cliente c3 = new Cliente("Carlos Mendes");

        // Imprimindo os dados
        System.out.println("\nLista de Clientes:");
        c1.exibir();
        c2.exibir();
        c3.exibir();

        // Imprimindo o total de clientes cadastrados usando a variável static
        System.out.println("\nTotal de clientes cadastrados no sistema: " + Cliente.totalClientes);
    }
}