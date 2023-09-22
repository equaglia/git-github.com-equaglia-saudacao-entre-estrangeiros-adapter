package client;
import adapter.BrasilAdapter;
import adapter.EstadosUnidosAdapter;
import adapter.JapaoAdapter;
import target.Estrangeiro;
import adaptee.Americano;
import adaptee.Brasileiro;
import adaptee.Japones;

/**
 * client SaudacaoEntreEstrangeiros no padrão Adapter
 * @author equaglia
 */
public class SaudacaoEntreEstrangeiros {
    
    public static void main(String[] args) {
        Estrangeiro joao = new BrasilAdapter(new Brasileiro("Joao"));
        Estrangeiro mark = new EstadosUnidosAdapter(new Americano("Mark"));
        Estrangeiro kazuki = new JapaoAdapter(new Japones("Kazuki"));

        System.out.println("Saudação Entre Estrangeiros:\n"+
        "Três estrangeiros, João do Brasil, Mark dos Estados Unidos e Kazuki do Japão, \n" 
        + "se encontram e se cumprimentam, mas na forma como fazem no seu país de origem:\n");

        // João cumprimenta Mark e ele responde 
        cumprimenta(joao, mark);
        cumprimenta(mark, joao);
        System.out.println();
        
        // João cumprimenta Kazuki e ele responde
        cumprimenta(joao, kazuki);
        cumprimenta(kazuki, joao);
        System.out.println();

        // Entra mais um brasileiro que cumprimenta cada um deles. Todos respondem também com cumprimento.
        System.out.println("Então, chega o brasileiro Paulo, que cumprimenta os demais: ");
        Estrangeiro paulo = new BrasilAdapter(new Brasileiro("Paulo"));
        cumprimenta(paulo, joao);
        cumprimenta(paulo, kazuki);
        cumprimenta(paulo, mark);
        System.out.println();
        System.out.println("e todos respondem ao Paulo:");
        cumprimenta(joao, paulo);
        cumprimenta(kazuki, paulo);
        cumprimenta(mark, paulo);
    }

    static void cumprimenta( Estrangeiro quemCumprimenta, Estrangeiro quemRecebeCumprimento) {
        String nomeDeQuemRecebeCumprimento = quemRecebeCumprimento.getNome();
        System.out.print(quemCumprimenta.getNome());
        quemCumprimenta.agir(nomeDeQuemRecebeCumprimento);
        System.out.print(" e diz");
        quemCumprimenta.falar(nomeDeQuemRecebeCumprimento);
        System.out.println();
    }
}
