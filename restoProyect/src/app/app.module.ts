import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule, FormBuilder, FormGroup } from '@angular/forms';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NormalUserComponent } from './normal-user/normal-user.component';
import { RestaurantComponent } from './restaurant/restaurant.component';
import { RestaurantDetailComponent } from './restaurant-detail/restaurant-detail.component';
import { RestaurantCreateComponent } from './restaurant-create/restaurant-create.component';
import { RestaurantEditComponent } from './restaurant-edit/restaurant-edit.component';

@NgModule({
  declarations: [
    AppComponent,
    NormalUserComponent,
    RestaurantComponent,
    RestaurantDetailComponent,
    RestaurantCreateComponent,
    RestaurantEditComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
