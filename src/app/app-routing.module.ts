import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './Component/login/login.component';
import { RegistrationFormComponent } from './Components/registration-form/registration-form.component';
import { SignInComponent } from './Component/sign-in/sign-in.component';
import { VeiwBalanceComponent } from './Components/veiw-balance/veiw-balance.component';

const routes: Routes = [

  {path:'', redirectTo: 'signIn',pathMatch: 'full'},
  {path:'login', component : LoginComponent},
  {path: 'viewBalance', component: VeiwBalanceComponent},
  {path: 'register', component: RegistrationFormComponent},
  {path: 'signIn', component: SignInComponent}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {


 }
