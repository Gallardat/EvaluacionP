package com.softtek.autobuses.repositorio;

import com.softtek.autobuses.modelo.*;
import com.softtek.autobuses.modelo.Visita;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AutobusRepo implements IAutobusRepo{

    List<Visita> visitas= new ArrayList<>();
    List<Conductor> conductores= new ArrayList<>();
    List<Lugar> lugares= new ArrayList<>();
    @Override
    public List<Autobus> listarBus() {
        List<Autobus>autobuses= new ArrayList<>();
        autobuses.add(new Autobus("1", 1991));
        autobuses.add(new Autobus("2", 1992));
        autobuses.add(new Autobus("3", 1993));
        return autobuses;
    }

    @Override
    public List<Conductor> listarConductor() {

        conductores.add(new Conductor("1", "Manuel"));
        conductores.add(new Conductor("2", "Jose"));
        return conductores;
    }

    @Override
    public List<Lugar> listarLugar() {
        lugares.add(new Lugar(1,"madrid"));
        lugares.add(new Lugar(1,"madrid"));
        return lugares;
    }

    @Override
    public List<Visita> crearVisita(Autobus a, Conductor c, Lugar l) {
        visitas.add(new Visita(1,"12-12-2023","1","2",1));
        return visitas;
    }


}
