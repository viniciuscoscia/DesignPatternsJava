package state;

public class CalculadorImposto {

    public void realizaCalculo(Orcamento orcamento, Imposto imposto) {
        double icms = imposto.calcula(orcamento);
        System.out.println(icms);
    }

}
