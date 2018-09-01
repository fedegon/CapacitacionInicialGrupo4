import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { RestaurantService } from '../restaurant.service';
import { AlertsService } from 'angular-alert-module';
@Component({
  selector: 'app-restaurant',
  templateUrl: './restaurant.component.html',
  styleUrls: ['./restaurant.component.scss']
})
export class RestaurantComponent implements OnInit {
  pageGet$: Object;
  restaurants$: Object;
  restaurantsGetParam$: Object;
  resultado: Object;
  constructor(private dataService: RestaurantService,
    private route: ActivatedRoute, private alerts: AlertsService) {
    this.route.params.subscribe(params => this.pageGet$ = params.id);
  }

  ngOnInit() {
    this.alerts.setMessage('Estas Seguro?', 'success');
    this.dataService.getRestaurantList().subscribe(
      data => this.restaurants$ = data
    );
  }

  deleteResto(id) {
    this.alerts.showAlert(true, 'prueba');
    this.resultado = this.dataService.getDataPostDelete(id).subscribe();
    console.log(this.resultado);
  }

}
