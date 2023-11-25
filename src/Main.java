import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Electricidad Chispas");


        // Cliente: Sociedad
        Sociedades sociedades = new Sociedades();

        sociedades.setIrpf("1231");
        sociedades.setCodigo("11df");
        sociedades.setNombre("Sociedad SL");
        sociedades.setDni("12462913-H");
        sociedades.setDireccionPostal("Calle los tulipanes");
        sociedades.setPoblacion("Arenas de San Pedro");
        sociedades.setProvincia("Ávila");
        sociedades.setEmail("sociedad@gamil.com");
        sociedades.setTelefono("641883159");

        // Clinente: Autónomocd
        Autonomo autonomo = new Autonomo();

        autonomo.setSeguro("#2481");
        autonomo.setNombre("Javier Fernandez");
        autonomo.setCodigo("11df");
        autonomo.setNombre("Sociedad SL");
        autonomo.setDni("12462913-H");
        autonomo.setDireccionPostal("Calle me falta un tornillo");
        autonomo.setPoblacion("Medina del campo");
        autonomo.setProvincia("Valladolid");
        autonomo.setEmail("atuonomo@gamil.com");
        autonomo.setTelefono("641883159");

        // Artículo: Producto
        Productos productos = new Productos();

        productos.setMarca("HP");
        productos.setModelo("Spectre");
        productos.setCodigo(".147");
        productos.setNombre("Ordenador");
        productos.setPrecio("548 €");
        productos.setTipoIva("21%");

        // Artículo: Servicio
        Servicios servicios = new Servicios();

        servicios.setDuracion("50 minutos");
        servicios.setCodigo(".153");
        servicios.setNombre("Reparación de teléfono");
        servicios.setPrecio("24,96 €");
        servicios.setTipoIva("10%");

        // Factura
        Facturas facturas=new Facturas();
        facturas.setFechaFactura("25/11/2023");
        facturas.setCodigoFactura(".4896");
        facturas.setBaseImponible("548");
        facturas.setTotal("548 + 21%");


        imprimir(autonomo);
        imprimir(sociedades);
        imprimir(productos);
        imprimir(servicios);

        sc.close();
    }


    // Imprimir Cliente
    public static void imprimir(Cliente cliente) {
        System.out.println("Código: " + cliente.getCodigo());
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("DNI: " + cliente.getDni());
        System.out.println("Dirección postal: " + cliente.getDireccionPostal());
        System.out.println("Población: " + cliente.getPoblacion());
        System.out.println("Email: " + cliente.getEmail());
        System.out.println("Teléfono: " + cliente.getTelefono());
    }

    // Imprimir Artículo
    public static void imprimir(Articulo articulo) {
        System.out.println("Código: " + articulo.getCodigo());
        System.out.println("Nombre: " + articulo.getNombre());
        System.out.println("Precio: " + articulo.getPrecio());
        System.out.println("Tipo IVA: " + articulo.getTipoIva());
    }


}