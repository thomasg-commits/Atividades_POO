public class Main {
    public static void main(String[] args) {

        System.out.println("--- Iniciando o sistema da concessionária ---");

        // Note que podemos chamar o método static ANTES MESMO de criar qualquer carro!
        // A fábrica já existe antes dos produtos.
        Carro.imprimirTotal(); // Vai imprimir 0

        System.out.println("\n--- Fabricando novos veículos ---");
        Carro c1 = new Carro("Hyundai", "HB20", 2021);
        Carro c2 = new Carro("Chevrolet", "Tracker", 2023);
        Carro c3 = new Carro("Peugeot", "208", 2024);

        System.out.println("\n--- Resumo ---");
        // Chamando o método static após criar os objetos
        Carro.imprimirTotal(); // Vai imprimir 3
    }
}