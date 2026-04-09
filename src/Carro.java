public class Carro {

    // a) Atributos privados
    private String marca;
    private String modelo;
    private int ano;

    public void exibir() {
        System.out.println("Carro: " + marca + " " + modelo + " (Ano: " + ano + ")");
    }

    public int idadeDoCarro() {
        return 2026 - ano;
    }

    // b) Getters e Setters

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

    // c) Setter com validação! A porta de entrada do dado está protegida.
    public void setAno(int ano) {
        if (ano < 1886 || ano > 2026) {
            System.out.println("ERRO: Ano " + ano + " é inválido! O ano deve estar entre 1886 e 2026.");
        } else {
            this.ano = ano; // Só altera o atributo se a regra for respeitada
        }
    }
}