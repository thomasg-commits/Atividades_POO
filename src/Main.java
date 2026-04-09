public class Main {
    public static void main(String[] args) {

        // b) CORREÇÃO DO CÓDIGO
        // Declaramos a variável FORA do bloco if. Assim, ela pertence
        // ao bloco do método main() inteiro.
        int x = 0; // É boa prática inicializar com um valor padrão

        if (true) {
            x = 10; // Aqui nós apenas alteramos o valor, não criamos a variável de novo
        }

        // Agora compila e imprime 10 perfeitamente!
        System.out.println(x);

        /*
         * c) EXPLICAÇÃO SOBRE O ESCOPO
         * * O que é escopo?
         * O escopo é o "raio de visibilidade" e o "tempo de vida" de uma variável.
         * Em Java, o escopo é rigidamente delimitado pelo uso de chaves { }.
         * * Por que a variável x original não existia fora do if?
         * Uma variável "nasce" na linha em que é declarada e "morre" assim que o bloco
         * (as chaves { } ) onde ela foi criada termina.
         * * No código original da sua pergunta:
         * 1. O Java entrava no `if {`
         * 2. Criava a variável `int x = 10;` na memória.
         * 3. O bloco terminava no `}`. Nesse exato milissegundo, o Java destruía o `x`.
         * 4. Na linha de baixo, o `System.out.println(x)` tentava imprimir algo que já
         * tinha sido apagado da memória. Por isso o Java dava erro!
         */
    }
}