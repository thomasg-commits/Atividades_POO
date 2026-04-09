public class Main {
    public static void main(String[] args) {

        System.out.println("--- Testando Constantes (final) ---");

        // Imprimindo a constante para provar que temos acesso a ela
        System.out.println("O primeiro carro moderno foi inventado em: " + Carro.ANO_PRIMEIRO_CARRO);

        // c) Tentando alterar o valor da constante
        // DESCOMENTE A LINHA ABAIXO NO INTELLIJ PARA VER O ERRO:
        // Carro.ANO_PRIMEIRO_CARRO = 1900;

        /*
         * c) EXPLICAÇÃO: O QUE ACONTECE E O QUE O 'final' FAZ?
         * * * O que acontece?
         * O IntelliJ vai acusar um erro de compilação dizendo:
         * "Cannot assign a value to final variable 'ANO_PRIMEIRO_CARRO'".
         * (Não é possível atribuir um valor a uma variável final). O código nem sequer roda.
         * * * O que o 'final' faz?
         * A palavra-chave 'final' bloqueia a variável. Ela diz ao Java: "Assim que essa
         * variável receber um valor pela primeira vez, lacre a caixa. Ninguém mais, em
         * nenhum lugar do código, poderá alterar o conteúdo dela".
         * * * Por que isso é útil?
         * Isso evita bugs gigantescos. Imagina se algum outro programador na sua equipe
         * acidentalmente fizesse Carro.ANO_PRIMEIRO_CARRO = 2020. Todos os carros fabricados
         * antes de 2020 passariam a dar "ERRO" no sistema de repente. Com o 'final', você
         * blinda essa regra de negócio.
         */

        System.out.println("\nCriando um carro válido para testar a nova validação:");
        Carro meuCarro = new Carro("Porsche", "911", 1990);
        meuCarro.exibir();
    }
}