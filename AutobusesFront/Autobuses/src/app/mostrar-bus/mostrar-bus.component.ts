import { Component } from '@angular/core';
import { Autobus } from 'src/modelo/Autobus';
import { AutobusSerService } from 'src/servicio/autobus-ser.service';

@Component({
  selector: 'app-mostrar-bus',
  templateUrl: './mostrar-bus.component.html',
  styleUrls: ['./mostrar-bus.component.css']
})
export class MostrarBusComponent {

  autobuses: Autobus[]=[]

  constructor(private miServicio: AutobusSerService){}

  ngOnInit():void{
    this.listarBuses();
  }
  listarBuses(){
    this.miServicio.listarBus().subscribe(data=>this.autobuses=data)
  }
}
