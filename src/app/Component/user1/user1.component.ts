import { Component, OnInit } from '@angular/core';
import { UserService } from 'src/app/user.service';

@Component({
  selector: 'app-user1',
  templateUrl: './user1.component.html',
  styleUrls: ['./user1.component.css']
})
export class User1Component implements OnInit {
users: any
  constructor(private service: UserService) { }

  ngOnInit() {
    this.users=this.service.getUser().subscribe(data=>this.users=data);

  }

}
