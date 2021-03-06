package decorator;

/**
 * Em Decorator, utilizamos uma classe abstrata (Imposto) que tem um construtor que aceita
 * outro objeto do mesmo tipo, é feita também uma função que retorna dados relevantes
 * para o uso.
 */

public class Main {

    public static void main(String[] args) {
        Imposto imposto = new ICMS(new ICPP());

        Orcamento orcamento = new Orcamento(500.0);
        double v = imposto.calculaOutroImposto(orcamento);

        System.out.println(v);
    }
}
