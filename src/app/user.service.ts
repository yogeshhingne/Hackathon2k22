import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http : HttpClient) { }
  getUser(){
    return this.http.get("http://localhost:8099/user/");
  }
  insertUser(registration: any) {
    return this.http.post("http://localhost:8099/userRegistrations/", registration);
  }
}
