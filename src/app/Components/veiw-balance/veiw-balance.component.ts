import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { BalanceService } from 'src/app/balance.service';
import { User } from 'src/app/Component/sign-in/User';
import { NewUser } from 'src/app/user/User';

@Component({
  selector: 'app-veiw-balance',
  templateUrl: './veiw-balance.component.html',
  styleUrls: ['./veiw-balance.component.css']
})
export class VeiwBalanceComponent implements OnInit {
  balances: any
  Balance:any;
  listOfBalances: any= [];
  loginForm: any;
  submitted!: boolean;
  router: any;
  response:any;
  checkUser !: NewUser;
  panNo:any;
  user : any;
  constructor(private service :BalanceService, private formBuilder: FormBuilder, private rout : Router
    ) { }

  ngOnInit(){
    let mobile_no= localStorage.getItem("mobileNo") as any ; 
    let pan_no = localStorage.getItem("panNo") as any; 
    let date_of_birth = localStorage.getItem("dateOfBirth") as any; 
    let user_name=localStorage.getItem("username")  as string;
    this.service.getUserDetails(user_name)
          .subscribe(
              data => {
                this.response=data;
                console.log("from service"+data);
               this.user= data;
               this.checkUser = this.user;
               console.log("Mobile number: ."+this.checkUser.mobileNo);
               if(this.checkUser.mobileNo==mobile_no && this.checkUser.panNo==pan_no && this.checkUser.dateOfBirth==date_of_birth){
                this.service.getBalances(this.checkUser.mobileNo, this.checkUser.panNo,this.checkUser.dateOfBirth).subscribe(data=>
                  {
                      this.listOfBalances.push(data);
                    console.log("view comp data"+this.listOfBalances);
                  });
                }else{
                  alert("You have entered wrong credential")
                }
                    // localStorage.clear();
               
              });
      }
          
    }


