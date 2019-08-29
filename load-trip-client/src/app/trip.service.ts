import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TripService {

  private baseUrl = 'http://localhost:8080/load-trip/api/trips';

  constructor(private http: HttpClient) { }

  getTrip(id: number): Observable<any> {
    return this.http.get(`${this.baseUrl}/${id}`);
  }

  createTrip(Trip: Object): Observable<Object> {
    return this.http.post(`${this.baseUrl}`, Trip);
  }

  updateTrip(id: number, value: any): Observable<Object> {
    return this.http.put(`${this.baseUrl}/${id}`, value);
  }

  deleteTrip(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}/${id}`, { responseType: 'text' });
  }

  getTripsList(): Observable<any> {
    return this.http.get(`${this.baseUrl}`);
  }
}
