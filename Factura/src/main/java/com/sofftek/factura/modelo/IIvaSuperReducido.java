package com.sofftek.factura.modelo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.imageio.metadata.IIOMetadataController;

@Component
@Qualifier("ivaReducido")
public class IIvaSuperReducido implements IImpuesto {
    @Override
    public double calcularImpuesto(Producto p1) {
        double impuestoReducido=p1.getPrecio()+(p1.getPrecio()*0.10);
        return impuestoReducido;
    }
}
