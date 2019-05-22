import { Component, OnInit } from '@angular/core';
import { Persona } from '../../modelos/persona';
import { PersonaServiceService } from '../../servicios/persona-service.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-listar-contactos',
  templateUrl: './listar-contactos.component.html',
  styleUrls: ['./listar-contactos.component.css']
})
export class ListarContactosComponent implements OnInit {


  personas: Persona[];

  constructor(private router: Router, private personaService: PersonaServiceService) { }

  ngOnInit() {
    this.personaService.getUsers().subscribe(data => {
      this.personas = data;
    });

  };
  deleteUser(persona:Persona): void {
    this.personaService.deletePersona(persona)
      .subscribe( data => {
        this.personas = this.personas.filter(u => u !== persona);
      })
  };
}
