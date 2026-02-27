import java.util.ArrayList;
import java.util.List;

public class Cartaodecredito {
    private double limite;
    private double saldo;
    private List<compras> compras;


    public Cartaodecredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();

    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<compras> getCompras() {
        return compras;
    }

    public boolean lancacompra(compras Compras) {
        if (this.saldo > Compras.getValordacompra()) {
            this.saldo -= Compras.getValordacompra();
            this.compras.add(Compras);
            return true;
        }
        return false;
    }
}



