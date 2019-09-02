package com.bharath.loadtrip.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "trip")
public class Trip {

	public Trip(long id, Date tripStartDate, String lorryBookingReferenceNo, String vehicleType, String vehicleNumber,
			String fromPlace, String toPlace, String dealerName, String invoiceBranch, long noOfPackage, long occupancyPercent,
			long haltDays) {
		super();
		this.id = id;
		this.tripStartDate = tripStartDate;
		this.lorryBookingReferenceNo = lorryBookingReferenceNo;
		this.vehicleType = vehicleType;
		this.vehicleNumber = vehicleNumber;
		this.fromPlace = fromPlace;
		this.toPlace = toPlace;
		this.dealerName = dealerName;
		this.invoiceBranch = invoiceBranch;
		this.noOfPackage = noOfPackage;
		this.occupancyPercent = occupancyPercent;
		this.haltDays = haltDays;
	}
	public Trip() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, updatable = false, nullable = false)
	private long id;
	
	@Column(name = "trip_start_date", nullable = false)
	private Date tripStartDate;
	
	@Column(name = "lorry_booking_ref", nullable = false)
	private String lorryBookingReferenceNo;
	
	@Column(name = "vehicle_type")
	private String vehicleType;
	
	@Column(name = "vehicle_number")
	private String vehicleNumber;
	
	@Column(name = "from_destination", nullable = false)
	private String fromPlace;
	
	@Column(name = "to_destination", nullable = false)
	private String toPlace;
	
	@Column(name = "dealer_name", nullable = false)
	private String dealerName;
	
	@Column(name = "invoice_branch", nullable = false)
	private String invoiceBranch;
	
	@Column(name = "no_of_package")
	private long noOfPackage;
	
	@Column(name = "occupancy_percent")
	private long occupancyPercent;
	
	@Column(name = "halt_days")
	private long haltDays;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the tripStartDate
	 */
	public Date getTripStartDate() {
		return tripStartDate;
	}
	/**
	 * @param tripStartDate the tripStartDate toPlace set
	 */
	public void setTripStartDate(Date tripStartDate) {
		this.tripStartDate = tripStartDate;
	}
	/**
	 * @return the lorryBookingReferenceNo
	 */
	public String getLorryBookingReferenceNo() {
		return lorryBookingReferenceNo;
	}
	/**
	 * @param lorryBookingReferenceNo the lorryBookingReferenceNo toPlace set
	 */
	public void setLorryBookingReferenceNo(String lorryBookingReferenceNo) {
		this.lorryBookingReferenceNo = lorryBookingReferenceNo;
	}
	/**
	 * @return the vehicleType
	 */
	public String getVehicleType() {
		return vehicleType;
	}
	/**
	 * @param vehicleType the vehicleType toPlace set
	 */
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	/**
	 * @return the vehicleNumber
	 */
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	/**
	 * @param vechicleNumber the vechicleNumber toPlace set
	 */
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	/**
	 * @return the fromPlace
	 */
	public String getFromPlace() {
		return fromPlace;
	}
	/**
	 * @param fromPlace the fromPlace to set
	 */
	public void setFromPlace(String fromPlace) {
		this.fromPlace = fromPlace;
	}
	/**
	 * @return the toPlace
	 */
	public String getToPlace() {
		return toPlace;
	}
	/**
	 * @param toPlace the toPlace to set
	 */
	public void setToPlace(String toPlace) {
		this.toPlace = toPlace;
	}
	/**
	 * @return the dealerName
	 */
	public String getDealerName() {
		return dealerName;
	}
	/**
	 * @param dealerName the dealerName toPlace set
	 */
	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}
	/**
	 * @return the invoiceBranch
	 */
	public String getInvoiceBranch() {
		return invoiceBranch;
	}
	/**
	 * @param invoiceBranch the invoiceBranch toPlace set
	 */
	public void setInvoiceBranch(String invoiceBranch) {
		this.invoiceBranch = invoiceBranch;
	}
	/**
	 * @return the noOfPackage
	 */
	public long getNoOfPackage() {
		return noOfPackage;
	}
	/**
	 * @param noOfPackage the noOfPackage toPlace set
	 */
	public void setNoOfPackage(long noOfPackage) {
		this.noOfPackage = noOfPackage;
	}
	/**
	 * @return the occupancyPercent
	 */
	public long getOccupancyPercent() {
		return occupancyPercent;
	}
	/**
	 * @param occupancyPercent the occupancyPercent toPlace set
	 */
	public void setOccupancyPercent(long occupancyPercent) {
		this.occupancyPercent = occupancyPercent;
	}
	/**
	 * @return the haltDays
	 */
	public long getHaltDays() {
		return haltDays;
	}
	/**
	 * @param haltDays the haltDays toPlace set
	 */
	public void setHaltDays(long haltDays) {
		this.haltDays = haltDays;
	}
}
