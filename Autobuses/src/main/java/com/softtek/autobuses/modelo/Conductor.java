package com.softtek.autobuses.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="conductores")
public class Conductor {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private String dni;
    private String nombreConductor;



}
