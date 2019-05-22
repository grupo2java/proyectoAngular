import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {ListarContactosComponent} from './componentes/listar-contactos/listar-contactos.component';
//import {ListaProvincias}from './componentes/listar-contactos/listar-contactos.component'
import{LoginComponent} from './componentes/login/login.component';
import{ListarProvinciasComponent} from './componentes/listar-provincias/listar-provincias.component';
import{FormularioContactoComponent} from './componentes/formulario-contacto/formulario-contacto.component';
//Creamos las rutas

const routes: Routes = [
  
  { path: 'listarContactos', component: ListarContactosComponent },
  { path: '', component: LoginComponent },
  //{ path: '/login', component: LoginComponent },
  { path: 'listarProvincias', component: ListarProvinciasComponent },
  { path: 'formularioContacto', component: FormularioContactoComponent }

 ];





@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
