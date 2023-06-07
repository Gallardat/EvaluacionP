package com.softtek.autobuses.modelo;


import jakarta.persistence.*;
import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="autobus")
public class Autobus {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private String matricula;

    private int  aFabricacion;



}
