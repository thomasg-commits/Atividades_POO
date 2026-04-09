public class Carro {

    // e) Constante final para validação
    public static final int ANO_PRIMEIRO_CARRO = 1886;

    // d) Variável static para contar o total
    public static int totalCarros = 0;

    // b) Atributos private (Encapsulamento)
    private String marca;
    private String modelo;
    private int ano;

    // c) Construtor principal
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.setAno(ano); // Reaproveita a validação!
        totalCarros++; // Incrementa o contador da fábrica
    }

    public void exibir() {
        System.out.println("🚗 " + marca + " " + modelo + " (Ano: " + ano + ")");
    }

    // --- Getters e Setters ---
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public int getAno() { return ano; }

    // b) e e) Setter com validação usando a constante
    public void setAno(int ano) {
        if (ano < ANO_PRIMEIRO_CARRO || ano > 2026) {
            System.out.println("❌ ERRO: O ano " + ano + " é inválido. O ano mínimo é " + ANO_PRIMEIRO_CARRO + ".");
            this.ano = 0; // Valor padrão em caso de erro
        } else {
            this.ano = ano;
        }
    }
}