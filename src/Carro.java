public class Carro {

    public static int totalCarros = 0;

    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.setAno(ano);
        totalCarros++;
    }

    public Carro() {
        this.marca = "Desconhecido";
        this.modelo = "Desconhecido";
        this.ano = 0;
        totalCarros++;
    }

    // a) Método static para imprimir o total de carros
    public static void imprimirTotal() {
        System.out.println("Total de carros registrados na fábrica: " + totalCarros);

        // b) Tentando acessar o atributo 'modelo' (de instância)
        // DESCOMENTE A LINHA ABAIXO NO INTELLIJ PARA VER O ERRO:
        // System.out.println("Modelo: " + modelo);

        /*
         * c) EXPLICAÇÃO DO ERRO:
         * Por que um método static não consegue acessar um atributo de instância?
         * * Pense na classe como a FÁBRICA e no objeto como um CARRO ESPECÍFICO.
         * O método imprimirTotal() é um método 'static', ou seja, ele pertence à FÁBRICA.
         * O atributo 'modelo' é de instância, ou seja, ele só existe quando um CARRO ESPECÍFICO nasce.
         * * Se você liga para a fábrica (chama o método static Carro.imprimirTotal()) e pergunta:
         * "Qual é o modelo?", a fábrica vai responder: "De qual carro você está falando?
         * Nós já fabricamos mil carros!".
         * * Como o método static não precisa de um "new Carro()" para funcionar, ele não faz
         * a menor ideia de qual 'modelo' ele deveria imprimir. Por isso o Java proíbe essa ação.
         */
    }

    public void exibir() {
        System.out.println("Carro: " + marca + " | Modelo: " + modelo + " | Ano: " + ano);
    }

    public int idadeDoCarro() {
        return 2026 - ano;
    }

    // --- Getters e Setters continuam aqui ---
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public int getAno() { return ano; }
    public void setAno(int ano) {
        if (ano < 1886 || ano > 2026) {
            System.out.println("ERRO: Ano " + ano + " inválido!");
        } else {
            this.ano = ano;
        }
    }
}