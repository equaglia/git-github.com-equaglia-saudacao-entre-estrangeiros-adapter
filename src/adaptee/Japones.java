package adaptee;

import target.Japao;

public class Japones implements Japao{

    String nome;

    public Japones(String nome) {
        this.nome = nome;
    }

    @Override
    public void falar(String nomeDeQuemRecebeComprimento) {
        System.out.print(" \"Konnichiwa " + nomeDeQuemRecebeComprimento+"\"");
    }

    @Override
    public void reverenciar(String nomeDeQuemRecebeComprimento) {
        System.out.print(" abaixa a cabeça reverenciando " + nomeDeQuemRecebeComprimento);
    }

    @Override
    public String getNome() {
        return nome;
    }    
}
