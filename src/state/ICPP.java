package state;

public class ICPP extends TemplateImpostoCondicional {
    @Override
    public double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.05;
    }

    @Override
    public double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.07;
    }

    @Override
    public boolean usarMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() > 500;
    }
}
