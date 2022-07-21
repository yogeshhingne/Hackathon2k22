import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-switch',
  templateUrl: './switch.component.html',
  styleUrls: ['./switch.component.css']
})
export class SwitchComponent implements OnInit {
  students : any;

  constructor() {
     this.students=[
      {
      "id":1,
      "name":"Yogesh",
      "status":1

      },
      {
        "id":2,
        "name":"Om",
        "status":0
  
        },
        {
          "id":3,
          "name":"Ram",
          "status":-1
    
          }

    ]
    
   }

  ngOnInit(): void {
  }

}
