package aula.pkg05;

public class Aula05 {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(2403);
        p1.setDono("Lucas Wenderroschi");
        p1.abrirConta("CC");
        p1.sacar(50);
        p1.fecharConta();
        p1.estadoAtual();
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(1407);
        p2.setDono("Robson Anselmo");
        p2.abrirConta("CP");
        p2.estadoAtual();
    }
}
