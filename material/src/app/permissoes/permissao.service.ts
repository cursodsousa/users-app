import { Injectable, Inject } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs'

import { Permissao } from './permissao'

@Injectable({
  providedIn: 'root'
})
export class PermissaoService {

  private url: string;

  constructor(
    private http: HttpClient,
    @Inject('API_BASEURL') private baseUrl: string,
    ) { 
    this.url = `${baseUrl}/permissoes`
  }

  salvar( permissao: Permissao ) : Observable<Permissao>{
    return this.http.post<Permissao>(this.url, permissao);
  }

  consultar( filtro: Permissao ) : Observable<any>{
    let queryParams = '?page=0&size=10'
    
    return this.http.get<any>(`${this.url}${queryParams}`);
  }
}
