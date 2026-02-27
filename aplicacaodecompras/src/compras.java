public class compras implements Comparable<compras> {
    private double limite;
    private String descricaodacompra;
    private double valordacompra;


    public compras(String descricaodacompra, Double valordacompra){
        this.limite = limite;

        this.descricaodacompra = descricaodacompra;
        this.valordacompra = valordacompra;
    }

    public double getlimite() {
        return limite;
    }

    public void setlimite(double limite) {
        this.limite = limite;
    }

    public String getDescricaodacompra() {
        return descricaodacompra;
    }

    public void setDescricaodacompra(String descricaodacompra) {
        this.descricaodacompra = descricaodacompra;
    }

    public double getValordacompra() {
        return valordacompra;
    }

    public void setValordacompra(double valordacompra) {
        this.valordacompra = valordacompra;
    }



    @Override
    public String toString() {
        return "Compra: " + descricaodacompra +
                " valordacompra : "+ valordacompra;

    }

    @Override
    public int compareTo(compras outracompra) {
        return Double.valueOf(this.valordacompra).compareTo(Double.valueOf(outracompra.valordacompra));
    }
}
