import { HttpEvent } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

import {FormControl,FormBuilder,FormGroup,Validators} from '@angular/forms';

import { Router, ActivatedRoute } from '@angular/router';

import { first } from 'rxjs/operators';
import { BalanceService } from 'src/app/balance.service';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  //currentUser:any;
  listOfBalances: any= [];
  loginForm: any;
    loading = false;
    submitted = false;
    returnUrl!: string;
    selected!:string; 
     response!:string;
     type!:HTMLElement;
    constructor(
        private formBuilder: FormBuilder,
        private route: ActivatedRoute,
        private router: Router,
        private service: BalanceService
    ) { }
    
    ngOnInit() {
        console.log(localStorage.getItem('mobileNo'));
        console.log(localStorage.getItem('panNo'));
        console.log(localStorage.getItem('dateOfBirth'))
        localStorage.clear();
        this.loginForm = this.formBuilder.group({
          mobileNo: ['', [Validators.required, Validators.pattern("^((\\+91-?)|0)?[0-9]{10}$")]],
          panNo: ['',[Validators.required, Validators.pattern("^[a-zA-Z]{5}[0-9]{4}[a-zA-Z]{1}$")]],
          dateOfBirth:['',Validators.required]
        });
       

           }
    get f() { return this.loginForm.controls; }
  
    onSubmit() {
      if (this.loginForm.invalid) {
             return;
        }
      localStorage.setItem('mobileNo', this.f.mobileNo.value);
      localStorage.setItem('panNo', this.f.panNo.value);
      localStorage.setItem('dateOfBirth', this.f.dateOfBirth.value); 
        this.router.navigateByUrl('viewBalance');
    }
}



