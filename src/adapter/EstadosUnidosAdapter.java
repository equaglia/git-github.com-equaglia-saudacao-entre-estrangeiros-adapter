package adapter;

import adaptee.EstadosUnidos;
import target.Estrangeiro;

/**
 * Adapter de estrangeiro para americano
 * 
 * @author equaglia
 */
public class EstadosUnidosAdapter implements Estrangeiro {

    EstadosUnidos americano;

    public EstadosUnidosAdapter(EstadosUnidos americano) {
        this.americano = americano;
    }

    @Override
    public void falar(String nomeDeQuemRecebeComprimento) {
        americano.falar(nomeDeQuemRecebeComprimento);
    }

    @Override
    public void agir(String nomeDeQuemRecebeComprimento) {
        /* metodo acenar() do americano substitue o metodo agir() do estrangeiro */
        americano.acenar(nomeDeQuemRecebeComprimento);
    }

    @Override
    public String getNome() {
        return americano.getNome();
    }
}
