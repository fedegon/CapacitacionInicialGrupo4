import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class RestaurantService {

  constructor(private http: HttpClient) { }

  getRestaurantList() {
    return this.http.get('http://localhost:8080/resto/getString');
  }
  getRestaurantConParam(restoID) {
    return this.http.get('http://localhost:8080/resto/restaurant/' + restoID);
  }

  getDataPost(name: String, phone: String, email: String, address: String) {
    const httpOptions = {
      headers: new HttpHeaders({
        'Content-Type': 'application/json'
      })
    };
    console.log('entre');
    return this.http.post('http://localhost:8080/resto/createResto',
      { "id": 0, "name": name, "phone": phone, "email": email, "address": address }, httpOptions);
  }
  getDataPostEdit(id: String, name: String, phone: String, email: String, address: String) {
    const httpOptions = {
      headers: new HttpHeaders({
        'Content-Type': 'application/json'
      })
    };
    console.log('entre');
    return this.http.post('http://localhost:8080/resto/updateResto',
      { "id": id, "name": name, "phone": phone, "email": email, "address": address }, httpOptions);
  }
  getDataPostDelete(id: String) {
    const httpOptions = {
      headers: new HttpHeaders({
        'Content-Type': 'application/json'
      })
    };
    console.log('entre');
    return this.http.post('http://localhost:8080/resto/deleteResto',
      { "id": id, "name": "", "phone": "", "email": "", "address": "" }, httpOptions);
  }

}
