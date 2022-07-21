// import { Component, OnInit } from '@angular/core';
// import { FormBuilder, FormGroup, Validators } from '@angular/forms';

// @Component({
//   selector: 'app-add-user',
//   templateUrl: './add-user.component.html',
//   styleUrls: ['./add-user.component.css']
// })
// export class AddUserComponent implements OnInit {
//   loginForm!: FormGroup;

//   constructor( private formBuilder: FormBuilder) { }

//   ngOnInit(): void {
//     console.log(localStorage.getItem('username'));
//     localStorage.clear();
//     console.log(localStorage.getItem('username'));
//     this.loginForm = this.formBuilder.group({
//         username: ['', Validators.required],
//         password: ['', Validators.required]
//     });
//   }
//   get f() { return this.loginForm.controls; }

// }
