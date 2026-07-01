package aula11;

public class Aula11 {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setCurso("Informática");
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        b1.setNome("Jubileu");
        b1.setBolsa(12.5f);
        b1.pagarMensalidade();
    }
}
