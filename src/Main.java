public class Main {
    public static void main(String[] args) {


        Carro meuCarro = new Carro();
        meuCarro.setMarca("Chevrolet");
        meuCarro.setModelo("Onix");
        meuCarro.setAno(2020);

        System.out.println("--- Testando os Métodos ---");


        meuCarro.exibir();

        int idadeAtual = meuCarro.idadeDoCarro();
        System.out.println("A idade do carro é: " + idadeAtual + " anos.");
    }
}