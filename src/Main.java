public class Main {
    public static void main(String[] args) {

        System.out.println("--- Exercício 12: Referência vs Valor (Objeto) ---");

        // Criando o objeto e a referência
        Carro c1 = new Carro("Fiat", "Uno", 2020);
        Carro c2 = c1;

        // Alterando o modelo usando a variável c2
        c2.setModelo("Palio");

        // Imprimindo os resultados (Questão a)
        System.out.println("Modelo de c1: " + c1.getModelo());
        System.out.println("Modelo de c2: " + c2.getModelo());

        /*
         * RESPOSTAS TEÓRICAS DO EXERCÍCIO:
         * * a) Qual o modelo de c1 e de c2?
         * R: Ambos os modelos imprimem "Palio".
         * * b) Por que alterar c2 mudou c1? O que c1 e c2 compartilham?
         * R: Ao fazer a atribuição "c2 = c1", o Java NÃO cria um novo objeto
         * Carro. O que ele faz é copiar a "etiqueta" (a referência). Assim, c1
         * e c2 passam a compartilhar o MESMO endereço de memória. Alterar os
         * dados usando o controle c2 vai modificar a mesma "TV" que o c1 controla.
         * * c) Qual a diferença entre o comportamento do ex 11 (int) e deste (Carro)?
         * R: A diferença está em como a memória (Stack e Heap) funciona no Java:
         * * 1. Tipos Primitivos (int do ex 11): O valor real (ex: 10) é guardado
         * diretamente na memória STACK (pilha de execução rápida). Quando fazemos
         * "b = a", o Java faz uma CÓPIA independente do valor na Stack.
         * * 2. Objetos (Carro do ex 12): O objeto real com os dados do carro é
         * muito pesado e é guardado na memória HEAP (monte). As variáveis c1 e c2
         * ficam na STACK, mas elas não guardam o carro, guardam apenas o "caminho"
         * (ponteiro) até o Heap. Fazer "c2 = c1" apenas copia o caminho na Stack,
         * apontando as duas variáveis para o exato mesmo objeto no Heap.
         */
    }
}