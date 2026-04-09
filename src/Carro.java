public class Carro {

    private String marca;
    private String modelo;
    private int ano;

    // a) Construtor 1: Parametrizado (Mantido do exercício 5)
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.setAno(ano);
    }

    // b) Construtor 2: Sem parâmetros (Sobrecarga)
    // Se quem estiver programando não souber os dados do carro no momento da criação,
    // ele pode usar este construtor, que preenche tudo com valores padrão.
    public Carro() {
        this.marca = "Desconhecido";
        this.modelo = "Desconhecido";
        // Atribuímos diretamente aqui para evitar que a validação do setAno()
        // grite "ERRO" ao tentar colocar o ano 0.
        this.ano = 0;
    }

    public void exibir() {
        System.out.println("Carro: " + marca + " | Modelo: " + modelo + " | Ano: " + ano);
    }

    public int idadeDoCarro() {
        return 2026 - ano;
    }

    // --- Getters e Setters continuam normais ---

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
            System.out.println("ERRO: Ano " + ano + " inválido!");
        } else {
            this.ano = ano;
        }
    }
}