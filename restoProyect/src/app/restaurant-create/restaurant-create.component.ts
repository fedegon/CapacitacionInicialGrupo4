import { Component, OnInit } from '@angular/core';
import { RestaurantService } from '../restaurant.service';
import {  Router } from '@angular/router';

@Component({
  selector: 'app-restaurant-create',
  templateUrl: './restaurant-create.component.html',
  styleUrls: ['./restaurant-create.component.scss']
})
export class RestaurantCreateComponent implements OnInit {
  public name: String;
  public address: String;
  public email: String;
  public phone: String;

  public resp$: Object;
  constructor(private serviceResto: RestaurantService, private router: Router) { }

  ngOnInit() {
  }

  sendData() {
    this.serviceResto.getDataPost(this.name, this.phone, this.email, this.address).subscribe(
      id => this.resp$ = id,
      error => this.resp$ = { name: "Error" }
    );
    this.router.navigate(['/restaurant']);
  }

}
