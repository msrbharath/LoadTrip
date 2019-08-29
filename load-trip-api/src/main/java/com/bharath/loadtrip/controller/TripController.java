package com.bharath.loadtrip.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bharath.loadtrip.exception.ResourceNotFoundException;
import com.bharath.loadtrip.model.Trip;
import com.bharath.loadtrip.repository.TripRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class TripController {
	@Autowired
	private TripRepository tripRepository;

	@GetMapping("/trips")
	public List<Trip> getAllTrips() {
		return tripRepository.findAll();
	}

	@GetMapping("/trips/{id}")
	public ResponseEntity<Trip> getTripById(@PathVariable(value = "id") Long tripId)
			throws ResourceNotFoundException {
		Trip trip = tripRepository.findById(tripId)
				.orElseThrow(() -> new ResourceNotFoundException("Trip not found for this id :: " + tripId));
		return ResponseEntity.ok().body(trip);
	}

	@PostMapping("/trips")
	public Trip createTrip(@Valid @RequestBody Trip trip) {
		return tripRepository.save(trip);
	}

	@PutMapping("/trips/{id}")
	public ResponseEntity<Trip> updateTrip(@PathVariable(value = "id") Long tripId,
			@Valid @RequestBody Trip tripDetails) throws ResourceNotFoundException {
		Trip trip = tripRepository.findById(tripId)
				.orElseThrow(() -> new ResourceNotFoundException("Trip not found for this id :: " + tripId));

		/*
		 * employee.setEmailId(tripDetails.getEmailId());
		 * employee.setLastName(tripDetails.getLastName());
		 * employee.setFirstName(tripDetails.getFirstName());
		 */
		final Trip updatedTrip = tripRepository.save(trip);
		return ResponseEntity.ok(updatedTrip);
	}

	@DeleteMapping("/trips/{id}")
	public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long tripId)
			throws ResourceNotFoundException {
		Trip trip = tripRepository.findById(tripId)
				.orElseThrow(() -> new ResourceNotFoundException("Trip not found for this id :: " + tripId));

		tripRepository.delete(trip);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}
