import { Component } from '@angular/core';
import { Router } from '@angular/router';

import { User } from '../../models/user.model';
import { UserService } from './user.service';

@Component({
  templateUrl: './user.component.html'
  
})
export class HomeComponent {

  user: User = new User();

  constructor(private router: Router, private userService: UserService) {

  }

}