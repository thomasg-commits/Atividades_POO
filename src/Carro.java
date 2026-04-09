public class Carro {

    // a) Criando a constante.
    // static = pertence à classe. final = o valor é definitivo (não muda).
    public static final int ANO_PRIMEIRO_CARRO = 1886;

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

    public static void imprimirTotal() {
        System.out.println("Total de carros registrados na fábrica: " + totalCarros);
    }

    public void exibir() {
        System.out.println("Carro: " + marca + " | Modelo: " + modelo + " | Ano: " + ano);
    }

    public int idadeDoCarro() {
        return 2026 - ano;
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public int getAno() { return ano; }

    // b) Usando a constante na validação!
    // Substituímos o "número mágico" 1886 pelo nome da constante.
    public void setAno(int ano) {
        if (ano < ANO_PRIMEIRO_CARRO || ano > 2026) {
            System.out.println("ERRO: Ano " + ano + " inválido! O ano mínimo é " + ANO_PRIMEIRO_CARRO + ".");
        } else {
            this.ano = ano;
        }
    }
}