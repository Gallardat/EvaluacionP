package com.sofftek.factura.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Factura {
    @Autowired
    @Qualifier("ivaReducido")
    IImpuesto impuesto;



   public double calcularTotalFactura(Producto p){
    return impuesto.calcularImpuesto(p);
   }
}
