import { Component, OnInit } from '@angular/core';
import { User } from './User';
@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {
  user : User={
    "id":890,
    "name":"Yogesh",
    "email":"yog@gmail.com",
    "mobile":8898788139
  }

  constructor() { }

  ngOnInit(): void {
  }

}
