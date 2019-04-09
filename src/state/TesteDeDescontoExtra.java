package state;

public class TesteDeDescontoExtra {

    public static void main(String[] args) {
        Orcamento reforma = new Orcamento(500);
        reforma.aplicaDescontoExtra();
        reforma.aprova();
        System.out.println(reforma.getValor());
    }
}
