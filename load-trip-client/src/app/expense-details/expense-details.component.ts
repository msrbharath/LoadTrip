import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Trip } from '../trip';
import { TripService } from '../trip.service';

@Component({
  selector: 'app-expense-details',
  templateUrl: './expense-details.component.html',
  styleUrls: ['./expense-details.component.css']
})
export class ExpenseDetailsComponent implements OnInit {

  id: number;
  trip: Trip;
  trips: Observable<Trip[]>;
  bsConfig;

  constructor(private route: ActivatedRoute,private tripService: TripService,
    private router: Router) {}

  ngOnInit() {
    this.trips = this.tripService.getTripsList();
    this.trip = new Trip();
    this.bsConfig = {
      containerClass: 'theme-blue',
      dateInputFormat: 'DD-MMM-YYYY'
    };
  }

  selectTrip(tripID: any){
    this.trip = this.trips[tripID];
  }

}
