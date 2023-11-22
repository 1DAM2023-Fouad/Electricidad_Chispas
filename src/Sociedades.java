public class Sociedades extends Cliente{
    private String irpf;
    private Facturas factura;

    public String getIrpf() {
        return irpf;
    }

    public void setIrpf(String irpf) {
        this.irpf = irpf;
    }

    public Facturas getFactura() {
        return factura;
    }

    public void setFactura(Facturas factura) {
        this.factura = factura;
    }
}
