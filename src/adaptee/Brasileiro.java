package adaptee;

/**
 * Implementação de um adaptee brasileiro no padrão de design Adapter * 
 * @author equaglia
 */
public class Brasileiro implements Brasil{

    String nome;

    public Brasileiro(String nome) {
        this.nome = nome;
    }

    @Override
    public void falar(String nomeDeQuemRecebeComprimento) {
        System.out.print(" \"Olá, " + nomeDeQuemRecebeComprimento+"!\"");
    }

    @Override
    /* é comum na cultura brasileira abraçar uma pessoa quando está se cumprimentando */
    public void abracar(String nomeDeQuemRecebeComprimento) {
        System.out.print(" dá um abraço em " + nomeDeQuemRecebeComprimento);
    }

    @Override
    public String getNome() {
        return nome;
    }
}
