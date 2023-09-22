package adaptee;

/**
 * Interface EstadosUnidos para gerar o adaptee americano ou similar no padrão Adapter
 * @author equaglia
 */
public interface EstadosUnidos {
    public String getNome();
    public void falar(String nomeDeQuemRecebeComprimento);
    public void acenar(String nomeDeQuemRecebeComprimento);
}
