import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class NormalUserService {

  constructor(private http: HttpClient) { }
  getData() {
    return this.http.get('http://localhost:8080/resto/getJSON');
  }
  getDataConParam(userID) {
    return this.http.get('http://localhost:8080/resto/getJSON' + userID);
  }
}
