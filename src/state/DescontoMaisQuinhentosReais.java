package state;

public class DescontoMaisQuinhentosReais implements IDesconto {
    private IDesconto desconto;

    public double desconta(Orcamento orcamento) {
        if (orcamento.getValor() >= 500.0) {
            return orcamento.getValor() * 0.07;
        }
        return 0;
    }

    @Override
    public void setProximo(IDesconto iDesconto) {
        this.desconto = iDesconto;
    }
}
