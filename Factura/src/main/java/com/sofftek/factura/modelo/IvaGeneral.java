package com.sofftek.factura.modelo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("ivaGeneral")
public class IvaGeneral implements IImpuesto{
    @Override
    public double calcularImpuesto(Producto p1) {
        double impuestoGeneral=p1.getPrecio()+(p1.getPrecio()*0.21);

        return impuestoGeneral;
    }
}
