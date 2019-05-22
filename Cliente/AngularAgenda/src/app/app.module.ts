import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './componentes/login/login.component';
import { ListarContactosComponent } from './componentes/listar-contactos/listar-contactos.component';
import { ListarProvinciasComponent } from './componentes/listar-provincias/listar-provincias.component';
import { FormularioContactoComponent } from './componentes/formulario-contacto/formulario-contacto.component';
import {HttpClientModule} from '@angular/common/http';
import {PersonaServiceService} from './servicios/persona-service.service';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    ListarContactosComponent,
    ListarProvinciasComponent,
    FormularioContactoComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,


  ],
  providers: [PersonaServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
