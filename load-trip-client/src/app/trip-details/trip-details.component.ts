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

  constructor(private route: ActivatedRoute,private tripService: TripService,
    private router: Router) {}

  ngOnInit() {
    this.reloadData();
    this.trip = new Trip();

    this.id = this.route.snapshot.params['id'];
    
    this.tripService.getTrip(this.id)
      .subscribe(data => {
        console.log(data)
        this.trip = data;
      }, error => console.log(error));
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

  tripDetails(id: number){
    this.router.navigate(['details', id]);
  }
}
