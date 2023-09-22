package adapter;

import adaptee.Japao;
import target.Estrangeiro;

/**
 * Adapter de japones para estrangeiros
 * 
 * @author equaglia
 */
public class JapaoAdapter implements Estrangeiro {
    
    Japao japones;

    public JapaoAdapter(Japao japones) {
        this.japones = japones;
    }

    @Override
    public void falar(String nomeDeQuemRecebeComprimento) {
        japones.falar(nomeDeQuemRecebeComprimento);
    }

    @Override
    public void agir(String nomeDeQuemRecebeComprimento) {
        /* metodo reverenciar() do japones substitue o metodo agir() do estrangeiro */
        japones.reverenciar(nomeDeQuemRecebeComprimento);
    }

    @Override
    public String getNome() {
        return japones.getNome();
    }
}
