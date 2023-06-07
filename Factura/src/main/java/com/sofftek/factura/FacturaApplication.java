package com.sofftek.factura;

import com.sofftek.factura.modelo.Factura;
import com.sofftek.factura.modelo.IImpuesto;
import com.sofftek.factura.modelo.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FacturaApplication implements CommandLineRunner {

    @Autowired
    Producto productos;

    @Autowired
    Factura facturas;

    public static void main(String[] args) {
        SpringApplication.run(FacturaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        productos.setPrecio(4);
        productos.setNombre("leche");
        System.out.println("El total de la factura es: "+facturas.calcularTotalFactura(productos)+" del producto "+ productos.getNombre());
    }
}
