package chainOfResponsability;

public class Item {

    private final String name;
    private final double valor;

    public Item(String name, double valor) {
        this.name = name;
        this.valor = valor;
    }

    public String getName() {
        return name;
    }

    public double getValor() {
        return valor;
    }
}
