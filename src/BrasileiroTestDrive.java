import adapter.AmericanoAdapter;
import adapter.JaponesAdapter;
import targetAdapter.Brasil;
import adaptee.Americano;
import adaptee.Brasileiro;
import adaptee.Japones;


public class BrasileiroTestDrive {
    
    public static void main(String[] args) {
        Brasileiro joao = new Brasileiro("João");
        Brasil mark = new AmericanoAdapter(new Americano("Mark"));
        Brasil kazuki = new JaponesAdapter(new Japones("Kazuki"));

        System.out.println("João comprimenta Mark:");
        comprimenta(joao, mark.getNome());
        System.out.println("\nMark comprimenta João:");
        comprimenta(mark, joao.getNome());

        System.out.println("\nJoão comprimenta Kazuki:");
        comprimenta(joao, kazuki.getNome());
        System.out.println("\nKazuki comprimenta João:");
        comprimenta(kazuki, joao.getNome());
    }

    static void comprimenta( Brasil quemComprimenta, String nomeDeQuemRecebeComprimento) {
        System.out.print(quemComprimenta.getNome());
        quemComprimenta.abracar(nomeDeQuemRecebeComprimento);
        System.out.print(" e diz");
        quemComprimenta.falar(nomeDeQuemRecebeComprimento);
        System.out.println();
    }
}
