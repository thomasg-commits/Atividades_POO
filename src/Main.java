import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // c) VANTAGEM DE USAR CONSTRUTOR:
        // 1. Código mais limpo: Criamos e populamos o objeto em apenas 1 linha em vez de 4.
        // 2. Segurança de estado: O objeto já "nasce" com os dados essenciais preenchidos.
        //    Você não corre o risco de esquecer de chamar um setter e deixar o carro sem marca, por exemplo.

        System.out.println("--- Criando carros com o Construtor ---");

        // b) Criando objetos já passando os valores direto no "new"
        Carro carro1 = new Carro("Toyota", "Corolla", 2023);
        Carro carro2 = new Carro("Renault", "Kwid", 2019);

        // Testando a validação dentro do construtor!
        Carro carro3 = new Carro("DeLorean", "DMC-12", 3000);

        System.out.println("\n--- Imprimindo os Dados ---");

        // Colocando em uma lista para imprimir de forma elegante
        ArrayList<Carro> frota = new ArrayList<>();
        frota.add(carro1);
        frota.add(carro2);
        frota.add(carro3); // O DeLorean vai ficar com ano 0, pois a validação barrou o ano 3000

        for (Carro c : frota) {
            c.exibir();
        }
    }
}