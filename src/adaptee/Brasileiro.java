package adaptee;

import target.Brasil;

public class Brasileiro implements Brasil{

    String nome;

    public Brasileiro(String nome) {
        this.nome = nome;
    }

    @Override
    public void falar(String nomeDeQuemRecebeComprimento) {
        System.out.print(" \"Olá " + nomeDeQuemRecebeComprimento+"\"");
    }

    @Override
    public void abracar(String nomeDeQuemRecebeComprimento) {
        System.out.print(" dá um abraço em " + nomeDeQuemRecebeComprimento);
    }

    @Override
    public String getNome() {
        return nome;
    }
}
