import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { BalanceService } from 'src/app/balance.service';
import { BalanceUpdate } from 'src/app/models/BalanceUpdate';

@Component({
  selector: 'app-add-credit-update',
  templateUrl: './add-credit-update.component.html',
  styleUrls: ['./add-credit-update.component.css']
})
export class AddCreditUpdateComponent implements OnInit {

  route: any;

  // @Input()
  // medicine_name!: String;

  // medicine_expiry_date!: Date;
  savePharmacy: any;
  balUpdate:BalanceUpdate = new BalanceUpdate();
  updateCreditBalance: any;
  constructor(private service:BalanceService, private router: Router) { }


  ngOnInit() {
    this.updateCreditBalance = new FormGroup({
      "accNo": new FormControl(null, [Validators.required, Validators.pattern('^[0-9][0-9.]*(?<! )$')]),
      "amount": new FormControl(null, [Validators.required, Validators.pattern('^[0-9][0-9.]*(?<! )$')]),
      "typeOfTransaction": new FormControl(null, [Validators.required, Validators.pattern('^[A-Za-z][ a-zA-Z]*(?<! )$')]),

    });
  }
  get f() { return this.updateCreditBalance.controls; }

  // get medicine_name() { return this.savePharmacy.get('medicine_name'); }
  // get price() { return this.savePharmacy.get('price'); }
  // get quantity() { return this.savePharmacy.get('quantity'); }
  // get description() { return this.savePharmacy.get('description'); }
  // get medicine_expiry_date() { return this.savePharmacy.get('medicine_expiry_date'); }
  // get pet_id()  { return this.savePharmacy.get('pet_id'); }
 submitted = false;

  updateCredBalance() {

//     if (this.updateCreditBalance.invalid) {
//       return;
//  }    // if (this.savePharmacy.valid) {
    //   let pharmacy: Pharmacy = {

    //     medicine_name: this.medicine_name,
    //     price: this.price,
    //     quantity: this.quantity,
    //     description: this.description,
    //     medicine_expiry_date: this.medicine_expiry_date,
    //     pet_id: this.pet_id,
    //     medicine_id: 0

    //   };
    // localStorage.setItem('accNo',this.f.accNo.value);
    // localStorage.setItem('amount',this.f.amount.value);
    // localStorage.setItem('typeOfTransaction',this.f.typeOfTransaction.value);


      this.service.updateCreditBal(this.f.accNo.value,this.f.amount.value,this.f.typeOfTransaction.value)
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
