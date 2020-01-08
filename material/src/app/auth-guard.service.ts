import { Injectable } from '@angular/core';
import {
  CanActivate,
  Router,
  RouterStateSnapshot,
  ActivatedRouteSnapshot
} from '@angular/router'

@Injectable({
  providedIn: 'root'
})
export class AuthGuardService implements CanActivate {

  constructor( private router: Router ) { }
  
  canActivate( route: ActivatedRouteSnapshot,
               state: RouterStateSnapshot ) : boolean {

      const { data } = route;
      console.log(data);
      const url: string = state.url;
      const value: boolean = localStorage.getItem('usuario_logado') !== null && localStorage.getItem('usuario_logado') !== undefined;
      if (!value) {
        this.router.navigate(['/login'])
      }
      return value;
  }
}
