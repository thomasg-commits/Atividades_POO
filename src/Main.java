public class Main {
    public static void main(String[] args) {

        System.out.println("--- Teste de Valor (Tipos Primitivos) ---");

        int a = 10;
        int b = a;
        b = 99;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        /*
         * b) EXPLICAÇÃO: Alterar 'b' mudou 'a'? Por quê?
         * * NÃO! Alterar 'b' não mudou o valor de 'a'.
         * * POR QUÊ?
         * Porque 'int' é um tipo PRIMITIVO em Java (assim como double, float, boolean, char).
         * Tipos primitivos guardam o VALOR REAL direto na caixa da variável na memória.
         * * Quando você fez a linha "int b = a;", o Java não conectou as duas variáveis.
         * O que ele fez foi olhar para a caixa do 'a', ver que tinha o número 10 lá dentro,
         * fazer uma CÓPIA exata desse número 10 e jogar dentro da caixa do 'b'.
         * * A partir desse momento, as duas variáveis são completamente independentes.
         * Se você muda o 'b' para 99, você está apenas substituindo o conteúdo da
         * caixa do 'b'. A caixa do 'a' continua intacta com o seu 10 original.
         */
    }
}