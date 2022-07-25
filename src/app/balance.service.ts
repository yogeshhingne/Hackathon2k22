import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { BehaviorSubject, map, Observable } from 'rxjs';
import { User } from './user/User';

@Injectable({
  providedIn: 'root'
})
export class BalanceService {
  private currentUserSubject!: BehaviorSubject<User>;
  
  constructor(private http:HttpClient) { }
  
  public get currentUserValue(): User {
    return this.currentUserSubject.value;
}
login1(username: string, password: string) {
  console.log("p"+password+"u"+username);

      return this.http.get(`http://localhost:8080/userRegistrations/`+'?userName='+username +'&password='+password,{responseType: 'text'});
  
}

  getBalances(mobileNo:any, panNo:any, dateOfBirth:any) : Observable< any>{
    return this.http.get(`http://localhost:8080/accontsDetails/`+mobileNo+"/"+panNo+"/"+dateOfBirth);

  }
  
}