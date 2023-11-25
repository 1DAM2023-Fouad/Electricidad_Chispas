import java.util.ArrayList;

public class Productos extends Articulo{
    private String marca;
    private String modelo;
    private ArrayList<Facturas> facturas;

    public String getMarca()  {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public ArrayList<Facturas> getFacturas() {
        return facturas;
    }

    public void setFacturas(ArrayList<Facturas> facturas) {
        this.facturas = facturas;
    }
}
