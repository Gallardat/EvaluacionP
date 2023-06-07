import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Autobus } from 'src/modelo/Autobus';

@Injectable({
  providedIn: 'root'
})
export class AutobusSerService {

  private url: string="http://localhost:8080/autobuses"

  constructor(private http: HttpClient) {}

    listarBus():Observable<Autobus[]>{
      return this.http.get<Autobus[]>(this.url)
    }


}
