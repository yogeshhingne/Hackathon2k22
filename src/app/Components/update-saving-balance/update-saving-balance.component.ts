import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { BalanceService } from 'src/app/balance.service';
import { BalanceUpdate } from 'src/app/models/BalanceUpdate';

@Component({
  selector: 'app-update-saving-balance',
  templateUrl: './update-saving-balance.component.html',
  styleUrls: ['./update-saving-balance.component.css']
})
export class UpdateSavingBalanceComponent implements OnInit {

  balUpdate:BalanceUpdate = new BalanceUpdate();
  updateSavingBalance: any;
  constructor(private service:BalanceService, private router: Router) { }

  ngOnInit(): void {
    this.updateSavingBalance = new FormGroup({
      "accNo": new FormControl(null, [Validators.required, Validators.pattern('^[0-9][0-9.]*(?<! )$')]),
      "amount": new FormControl(null, [Validators.required, Validators.pattern('^[0-9][0-9.]*(?<! )$')]),
      "typeOfTransaction": new FormControl(null, [Validators.required, Validators.pattern('^[A-Za-z][ a-zA-Z]*(?<! )$')]),

    });
  }



  get f() { return this.updateSavingBalance.controls; }

 
 submitted = false;

  updateSavBalance() {




      this.service.updateSavingBal(this.f.accNo.value,this.f.amount.value,this.f.typeOfTransaction.value)
        .subscribe(data=>alert(data)
        );

        this.router.navigateByUrl('viewBalance');
  //       this.reloadComponent()
  //     this.router.navigate(['pharmacy']);
  //   }
  //   else
  //     return this.savePharmacy;
  // }

  // reloadComponent() {
  //   let currentUrl = this.router.url;
  //   this.router.routeReuseStrategy.shouldReuseRoute = () => false;
  //   this.router.onSameUrlNavigation = 'reload';
  //   this.router.navigate([currentUrl]);
  // }
        }
}
