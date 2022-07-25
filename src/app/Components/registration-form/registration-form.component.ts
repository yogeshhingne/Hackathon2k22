import { Component, Input, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Registration } from 'src/app/models/registration';
import { UserService } from 'src/app/user.service';

@Component({
  selector: 'app-registration-form',
  templateUrl: './registration-form.component.html',
  styleUrls: ['./registration-form.component.css']
})
export class RegistrationFormComponent implements OnInit {

@Input()
Id!:number;
UserName!:string;
Password!:string;
ConfirmPassword!:string;
MobileNo !:number;
PanNo !:string;
DateOfBirth !:string;
  insertUser: any;
  Registration: Registration = new Registration();


  constructor( private  userService : UserService ,private  router: Router) { }

  ngOnInit(): void {
    this.insertUser = new FormGroup({
      "userName": new FormControl(null, [Validators.required ,Validators.pattern('^[A-Za-z][ a-zA-Z0-9]*(?<! )$')]),
     "password": new FormControl(null, [Validators.required, Validators.pattern("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$")]),
      "confirmPassword": new FormControl(null, [Validators.required, Validators.pattern("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$")]),
      "mobileNo": new FormControl(null, [Validators.required,Validators.pattern('^[1-9]{1}$')]),
      "panNo": new FormControl(null, [Validators.required, Validators.pattern("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$")]),
      "dateOfBirth": new FormControl(null, [Validators.required, Validators.pattern('^[1-9]{1}$')])

    }); 
  }

  get f() { return this.insertUser.controls; }

  get userName() { return this.insertUser.get('userName'); }
  get password() { return this.insertUser.get('password'); }
  get confirmPassword() { return this.insertUser.get('confirmPassword'); }
  get mobileNo() { return this.insertUser.get('mobileNo'); }
  submitted = false;
  get panNo() { return this.insertUser.get('panNo'); }
  get dateOfBirth() { return this.insertUser.get('dateOfBirth'); }


  


  // saveuser()
  // {
  //   this.submitted = true;
  //   if (this.insertUser.valid) {
  //     let Registration: Registration = {
  //       userName: this.UserName,
  //       password: this.Password,
  //       confirmPassword: this.ConfirmPassword,
  //       mobileNo: this.MobileNo,
  //       panNo: this.PanNo,
  //       dateOfBirth:this.DateOfBirth,
  //       id: 0
  //     };
  //     this.userService.insertUser(this.Registration)
  //       .subscribe(
  //         ( success: any) => alert("Sussessfully Inserted"),
  //         ( error: any) => alert("unsuccess")
  //       );
  //     this.router.navigate(['login']);
  //   }
  //   else
  //   return this.insertUser;
  //   // console.log('Correct');
  //   // return false;

  // }


  saveuser() { 
   
    this.userService.insertUser(this.Registration)  
      .subscribe((data: any) => console.log(data),
       (error: any) => console.log(error));  
    this.Registration = new Registration();  

    this.router.navigate(['signIn']);
  }  

}
