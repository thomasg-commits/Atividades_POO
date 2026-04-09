public class Main {
    public static void main(String[] args) {

        System.out.println("--- Teste 1: Adicionando um carro válido ---");
        Carro carroValido = new Carro();
        carroValido.setMarca("Jeep");
        carroValido.setModelo("Compass");
        carroValido.setAno(2021);
        carroValido.exibir();

        System.out.println("\n--- Teste 2: Tentando um ano muito antigo ---");
        Carro carroAntigo = new Carro();
        carroAntigo.setMarca("Ford");
        carroAntigo.setModelo("Modelo T");
        carroAntigo.setAno(1889);
        carroAntigo.exibir();

        System.out.println("\n--- Teste 3: Tentando um ano do futuro ---");
        Carro carroFuturo = new Carro();
        carroFuturo.setMarca("Tesla");
        carroFuturo.setModelo("Model Z");
        carroFuturo.setAno(2050);
        carroFuturo.exibir();
    }
}