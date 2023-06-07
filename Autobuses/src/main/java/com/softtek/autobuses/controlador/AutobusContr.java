package com.softtek.autobuses.controlador;

import com.softtek.autobuses.modelo.Autobus;
import com.softtek.autobuses.servicio.IAutobusSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/autobuses")
public class AutobusContr {

    @Autowired
    IAutobusSer servicio;

    @GetMapping
    public List<Autobus> listarBuses(){
    return servicio.listarBus();
    }
}
