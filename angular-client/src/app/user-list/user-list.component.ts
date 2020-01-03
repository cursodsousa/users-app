import { Component, OnInit } from '@angular/core';
import { UserServiceService } from '../user-service.service';
import { User } from '../user';

@Component({
  selector: 'app-user-list',
  templateUrl: './user-list.component.html',
})
export class UserListComponent implements OnInit {

  users: User[];

  constructor(private userService: UserServiceService) { }

  ngOnInit() {
    this.userService.findAll().subscribe( data => {
      this.users = data;
    })
  }

}
