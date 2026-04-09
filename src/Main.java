public class Main {
    public static void main(String[] args) {

        System.out.println("--- Criando a Frota ---");

        // c) Criando 5 carros (misturando os construtores para testar)
        Carro c1 = new Carro("Fiat", "Argo", 2022);
        Carro c2 = new Carro("Honda", "HR-V", 2023);
        Carro c3 = new Carro("Toyota", "Yaris", 2021);
        Carro c4 = new Carro(); // Usando construtor vazio
        Carro c5 = new Carro(); // Usando construtor vazio

        // c) Imprimindo a variável static
        System.out.println("\nTotal de carros fabricados no sistema: " + Carro.totalCarros);

        /*
         * d) RESPOSTAS AOS COMENTÁRIOS DA TAREFA:
         * * 1. Por que acessamos com Carro.totalCarros e não c1.totalCarros?
         * R: Porque a variável 'totalCarros' é da Classe (Carro), não do Objeto (c1, c2, etc).
         * Não faz sentido perguntar para um único carro (c1) quantos carros existem no total.
         * Nós perguntamos direto para a "fábrica" (a classe Carro). O Java até permite acessar
         * via objeto, mas a boa prática e o correto logicamente é usar o NomeDaClasse.atributo.
         * * 2. Qual a diferença entre atributo static e atributo de instância?
         * R:
         * - Atributo de Instância (marca, modelo): Cada vez que você dá um 'new', o Java
         * cria uma cópia nova na memória. O c1 tem a sua marca, o c2 tem a sua marca. Eles
         * são independentes.
         * - Atributo Static (totalCarros): Existe apenas UMA ÚNICA cópia na memória do
         * computador, compartilhada por todos os objetos. Se o c1 mexer no totalCarros,
         * o c2, c3, c4 e c5 vão ver o valor alterado, pois todos olham para o mesmo
         * lugar na memória.
         */
    }
}