import { Component, OnInit } from '@angular/core';
import { HttpEvent } from '@angular/common/http';
import {FormControl,FormBuilder,FormGroup,Validators} from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { AlertService } from 'src/app/alert.service';
import { BalanceService } from 'src/app/balance.service';
import { first } from 'rxjs/operators';

@Component({
  selector: 'app-sign-in',
  templateUrl: './sign-in.component.html',
  styleUrls: ['./sign-in.component.css']
})
export class SignInComponent implements OnInit {
  loginForm!: any;
  loading = false;
  submitted = false;
  returnUrl!: string;
  selected!:string; 
   response!:any;
   Doctor:any;
   Owner:any;
   type!:HTMLElement;
  constructor(
      private formBuilder: FormBuilder,
      private route: ActivatedRoute,
      private router: Router,
      private service: BalanceService,
      private alertService: AlertService
  ) {
      // redirect to home if already logged in
    //   if (this.service.currentUserValue) { 
    //       this.router.navigate(['/']);
    //   }
  }

  ngOnInit() {
    //   console.log(localStorage.getItem('username'));
    //   localStorage.clear();
    //   console.log(localStorage.getItem('username'));
      this.loginForm = this.formBuilder.group({
          username: ['', Validators.required],
          password: ['', Validators.required]
      });

      // get return url from route parameters or default to '/'
    //   this.returnUrl = this.route.snapshot.queryParams['returnUrl'] || 'view-pet';
  }

  // convenience getter for easy access to form fields
  get f() { return this.loginForm.controls; }
  
  // change(e)
  // {
  //    this.selected=e.target.value;

  // }
  onSubmit() {
      this.submitted = true;
      console.log("Hi submit button works");

      // stop here if form is invalid
    //   if (this.loginForm.invalid) {
    //       return;
    //   }

      this.loading = true;
       this.service.login1(this.f.username.value, this.f.password.value)
          .pipe(first())
          .subscribe(
              data => {
                this.response=data;
                console.log(this.response);
                if(this.response=='User login Successfully')
                {
                 // console.log(this.response); 
                  localStorage.setItem('username', this.f.username.value);
                  console.log(this.f.username.value)
                  this.router.navigateByUrl('/enterCredential')
                
                }else{
                  
                    alert("user not found");
                   
                    
                }
                 
              },
              error => {
                  // this.alertService.error(error);
                //   this.loading = false;
              });
  
            
  }

}
