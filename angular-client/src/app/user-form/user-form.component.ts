import { Component, OnInit } from '@angular/core';
import { User } from '../user';
import { ActivatedRoute, Router } from '@angular/router';
import { UserServiceService } from '../user-service.service';

@Component({
  selector: 'app-user-form',
  templateUrl: './user-form.component.html',
})
export class UserFormComponent implements OnInit {

  user: User;

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private userService: UserServiceService
  ) { 
    this.user = new User();
  }

  ngOnInit(){ }

  onSubmit(){
    this.userService.save(this.user).subscribe(result => this.toList())
  }

  toList(){
    this.router.navigate(['/users'])
  }

}
