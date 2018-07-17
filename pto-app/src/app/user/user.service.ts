import {Injectable} from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { User } from '../../models/user.model';


const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class UserService {

  constructor(private http:HttpClient) {}

  private userUrl = 'http://localhost:8080';
	//private userUrl = '/rest/user';

  public getUsers() {
    return this.http.get('http://localhost:8080/rest/user/all');
    //return this.http.get<User[]>(this.userUrl);
  }

  public deleteUser(user) {
    return this.http.delete('http://localhost:8080/rest/user/delete' + "/" + user.id);
    //return this.http.delete(this.userUrl + "/"+ user.id);
  }

  public createUser(user) {
    return this.http.post<User>('http://localhost:8080/rest/user/new', user);
    //return this.http.post<User>(this.userUrl, user);
  }
  public updateUser(user){
    return this.http.put('http://localhost:8080/rest/user/update', user);
  }

}


