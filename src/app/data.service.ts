import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class DataService {

  constructor(private http:HttpClient) { }

  private backendUrl = 'http://localhost:8080/api/users';

  sendData(formData: any) {
    return this.http.post(this.backendUrl, formData);
  }
}
