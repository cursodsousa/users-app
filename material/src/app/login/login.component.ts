import { Component } from '@angular/core';
import { Credentials  } from '../credentials'
import { Router } from '@angular/router'

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  credentials: Credentials  

  constructor( 
    private router: Router ){
     this.credentials = new Credentials('','');
  }

  login(event: any){
    event.preventDefault();
    localStorage.setItem('usuario_logado', JSON.stringify(this.credentials))
    this.router.navigate(['/home'])
  }

}