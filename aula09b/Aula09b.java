package aula09b;

public class Aula09b {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Lucas", 29, "Masculino");
        p[1] = new Pessoa("Iasmim", 23, "Feminino");
        
        l[0] = new Livro("Let's Code Java", "Jose da Silva", 300, p[0]);
        l[1] = new Livro("Java POO Avançado", "Dirceu Gabana", 500, p[1]);
        l[2] = new Livro("Java Inicial", "Flavio Heringer", 900, p[0]);
        
        l[0].abrir();
        l[0].folhear(150);
        System.out.println(l[0].detalhes());
    }
}
