package com.softtek.autobuses.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="lugares")
public class Lugar {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idLugar;
    private String nombreLugar;
}
