import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor() { }

  isAutenticado(){

  }

  permitirAcesso(url){

  }

  getUsuarioAutenticado(){
    return localStorage.getItem('usuario')
  }
}
