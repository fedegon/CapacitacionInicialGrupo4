import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { RestaurantService } from '../restaurant.service';

@Component({
  selector: 'app-restaurant-edit',
  templateUrl: './restaurant-edit.component.html',
  styleUrls: ['./restaurant-edit.component.scss']
})
export class RestaurantEditComponent implements OnInit {
  pageGet$: Object;
  restaurants$: Object;
  restaurantsGetParam$: Object;
  resp$: Object;

  public name: String;
  public address: String;
  public email: String;
  public phone: String;
  public id: String;
  constructor(private dataService: RestaurantService,
    private route: ActivatedRoute) {
    this.route.params.subscribe(params => this.pageGet$ = params.id);
  }

  ngOnInit() {
    this.dataService.getRestaurantConParam(this.pageGet$).subscribe(
      resto => this.restaurantsGetParam$ = resto,
      error => this.restaurantsGetParam$ = { name: "Error =(" }
    );
  }

  sendData() {
    this.dataService.getDataPostEdit(this.pageGet$.toString(), this.name, this.phone, this.email, this.address).subscribe(
      id => this.resp$ = id,
      error => this.resp$ = { name: "Error" }
    );
  }

}
