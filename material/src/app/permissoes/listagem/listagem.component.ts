import { Component, OnInit } from '@angular/core';
import { Permissao } from '../permissao'
import { PermissaoService } from '../permissao.service'

@Component({
  selector: 'app-listagem',
  templateUrl: './listagem.component.html',
  styleUrls: ['./listagem.component.css']
})
export class ListagemComponent implements OnInit {

  filtro: Permissao;
  permissoes: Array<Permissao> = [];
  displayedColumns: string[] = ['id', 'descricao', 'identificacao']

  constructor( private service: PermissaoService ) { this.filtro = new Permissao(); }

  ngOnInit() {
    this
        .service
        .consultar(this.filtro)
        .subscribe( page => {
          this.permissoes = page.content;
        })
  }

  consultar(event){
    event.preventDefault();
    this.service
      .consultar(this.filtro)
  }

}
