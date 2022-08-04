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

      return this.http.get(`http://localhost:8099/userRegistrations/`+'?userName='+username +'&password='+password,{responseType: 'text'});
  
}
getUserDetails(username: string){
  return this.http.get(`http://localhost:8099/userRegistrations/mpd/`+'?userName='+username)

}
  getBalances(mobileNo:any, panNo:any, dateOfBirth:any) : Observable< any>{
    return this.http.get(`http://localhost:8099/userRegistrations/`+mobileNo+"/"+panNo+"/"+dateOfBirth);

  }
  updateCreditBal(accNo: any, amount: any, typeOfTransaction: any): Observable<any>{
    return this.http.patch(`http://localhost:8099/CreditAccounts/`+accNo+"/"+amount+"/"+typeOfTransaction,{responseType: 'text'});
  }
  updateCurrentBal(accNo: any, amount: any, typeOfTransaction: any): Observable<any>{
    return this.http.patch(`http://localhost:8099/CurrentAccounts/`+accNo+"/"+amount+"/"+typeOfTransaction,{responseType: 'text'});
  }
  
  updatePrepaidBal(accNo: any, amount: any, typeOfTransaction: any): Observable<any>{
    return this.http.patch(`http://localhost:8099/PrepaidAccounts/`+accNo+"/"+amount+"/"+typeOfTransaction,{responseType: 'text'});
  }
  updateSavingBal(accNo: any, amount: any, typeOfTransaction: any): Observable<any>{
    return this.http.patch(`http://localhost:8099/SavingAccounts/`+accNo+"/"+amount+"/"+typeOfTransaction,{responseType: 'text'});
  }
  
  
}