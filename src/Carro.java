public class Carro {

    // a) Atributo de classe (static)
    // Ele não pertence a um carro específico, pertence à classe "Carro" inteira.
    public static int totalCarros = 0;

    private String marca;
    private String modelo;
    private int ano;

    // Construtor 1
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.setAno(ano);

        // b) Incrementa o contador global toda vez que este construtor é chamado
        totalCarros++;
    }

    // Construtor 2 (Sem parâmetros)
    public Carro() {
        this.marca = "Desconhecido";
        this.modelo = "Desconhecido";
        this.ano = 0;

        // b) Incrementa o contador global toda vez que este construtor é chamado
        totalCarros++;
    }

    public void exibir() {
        System.out.println("Carro: " + marca + " | Modelo: " + modelo + " | Ano: " + ano);
    }

    public int idadeDoCarro() {
        return 2026 - ano;
    }

    // --- Getters e Setters continuam aqui em baixo ---
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