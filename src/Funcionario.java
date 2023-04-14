public class Funcionario {
    private String id;
    private String nome;
    private String salario;
    private Genero genero;
    private Setor setor;
    private int idade;

    public Funcionario(String id, String nome, String salario, Genero genero, Setor setor, int idade) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.genero = genero;
        this.setor = setor;
        this.idade = idade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
