package target;

/**
 * Interface Estrangeiro target (alvo) no padrão de design Adapter
 * 
 * @author equaglia
 */
public interface Estrangeiro {
    /* getNome para retornar o nome de quem vai cumprimentar */
    public String getNome();
    
    /* parametro nomeDeQuemRecebeCumprimento indica o nome de quem vai receber o cumprimento */
    public void falar(String nomeDeQuemRecebeCumprimento);
    public void agir(String nomeDeQuemRecebeCumprimento);
}
