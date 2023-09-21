package adapter;

import targetAdapter.Brasil;
import targetAdapter.EstadosUnidos;

public class AmericanoAdapter implements Brasil {

    EstadosUnidos americano;

    public AmericanoAdapter(EstadosUnidos americano) {
        this.americano = americano;
    }

    @Override
    public void falar(String nomeDeQuemRecebeComprimento) {
        americano.falar(nomeDeQuemRecebeComprimento);
    }

    @Override
    public void abracar(String nomeDeQuemRecebeComprimento) {
        americano.acenar(nomeDeQuemRecebeComprimento);
    }

    @Override
    public String getNome() {
        return americano.getNome();
    }
}
