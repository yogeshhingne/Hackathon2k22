import { HttpEvent } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

import {FormControl,FormBuilder,FormGroup,Validators} from '@angular/forms';

import { Router, ActivatedRoute } from '@angular/router';

import { first } from 'rxjs/operators';
import { BalanceService } from 'src/app/balance.service';

@Component({
  selector: 'app-sign-in',
  templateUrl: './sign-in.component.html',
  styleUrls: ['./sign-in.component.css']
})
export class SignInComponent implements OnInit {
  loginForm!: FormGroup; 
  submitted = false;
  constructor(private formBuilder: FormBuilder,
    private route: ActivatedRoute,
    private router: Router,
    private service: BalanceService) { }

  ngOnInit(): void { 
    this.initForm()
  }
      get f() { return this.loginForm.controls; }

  initForm(){
    this.loginForm = this.formBuilder.group(
      {
        username:new FormControl('',[Validators.required]),
        password:new FormControl('',[Validators.required]),
      }
    );
  }
  loginProces(){
      this.service.login(this.loginForm.value).subscribe(result=>{
        console.log(result);
        // if(result.success){
        //   console.log(result);
        //   alert(result.message);
        // }else{
        //   alert(result.message);
        // }
      })
    }
  }


