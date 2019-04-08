package templateMethod;

public interface IDesconto {
    double desconta(Orcamento orcamento);
    void setProximo(IDesconto iDesconto);
}
