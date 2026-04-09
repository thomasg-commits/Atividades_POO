public class Main {

    public static void main(String[] args) {
        System.out.println("--- Exercício 13: Passagem de Objeto para Método ---");

        // Criamos o carro
        Carro meuCarro = new Carro("VW", "Gol", 2015);

        // Passamos o carro para o método
        trocarModelo(meuCarro);

        // Imprimimos o resultado
        System.out.println("O modelo agora é: " + meuCarro.getModelo());
    }

    // Método que recebe um objeto do tipo Carro
    public static void trocarModelo(Carro c) {
        c.setModelo("Fusca");

        /*
         * b) EXPLICAÇÃO DA QUESTÃO 13:
         * * * Por que a mudança feita dentro do método afetou o objeto original?
         * Porque, em Java, quando você passa um OBJETO como parâmetro para
         * um método, você NÃO está passando uma cópia do carro inteiro (o que
         * gastaria muita memória e seria lento). Você está passando uma cópia
         * da REFERÊNCIA (o endereço de memória).
         * * * O parâmetro 'c' aponta para onde?
         * A variável 'c' (que só existe aqui dentro deste método) recebe o
         * mesmo endereço de memória que 'meuCarro' tem lá no método main.
         * Portanto, 'c' aponta exatamente para o MESMO objeto "Carro" que
         * está guardado na memória Heap.
         * * Como ambos os "controles remotos" (meuCarro e c) apontam para a mesma
         * "TV", quando o método usa 'c' para mudar o modelo para Fusca, a "TV"
         * real é alterada. Quando o main volta a rodar e pergunta o modelo,
         * ele já encontra "Fusca".
         */
    }
}