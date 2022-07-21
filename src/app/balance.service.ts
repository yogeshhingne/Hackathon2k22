import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { map, Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class BalanceService {
  
  constructor(private http:HttpClient) { }
  getBalances(mobileNo:any, panNo:any, dateOfBirth:any) : Observable< any>{
    return this.http.get(`http://localhost:8099/accontsDetails/`+mobileNo+"/"+panNo+"/"+dateOfBirth);

  }
  login(data: any):Observable<any>{
    return this.http.post(`http://localhost:8099/token`,data);
  }
}