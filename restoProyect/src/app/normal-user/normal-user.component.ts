import { Component, OnInit } from '@angular/core';
import { NormalUserService } from '../normal-user.service';
import { ActivatedRoute } from '@angular/router';
import { log } from 'util';
@Component({
  selector: 'app-normal-user',
  templateUrl: './normal-user.component.html',
  styleUrls: ['./normal-user.component.scss']
})
export class NormalUserComponent implements OnInit {
  pageGet$: Object;
  restaurants$: Object;
  restaurantsGetParam$: Object;
  constructor(private dataService: NormalUserService,
    private route: ActivatedRoute) {
    this.route.params.subscribe(params => this.pageGet$ = params.id);
  }

  ngOnInit() {
    this.dataService.getData().subscribe(data => this.restaurants$ = data);
    /*this.dataService.getDataConParam(this.pageGet$).subscribe(
      resto => this.restaurantsGetParam$ = resto,
      error => this.restaurantsGetParam$ = { name: " Error = (" }

    );*/
  }

}
