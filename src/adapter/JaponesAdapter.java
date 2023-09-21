package adapter;

import targetAdapter.Brasil;
import targetAdapter.Japao;

public class JaponesAdapter implements Brasil {
    
    Japao japones;

    public JaponesAdapter(Japao japones) {
        this.japones = japones;
    }

    @Override
    public void falar(String nomeDeQuemRecebeComprimento) {
        japones.falar(nomeDeQuemRecebeComprimento);
    }

    @Override
    public void abracar(String nomeDeQuemRecebeComprimento) {
        japones.reverenciar(nomeDeQuemRecebeComprimento);
    }

    @Override
    public String getNome() {
        return japones.getNome();
    }
}
