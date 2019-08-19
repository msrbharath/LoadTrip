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
import com.bharath.loadtrip.model.Employee;
import com.bharath.loadtrip.model.Trip;
import com.bharath.loadtrip.repository.EmployeeRepository;
import com.bharath.loadtrip.repository.TripRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/")
public class TripController {
	@Autowired
	private TripRepository tripRepository;

	@GetMapping("/employees")
	public List<Trip> getAllEmployees() {
		return tripRepository.findAll();
	}

	@GetMapping("/employees/{id}")
	public ResponseEntity<Trip> getEmployeeById(@PathVariable(value = "id") Long employeeId)
			throws ResourceNotFoundException {
		Trip employee = tripRepository.findById(employeeId)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));
		return ResponseEntity.ok().body(employee);
	}

	@PostMapping("/employees")
	public Trip createEmployee(@Valid @RequestBody Trip trip) {
		return tripRepository.save(trip);
	}

	@PutMapping("/employees/{id}")
	public ResponseEntity<Trip> updateEmployee(@PathVariable(value = "id") Long employeeId,
			@Valid @RequestBody Trip tripDetails) throws ResourceNotFoundException {
		Trip employee = tripRepository.findById(employeeId)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));

		/*
		 * employee.setEmailId(tripDetails.getEmailId());
		 * employee.setLastName(tripDetails.getLastName());
		 * employee.setFirstName(tripDetails.getFirstName());
		 */
		final Trip updatedEmployee = tripRepository.save(employee);
		return ResponseEntity.ok(updatedEmployee);
	}

	@DeleteMapping("/employees/{id}")
	public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long employeeId)
			throws ResourceNotFoundException {
		Trip employee = tripRepository.findById(employeeId)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));

		tripRepository.delete(employee);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}
