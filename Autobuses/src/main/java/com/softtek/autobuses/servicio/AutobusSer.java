package com.softtek.autobuses.servicio;

import com.softtek.autobuses.modelo.Autobus;
import com.softtek.autobuses.modelo.Conductor;
import com.softtek.autobuses.modelo.Lugar;
import com.softtek.autobuses.modelo.Visita;
import com.softtek.autobuses.repositorio.IAutobusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutobusSer implements IAutobusSer {


    @Autowired
    IAutobusRepo repo;

    @Override
    public List<Autobus> listarBus() {
        return repo.listarBus();
    }

    @Override
    public List<Conductor> listarConductor() {
        return repo.listarConductor();
    }

    @Override
    public List<Lugar> listarLugar() {
        return repo.listarLugar();
    }

    @Override
    public List<Visita> listarVisitas() {
        return null;
    }


}
