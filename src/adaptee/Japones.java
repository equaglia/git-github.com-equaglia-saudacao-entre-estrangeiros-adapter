package adaptee;

/**
 * Implementação do adaptee japones no padrão de design Adapter
 * @author equaglia
 */
public class Japones implements Japao{

    String nome;

    public Japones(String nome) {
        this.nome = nome;
    }

    @Override
    /* na linguagem japonesa, o nome da pessoa a ser cumprimentada vem antes do cumprimento */
    public void falar(String nomeDeQuemRecebeComprimento) {
        System.out.print(" \""+nomeDeQuemRecebeComprimento+" san, konnichiwa!"+"\"");
    }

    @Override
    /* é comum na cultura japonesa reverenciar uma pessoa, abaixando a cabeça, quando está se cumprimentando */
    public void reverenciar(String nomeDeQuemRecebeComprimento) {
        System.out.print(" abaixa a cabeça reverenciando " + nomeDeQuemRecebeComprimento);
    }

    @Override
    public String getNome() {
        return nome;
    }    
}
