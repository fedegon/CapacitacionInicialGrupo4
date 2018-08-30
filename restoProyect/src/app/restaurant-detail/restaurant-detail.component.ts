import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { RestaurantService } from '../restaurant.service';

@Component({
  selector: 'app-restaurant-detail',
  templateUrl: './restaurant-detail.component.html',
  styleUrls: ['./restaurant-detail.component.scss']
})
export class RestaurantDetailComponent implements OnInit {

  pageGet$: Object;
  restaurants$: Object;
  restaurantsGetParam$: Object;

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

}
