import { Component, OnInit } from '@angular/core';

import { MatDialog, MatDialogRef } from '@angular/material/dialog'

import { PermissaoService } from '../permissao.service'
import { Permissao } from '../permissao'

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: []
})
export class FormComponent {

  permissao: Permissao = new Permissao();

  constructor(
    private service: PermissaoService,
    private dialog: MatDialog
    ) { }

  submit(event){
    console.log(this.permissao)
    this.service
      .salvar(this.permissao)
      .subscribe( result => console.log(result) )
  }
}
