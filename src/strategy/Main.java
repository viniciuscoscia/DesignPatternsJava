package strategy;

/**
 * O Design Pattern Strategy é utilizado para reduzir a complexidade de algum método que tem muitas variações
 * por exemplo, o método realizaCalculo() lida com diversos tipos de cálculos de impostos sobre orçamento,
 * para evitar diversos tratamentos com "if", foi criada uma interface que é implementada para cada tipo de
 * objeto que é um imposto. A Interface tem um método calcula que faz o cálculo necessário
 */

public class Main {

    public static void main(String[] args) {
        CalculadorImposto calculadorImposto = new CalculadorImposto();
        calculadorImposto.realizaCalculo(new Orcamento(100), new ICMS());
        calculadorImposto.realizaCalculo(new Orcamento(100), new ISS());
    }
}
