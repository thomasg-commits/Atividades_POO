public class Main {
    public static void main(String[] args) {

        System.out.println("--- Testando a Sobrecarga de Construtores ---");

        // c) Criando usando o Construtor COM parâmetros
        Carro carroCompleto = new Carro("Volkswagen", "Nivus", 2024);

        // c) Criando usando o Construtor SEM parâmetros
        Carro carroVazio = new Carro();

        // Imprimindo os resultados
        carroCompleto.exibir();
        carroVazio.exibir();

        /*
         * COMENTÁRIO - O QUE MUDA ENTRE OS DOIS?
         * * O que muda é a flexibilidade fornecida ao programador que está usando a classe.
         * * 1. Construtor Parametrizado (carroCompleto): É ideal para quando você JÁ TEM os dados
         * no momento em que vai criar o objeto (ex: lendo de um banco de dados). O objeto já
         * nasce pronto e válido.
         * * 2. Construtor Sem Parâmetros (carroVazio): É útil quando você precisa instanciar o
         * objeto primeiro para só depois preencher os dados usando os setters (ex: esperando
         * o usuário digitar os valores num formulário tela por tela). O objeto nasce com um
         * "estado padrão" seguro, evitando que a marca e o modelo fiquem nulos (null).
         */
    }
}