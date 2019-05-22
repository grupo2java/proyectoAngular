import { Injectable } from '@angular/core';

//Nuevo
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Persona } from '../modelos/persona';

//Nuevo
const httpOptions = {
 headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};


@Injectable({
  providedIn: 'root'
})
export class PersonaServiceService {

  constructor(private http:HttpClient) { }

  private personaUrl = 'http://localhost:8080/persona-portal/persona';
  //private userUrl = '/api';
  //lista de arrays
  public getUsers() {
    return this.http.get<Persona[]>(this.personaUrl);
  }
 //elimina un usuario
  //http://localhost:8080/user-portal/users/5
  public deletePersona(persona) {
    return this.http.delete(this.personaUrl + "/"+ persona.idpersona);
  }
 //te devuelve un usuario
  public createUser(persona) {
    return this.http.post<Persona>(this.personaUrl, persona);
  }

  



}
