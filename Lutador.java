package ultimateemojicombat;

public class Lutador {
    
    // Atributos  
    private String nome;
    private final String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitórias, derrotas, empates;
        
    // Construtor
    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe); 
        this.vitórias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    // Métodos Públicos
    public void apresentar() {
        System.out.println("-----------------------------");
        System.out.println("CHEGOU A HORA!!!!  Apresentamos o lutador : " + this.getNome());
        System.out.println("Diretamente de: " + this.getNacionalidade());
        System.out.println("com " + this.getIdade() + " anos e " + this.getAltura());
        System.out.println("pesando " + this.getPeso() + "Kg");
        System.out.println(this.getVitórias() + " vitorias");
        System.out.println(this.getDerrotas() + " derrotas e");
        System.out.println(this.getEmpates() + " empates");
    }

    public void status() {
        System.out.println(this.getNome() + " e um peso " + this.getCategoria());
        System.out.println(" Ganhou " + this.getVitórias() + " vezes");
        System.out.println(" Perdeu " + this.getDerrotas() + " vezes e");
        System.out.println(" Empatou " + this.getEmpates() + " vezes.");
    }

    public void ganarLuta() {
        this.vitórias = this.vitórias + 1;
    }

    public void perderLuta() {
        this.derrotas = this.derrotas + 1;
    }

    public void empatarLuta() {
        this.empates = this.empates + 1;
    }

    // Métodos Especiais (Getters e Setters)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public final void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "INVALIDO";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Medio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado"; 
        } else {
            this.categoria = "INVALIDO"; 
        }
    }

    public int getVitórias() {
        return vitórias;
    }

    public void setVitórias(int vitórias) {
        this.vitórias = vitórias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}
