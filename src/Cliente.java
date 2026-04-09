public class Cliente {

    // Atributo estático (da classe)
    public static int totalClientes = 0;

    // Atributos privados (da instância)
    private String nome;
    private String email;
    private String telefone;

    // Construtor 1: Completo
    public Cliente(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        totalClientes++;
    }

    // Construtor 2: Sem telefone
    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.telefone = "Não informado";
        totalClientes++;
    }

    // Construtor 3: Só o nome
    public Cliente(String nome) {
        this.nome = nome;
        this.email = "Não informado";
        this.telefone = "Não informado";
        totalClientes++;
    }

    public void exibir() {
        System.out.println("Nome: " + nome + " | Email: " + email + " | Tel: " + telefone);
    }

    // --- Getters e Setters ---
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
}