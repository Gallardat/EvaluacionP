import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MostrarBusComponent } from './mostrar-bus/mostrar-bus.component';
import { AutobusSerService } from 'src/servicio/autobus-ser.service';

@NgModule({
  declarations: [
    AppComponent,
    MostrarBusComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [AutobusSerService],
  bootstrap: [AppComponent]
})
export class AppModule { }
