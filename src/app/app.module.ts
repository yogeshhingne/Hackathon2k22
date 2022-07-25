import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { VeiwBalanceComponent } from './Components/veiw-balance/veiw-balance.component';
import { UserComponent } from './user/user.component';
import { ProductComponent } from './Component/product/product.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { ProductService } from './product.service';
import { HttpClientModule } from '@angular/common/http';
import { BalanceComponent } from './balance/balance.component';
import { BalanceService } from './balance.service';
import { SwitchComponent } from './Component/switch/switch.component';
import { PipesComponent } from './Component/pipes/pipes.component';
import { User1Component } from './Component/user1/user1.component';
import { LoginComponent } from './Component/login/login.component';
import { RegistrationFormComponent } from './Components/registration-form/registration-form.component';
import { SignInComponent } from './Component/sign-in/sign-in.component';

@NgModule({
  declarations: [
    AppComponent,
    VeiwBalanceComponent,
    UserComponent,
    ProductComponent,
    BalanceComponent,
    SwitchComponent,
    PipesComponent,
    User1Component,
    LoginComponent,
    RegistrationFormComponent,
    SignInComponent

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [ProductService,BalanceService],
  bootstrap: [AppComponent]
})
export class AppModule { 
}
