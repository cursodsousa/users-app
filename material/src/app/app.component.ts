import { Component } from '@angular/core';
import { Credentials  } from './credentials'

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  credentials: Credentials = new Credentials('Fulano','');

  login(event: any){
    console.log(this.credentials)
  }
}
