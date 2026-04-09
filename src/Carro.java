public class Carro {

    private String marca;
    private String modelo;
    private int ano;

    // a) Construtor parametrizado
    // Este é o método especial chamado no momento do "new"
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        // Usamos o setter aqui dentro para garantir que a regra de validação 
        // do exercício anterior seja aplicada logo na criação do objeto!
        this.setAno(ano);
    }

    public void exibir() {
        System.out.println("Carro: " + marca + " " + modelo + " (Ano: " + ano + ")");
    }

    public int idadeDoCarro() {
        return 2026 - ano; // Considerando 2026 como base, conforme o exercício 2
    }

    // --- Getters e Setters continuam aqui ---

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano < 1886 || ano > 2026) {
            System.out.println("ERRO: Ano " + ano + " inválido para o modelo " + this.modelo + "!");
        } else {
            this.ano = ano;
        }
    }
}