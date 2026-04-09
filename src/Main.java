public class Main {
    public static void main(String[] args) {

        // a) Criando o primeiro objeto Carro
        Carro carro1 = new Carro();
        // Atribuindo valores usando os métodos Setters (Proteção POO)
        carro1.setMarca("Toyota");
        carro1.setModelo("Corolla");
        carro1.setAno(2022);

        // a) Criando o segundo objeto Carro
        Carro carro2 = new Carro();
        carro2.setMarca("Honda");
        carro2.setModelo("Civic");
        carro2.setAno(2023);

        // b) Imprimindo os dados de cada carro no console
        System.out.println("--- Lista de Carros ---");
        carro1.exibirDados();
        carro2.exibirDados();
    }
}