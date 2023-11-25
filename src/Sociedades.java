public class Sociedades extends Cliente{
    private String irpf;
    private Facturas facturas; // Dependencia.

    public String getIrpf() {
        return irpf;
    }

    public void setIrpf(String irpf) {
        this.irpf = irpf;
    }

    public Facturas getFacturas() {
        return facturas;
    }

    public void setFactura(Facturas factura) {
        this.facturas = factura;
    }
}
