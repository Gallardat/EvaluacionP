import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MostrarBusComponent } from './mostrar-bus.component';

describe('MostrarBusComponent', () => {
  let component: MostrarBusComponent;
  let fixture: ComponentFixture<MostrarBusComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [MostrarBusComponent]
    });
    fixture = TestBed.createComponent(MostrarBusComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
