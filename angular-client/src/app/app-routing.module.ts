import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {UserFormComponent} from './user-form/user-form.component'
import { UserListComponent } from './user-list/user-list.component';


const routes: Routes = [
  { path: 'adduser', component: UserFormComponent },
  { path: 'users', component: UserListComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
