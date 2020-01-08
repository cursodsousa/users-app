import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component'
import { HomeComponent } from './home/home.component'
import { AuthGuardService } from './auth-guard.service'
import { FormComponent as PermissoesFormView } from './permissoes/form/form.component'
import { ListagemComponent as PermissoesListView } from './permissoes/listagem/listagem.component'

const routes: Routes = [
  { path: 'login', component: LoginComponent },
  { path: 'home', component: HomeComponent, canActivate: [AuthGuardService] },
  { path: 'permissoes-form', component: PermissoesFormView },
  { path: 'permissoes-list', component: PermissoesListView },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
