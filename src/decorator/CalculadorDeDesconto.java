package decorator;

public class CalculadorDeDesconto {
    public double calcular(Orcamento orcamento) {
        IDesconto d1 = new DescontoCincoItens();
        IDesconto d2 = new DescontoMaisQuinhentosReais();

        d1.setProximo(d2);

        return d1.desconta(orcamento);
    }
}
