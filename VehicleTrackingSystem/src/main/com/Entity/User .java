package com.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

	public User () {
		super();
		// TODO Auto-generated constructor stub
	}

	public User (Long id, String username, String password) {
		super();
		this.id = id;
		this.username= username;
		this.password= password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicle_name() {
		return vehicle_name;
	}

	public void setVehicle_name(String vehicle_name) {
		this.vehicle_name = vehicle_name;
	}

	public String getVehicle_model() {
		return vehicle_model;
	}

	public void setVehicle_model(String vehicle_model) {
		this.vehicle_model = vehicle_model;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public VehicleTrack getTracking() {
		return tracking;
	}

	public void setTracking(VehicleTrack tracking) {
		this.tracking = tracking;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", vehicleId=" + vehicleId + ", vehicle_name=" + vehicle_name + ", vehicle_model="
				+ vehicle_model + ", location=" + location + ", tracking=" + tracking + "]";
	}
}
