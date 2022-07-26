import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { BalanceService } from 'src/app/balance.service';

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
  
  constructor(private service :BalanceService, private formBuilder: FormBuilder
    ) { }

  ngOnInit(){
    let mobile_no= localStorage.getItem("mobileNo") ; 
    let pan_no = localStorage.getItem("panNo"); 
    let date_of_birth = localStorage.getItem("dateOfBirth"); 
   this.service.getBalances(mobile_no,pan_no,date_of_birth).subscribe(data=>
      {
       if(this.listOfBalances!=null){
        alert("This user has not registered for any account")
       }else
       {
        this.listOfBalances.push(data);
       }
        console.log("view comp data"+this.listOfBalances);
      });
        localStorage.clear();
      }
          
    }


