package com.softtek.autobuses.modelo;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Visita {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idVisita;
    private String dateVisita;
    private String matriculaAutobus;
    private String dniConductor;
    private int idLugar;
}
