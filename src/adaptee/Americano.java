package adaptee;

/**
 * Implementação do adaptee americano no padrão de design Adapter
 * @author equaglia
 */
public class Americano implements EstadosUnidos{

    String nome;

    public Americano(String nome) {
        this.nome = nome;
    }

    @Override
    public void falar(String nomeDeQuemRecebeComprimento) {
        System.out.print(" \"Hello, " + nomeDeQuemRecebeComprimento+"!\"");
    }

    @Override
    public void acenar(String nomeDeQuemRecebeComprimento) {
        System.out.print(" acena com a mão para " + nomeDeQuemRecebeComprimento);
    }

    @Override
    public String getNome() {
        return nome;
    }
    }
