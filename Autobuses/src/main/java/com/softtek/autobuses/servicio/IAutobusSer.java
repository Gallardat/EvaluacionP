package com.softtek.autobuses.servicio;

import com.softtek.autobuses.modelo.*;


import java.util.List;

public interface IAutobusSer {

    List<Autobus> listarBus();

    List<Conductor> listarConductor();
    List<Lugar> listarLugar();

    List<Visita> listarVisitas();

}
