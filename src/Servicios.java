import java.util.ArrayList;

public class Servicios extends Articulo{
    private String duracion;
    private ArrayList<Facturas> facturas;

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public ArrayList<Facturas> getFacturas() {
        return facturas;
    }

    public void setFacturas(ArrayList<Facturas> facturas) {
        this.facturas = facturas;
    }
}
