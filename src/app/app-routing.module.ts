import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './Component/login/login.component';
import { VeiwBalanceComponent } from './Components/veiw-balance/veiw-balance.component';

const routes: Routes = [

  {path:'', redirectTo: 'login',pathMatch: 'full'},
  {path:'login', component : LoginComponent},
  {path: 'viewBalance', component: VeiwBalanceComponent}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {


 }
