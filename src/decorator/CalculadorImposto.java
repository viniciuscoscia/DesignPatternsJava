package decorator;

public class CalculadorImposto {

    public void realizaCalculo(Orcamento orcamento, Imposto imposto) {
        double icms = imposto.calculaImposto(orcamento);
        System.out.println(icms);
    }

}
