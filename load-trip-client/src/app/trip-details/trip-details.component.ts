import { Component, OnInit } from '@angular/core';
import { Trip } from '../trip';
import { Observable } from 'rxjs';
import { TripService } from '../trip.service';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-trip-details',
  templateUrl: './trip-details.component.html',
  styleUrls: ['./trip-details.component.css']
})
export class TripDetailsComponent implements OnInit {

  id: number;
  trip: Trip;
  trips: Observable<Trip[]>;

  submitted = false;
  bsConfig;

  constructor(private route: ActivatedRoute,private tripService: TripService,
    private router: Router) {}

  ngOnInit() {
    this.submitted = false;
    this.trip = new Trip();
    this.bsConfig = {
      containerClass: 'theme-blue',
      dateInputFormat: 'DD-MMM-YYYY'
    };
  }

  save() {
    this.tripService.createTrip(this.trip)
      .subscribe(data => console.log(data), error => console.log(error));
    this.trip = new Trip();
    this.gotoList();
  }

  onSubmit() {
    this.submitted = true;
    this.save();    
  }

  gotoList() {
    this.router.navigate(['/tripList']);
  }

  reloadData() {
    this.trips = this.tripService.getTripsList();
  }

  deleteTrip(id: number) {
    this.tripService.deleteTrip(id)
      .subscribe(
        data => {
          console.log(data);
          this.reloadData();
        },
        error => console.log(error));
  }
}
