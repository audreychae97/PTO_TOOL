import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { User } from '../../models/user.model';
import { UserService } from './user.service';

@Component({
    selector: 'app-user',
    templateUrl: './user.component.html',
    styles: []
  })
  
  export class UserComponent implements OnInit {
  
    users: User[];
    user: User = new User();
    constructor(private router: Router, private userService: UserService) {
  
    }
    ngOnInit() {
      this.getRouteData();
    };
    deleteUser(user: User): void {
      this.userService.deleteUser(user)
        .subscribe( (data: User) => {
          this.users = this.users.filter(u => u !== user);
        })
    };
    updatePTO(user: User): void{
      console.log(user);
      this.userService.updateUser(user)
        .subscribe(data => {
          this.getRouteData();
          alert("PTO requested for 8 hours");
        });
        
    };
    update(){
      this.getRouteData();
    };
    getRouteData(){
      this.userService.getUsers()
      .subscribe( (data: User[]) => {
        this.users = data;
      });
    };
  }

