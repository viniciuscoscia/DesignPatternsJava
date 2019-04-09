package state;

public class DescontoCincoItens implements IDesconto {
    private IDesconto desconto;

    public double desconta(Orcamento orcamento) {
        if (orcamento.getItens().size() >= 5) {
            return orcamento.getValor() * 0.1;
        }
        return desconto.desconta(orcamento);
    }

    @Override
    public void setProximo(IDesconto desconto) {
        this.desconto = desconto;
    }

}
