public class Carro {

    // Atributos privados (Regra da POO: Encapsulamento)
    private String marca;
    private String modelo;
    private int ano;

    // Método para imprimir os dados do carro de forma organizada
    public void exibirDados() {
        System.out.println("Marca: " + marca + " | Modelo: " + modelo + " | Ano: " + ano);
    }

    // --- Getters e Setters ---

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