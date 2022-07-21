import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-balance',
  templateUrl: './balance.component.html',
  styleUrls: ['./balance.component.css']
})
export class BalanceComponent implements OnInit {

  constructor(private http: HttpClient) { }

  ngOnInit(){
    let resp=this.http.get("http://localhost:8080/getAll");
    resp.subscribe((data)=>console.log(data));

  }

}
