package com.softtek.autobuses.repositorio;

import com.softtek.autobuses.modelo.*;
import com.softtek.autobuses.modelo.Visita;


import java.util.List;



public interface IAutobusRepo {

    List<Autobus> listarBus();

    List<Conductor> listarConductor();

    List<Lugar> listarLugar();

    List<Visita> crearVisita(Autobus autobus,Conductor conductor, Lugar lugar);



}
