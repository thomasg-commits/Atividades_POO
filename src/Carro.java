public class Carro {

    // Atributos encapsulados (privados)
    private String marca;
    private String modelo;
    private int ano;

    // a) Método void: Apenas executa uma ação (neste caso, imprimir no console).
    // A palavra "void" significa "vazio", ou seja, ele não devolve nenhum dado para quem o chamou.
    public void exibir() {
        System.out.println("Carro: " + marca + " " + modelo + " (Ano: " + ano + ")");
    }

    // b) Método com retorno: Calcula e devolve um valor inteiro (int).
    // Ele não imprime nada sozinho, ele "entrega" o número para quem o chamou.
    public int idadeDoCarro() {
        return 2026 - ano;
    }

    // --- Getters e Setters (Mantendo a boa prática da POO) ---

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
        this.ano = ano;
    }
}