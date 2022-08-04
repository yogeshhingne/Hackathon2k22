import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './Component/login/login.component';
import { RegistrationFormComponent } from './Components/registration-form/registration-form.component';
import { SignInComponent } from './Component/sign-in/sign-in.component';
import { VeiwBalanceComponent } from './Components/veiw-balance/veiw-balance.component';
import { AddCreditUpdateComponent } from './Components/add-credit-update/add-credit-update.component';
import { UpdateCurrentBalanceComponent } from './Components/update-current-balance/update-current-balance.component';
import { UpdatePrepaidBalanceComponent } from './Components/update-prepaid-balance/update-prepaid-balance.component';
import { UpdateSavingBalanceComponent } from './Components/update-saving-balance/update-saving-balance.component';

const routes: Routes = [

  {path:'', redirectTo: 'signIn',pathMatch: 'full'},
  {path:'enterCredential', component : LoginComponent},
  {path: 'viewBalance', component: VeiwBalanceComponent},
  {path: 'register', component: RegistrationFormComponent},
  {path: 'signIn', component: SignInComponent},
  {path: 'updateCredit', component: AddCreditUpdateComponent},
  {path: 'updateCurrent', component: UpdateCurrentBalanceComponent},
  {path: 'updatePrepaid', component: UpdatePrepaidBalanceComponent},
  {path: 'updateSaving', component: UpdateSavingBalanceComponent}



  
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {


 }
