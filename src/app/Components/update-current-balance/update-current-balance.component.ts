import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { BalanceService } from 'src/app/balance.service';
import { BalanceUpdate } from 'src/app/models/BalanceUpdate';

@Component({
  selector: 'app-update-current-balance',
  templateUrl: './update-current-balance.component.html',
  styleUrls: ['./update-current-balance.component.css']
})
export class UpdateCurrentBalanceComponent implements OnInit {
  balUpdate:BalanceUpdate = new BalanceUpdate();
  updateCurrentBalance: any;

  constructor(private service:BalanceService, private router: Router) { }

  ngOnInit(): void {
    this.updateCurrentBalance = new FormGroup({
      "accNo": new FormControl(null, [Validators.required, Validators.pattern('^[0-9][0-9.]*(?<! )$')]),
      "amount": new FormControl(null, [Validators.required, Validators.pattern('^[0-9][0-9.]*(?<! )$')]),
      "typeOfTransaction": new FormControl(null, [Validators.required, Validators.pattern('^[A-Za-z][ a-zA-Z]*(?<! )$')]),

    });
  }
  get f() { return this.updateCurrentBalance.controls; }
  submitted = false;

  updateCurrBalance() {

   
          this.service.updateCurrentBal(this.f.accNo.value,this.f.amount.value,this.f.typeOfTransaction.value)
            .subscribe(data=>alert(data)
            );
    
            this.router.navigateByUrl('viewBalance');
     
            }

}
