package state;

public abstract class TemplateImpostoCondicional extends Imposto {

    @Override
    public double calcula(Orcamento orcamento) {
        if (usarMaximaTaxacao(orcamento)) {
            return maximaTaxacao(orcamento) + calculaOutroImposto(orcamento);
        }
        return minimaTaxacao(orcamento) + calculaOutroImposto(orcamento);
    }

    public abstract double minimaTaxacao(Orcamento orcamento);

    public abstract double maximaTaxacao(Orcamento orcamento);

    public abstract boolean usarMaximaTaxacao(Orcamento orcamento);
}
