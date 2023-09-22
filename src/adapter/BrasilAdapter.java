package adapter;

import adaptee.Brasil;
import target.Estrangeiro;

/**
 * Adapter de estrangeiro para brasileiro
 * 
 * @author equaglia
 */
public class BrasilAdapter implements Estrangeiro {
    
    Brasil brasileiro;

    public BrasilAdapter(Brasil brasileiro) {
        this.brasileiro = brasileiro;
    }

    @Override
    public void falar(String nomeDeQuemRecebeComprimento) {
        brasileiro.falar(nomeDeQuemRecebeComprimento);
    }

    @Override
    public void agir(String nomeDeQuemRecebeComprimento) {
        /* método abracar() do brasileiro substitue o método agir() do estrangeiro */
        brasileiro.abracar(nomeDeQuemRecebeComprimento);
    }

    @Override
    public String getNome() {
        return brasileiro.getNome();
    }
}
