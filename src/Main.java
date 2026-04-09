import java.util.ArrayList; // Importação necessária para usar o ArrayList

public class Main {
    public static void main(String[] args) {


        ArrayList<Carro> listaDeCarros = new ArrayList<>();


        Carro c1 = new Carro();
        c1.setMarca("Fiat");
        c1.setModelo("Uno");
        c1.setAno(2010);
        listaDeCarros.add(c1);

        Carro c2 = new Carro();
        c2.setMarca("Volkswagen");
        c2.setModelo("Gol");
        c2.setAno(2018);
        listaDeCarros.add(c2);

        Carro c3 = new Carro();
        c3.setMarca("Ford");
        c3.setModelo("Mustang");
        c3.setAno(2024);
        listaDeCarros.add(c3);


        System.out.println("=== Lista de Veículos no Sistema ===");
        for (Carro c : listaDeCarros) {
            c.exibir(); // Chama o método exibir de cada objeto individualmente
        }
    }
}