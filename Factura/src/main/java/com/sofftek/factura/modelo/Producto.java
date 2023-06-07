package com.sofftek.factura.modelo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data

@NoArgsConstructor
@Component
public class Producto {

    private String nombre;
    private double precio;
}
