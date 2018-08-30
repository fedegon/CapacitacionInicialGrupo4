import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { RestaurantComponent } from './restaurant/restaurant.component';
import { RestaurantEditComponent } from './restaurant-edit/restaurant-edit.component';
import { RestaurantDetailComponent } from './restaurant-detail/restaurant-detail.component';
import { RestaurantCreateComponent } from './restaurant-create/restaurant-create.component';
import { NormalUserComponent } from './normal-user/normal-user.component';
import { AppComponent } from './app.component';

const routes: Routes = [
  {
    path: '',
    component: AppComponent
  },
  {
    path: 'restaurant',
    component: RestaurantComponent
  },
  {
    path: 'restaurant/:id',
    component: RestaurantDetailComponent
  },
  {
    path: 'restaurant/restaurant-edit/:id',
    component: RestaurantEditComponent
  },
  {
    path: 'restaurantCreate',
    component: RestaurantCreateComponent
  },
  {
    path: 'uno',
    component: NormalUserComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
