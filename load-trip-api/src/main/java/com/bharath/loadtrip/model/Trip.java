package com.bharath.loadtrip.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "load_trip")
public class Trip {

	public Trip(long id, Date tripStartDate, String lorryBookingReferenceNo, String vehicleType, String vehicleNumber,
			String from, String to, String dealerName, String invoiceBranch, long noOfPackage, long occupancyPercent,
			long haltDays, long rateBasedOnAgreement, long loadingCharge, long unloadingCharge, String invoiceRefNo,
			Date endBranchDate, String gasIndent, long gasCash, long startODO, long endODO, long driverAllowance,
			long parking, long metroCharges, long trafficPolice, long otherTripExpense, long totalRevenue,
			long totalExpense, long profitLoss) {
		super();
		this.id = id;
		this.tripStartDate = tripStartDate;
		this.lorryBookingReferenceNo = lorryBookingReferenceNo;
		this.vehicleType = vehicleType;
		this.vehicleNumber = vehicleNumber;
		this.from = from;
		this.to = to;
		this.dealerName = dealerName;
		this.invoiceBranch = invoiceBranch;
		this.noOfPackage = noOfPackage;
		this.occupancyPercent = occupancyPercent;
		this.haltDays = haltDays;
		this.rateBasedOnAgreement = rateBasedOnAgreement;
		this.loadingCharge = loadingCharge;
		this.unloadingCharge = unloadingCharge;
		this.invoiceRefNo = invoiceRefNo;
		this.endBranchDate = endBranchDate;
		this.gasIndent = gasIndent;
		this.gasCash = gasCash;
		this.startODO = startODO;
		this.endODO = endODO;
		this.driverAllowance = driverAllowance;
		this.parking = parking;
		this.metroCharges = metroCharges;
		this.trafficPolice = trafficPolice;
		this.otherTripExpense = otherTripExpense;
		this.totalRevenue = totalRevenue;
		this.totalExpense = totalExpense;
		this.profitLoss = profitLoss;
	}
	public Trip() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, updatable = false, nullable = false)
	private long id;
	
	@Column(name = "trip_start_date")
	private Date tripStartDate;
	
	@Column(name = "lorry_booking_ref", nullable = false)
	private String lorryBookingReferenceNo;
	
	@Column(name = "vehicle_type", nullable = false)
	private String vehicleType;
	
	@Column(name = "vehicle_number", nullable = false)
	private String vehicleNumber;
	
	@Column(name = "from_destination", nullable = false)
	private String from;
	
	@Column(name = "to_destination", nullable = false)
	private String to;
	
	@Column(name = "dealer_name", nullable = false)
	private String dealerName;
	
	@Column(name = "invoice_branch", nullable = false)
	private String invoiceBranch;
	
	@Column(name = "no_of_package", nullable = false)
	private long noOfPackage;
	
	@Column(name = "occupancy_percent", nullable = false)
	private long occupancyPercent;
	
	@Column(name = "halt_days", nullable = false)
	private long haltDays;
	
	@Column(name = "rate_based_on_agreement", nullable = false)
	private long rateBasedOnAgreement;
	
	@Column(name = "loading_charge", nullable = false)
	private long loadingCharge;
	
	@Column(name = "unloading_charge", nullable = false)
	private long unloadingCharge;
	
	@Column(name = "invoice_ref_no", nullable = false)
	private String invoiceRefNo;
	
	@Column(name = "end_branch_date", nullable = false)
	private Date endBranchDate;
	
	@Column(name = "gas_indent", nullable = false)
	private String gasIndent;
	
	@Column(name = "gas_cash", nullable = false)
	private long gasCash;
	
	@Column(name = "start_odo", nullable = false)
	private long startODO;
	
	@Column(name = "end_odo", nullable = false)
	private long endODO;
	
	@Column(name = "driver_allowance", nullable = false)
	private long driverAllowance;
	
	@Column(name = "parking", nullable = false)
	private long parking;
	
	@Column(name = "metro_charges", nullable = false)
	private long metroCharges;
	
	@Column(name = "traffic_police", nullable = false)
	private long trafficPolice;
	
	@Column(name = "other_trip_expense", nullable = false)
	private long otherTripExpense;
	
	@Column(name = "total_revenue", nullable = false)	
	private long totalRevenue;
	
	@Column(name = "total_expense", nullable = false)
	private long totalExpense;
	
	@Column(name = "profit_loss", nullable = false)
	private long profitLoss;

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
	 * @param tripStartDate the tripStartDate to set
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
	 * @param lorryBookingReferenceNo the lorryBookingReferenceNo to set
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
	 * @param vehicleType the vehicleType to set
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
	 * @param vechicleNumber the vechicleNumber to set
	 */
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	/**
	 * @return the from
	 */
	public String getFrom() {
		return from;
	}
	/**
	 * @param from the from to set
	 */
	public void setFrom(String from) {
		this.from = from;
	}
	/**
	 * @return the to
	 */
	public String getTo() {
		return to;
	}
	/**
	 * @param to the to to set
	 */
	public void setTo(String to) {
		this.to = to;
	}
	/**
	 * @return the dealerName
	 */
	public String getDealerName() {
		return dealerName;
	}
	/**
	 * @param dealerName the dealerName to set
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
	 * @param invoiceBranch the invoiceBranch to set
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
	 * @param noOfPackage the noOfPackage to set
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
	 * @param occupancyPercent the occupancyPercent to set
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
	 * @param haltDays the haltDays to set
	 */
	public void setHaltDays(long haltDays) {
		this.haltDays = haltDays;
	}
	/**
	 * @return the rateBasedOnAgreement
	 */
	public long getRateBasedOnAgreement() {
		return rateBasedOnAgreement;
	}
	/**
	 * @param rateBasedOnAgreement the rateBasedOnAgreement to set
	 */
	public void setRateBasedOnAgreement(long rateBasedOnAgreement) {
		this.rateBasedOnAgreement = rateBasedOnAgreement;
	}
	/**
	 * @return the loadingCharge
	 */
	public long getLoadingCharge() {
		return loadingCharge;
	}
	/**
	 * @param loadingCharge the loadingCharge to set
	 */
	public void setLoadingCharge(long loadingCharge) {
		this.loadingCharge = loadingCharge;
	}
	/**
	 * @return the unloadingCharge
	 */
	public long getUnloadingCharge() {
		return unloadingCharge;
	}
	/**
	 * @param unloadingCharge the unloadingCharge to set
	 */
	public void setUnloadingCharge(long unloadingCharge) {
		this.unloadingCharge = unloadingCharge;
	}
	/**
	 * @return the invoiceRefNo
	 */
	public String getInvoiceRefNo() {
		return invoiceRefNo;
	}
	/**
	 * @param invoiceRefNo the invoiceRefNo to set
	 */
	public void setInvoiceRefNo(String invoiceRefNo) {
		this.invoiceRefNo = invoiceRefNo;
	}
	/**
	 * @return the endBranchDate
	 */
	public Date getEndBranchDate() {
		return endBranchDate;
	}
	/**
	 * @param endBranchDate the endBranchDate to set
	 */
	public void setEndBranchDate(Date endBranchDate) {
		this.endBranchDate = endBranchDate;
	}
	/**
	 * @return the gasIndent
	 */
	public String getGasIndent() {
		return gasIndent;
	}
	/**
	 * @param gasIndent the gasIndent to set
	 */
	public void setGasIndent(String gasIndent) {
		this.gasIndent = gasIndent;
	}
	/**
	 * @return the gasCash
	 */
	public long getGasCash() {
		return gasCash;
	}
	/**
	 * @param gasCash the gasCash to set
	 */
	public void setGasCash(long gasCash) {
		this.gasCash = gasCash;
	}
	/**
	 * @return the startODO
	 */
	public long getStartODO() {
		return startODO;
	}
	/**
	 * @param startODO the startODO to set
	 */
	public void setStartODO(long startODO) {
		this.startODO = startODO;
	}
	/**
	 * @return the endODO
	 */
	public long getEndODO() {
		return endODO;
	}
	/**
	 * @param endODO the endODO to set
	 */
	public void setEndODO(long endODO) {
		this.endODO = endODO;
	}
	/**
	 * @return the driverAllowance
	 */
	public long getDriverAllowance() {
		return driverAllowance;
	}
	/**
	 * @param driverAllowance the driverAllowance to set
	 */
	public void setDriverAllowance(long driverAllowance) {
		this.driverAllowance = driverAllowance;
	}
	/**
	 * @return the parking
	 */
	public long getParking() {
		return parking;
	}
	/**
	 * @param parking the parking to set
	 */
	public void setParking(long parking) {
		this.parking = parking;
	}
	/**
	 * @return the metroCharges
	 */
	public long getMetroCharges() {
		return metroCharges;
	}
	/**
	 * @param metroCharges the metroCharges to set
	 */
	public void setMetroCharges(long metroCharges) {
		this.metroCharges = metroCharges;
	}
	/**
	 * @return the trafficPolice
	 */
	public long getTrafficPolice() {
		return trafficPolice;
	}
	/**
	 * @param trafficPolice the trafficPolice to set
	 */
	public void setTrafficPolice(long trafficPolice) {
		this.trafficPolice = trafficPolice;
	}
	/**
	 * @return the otherTripExpense
	 */
	public long getOtherTripExpense() {
		return otherTripExpense;
	}
	/**
	 * @param otherTripExpense the otherTripExpense to set
	 */
	public void setOtherTripExpense(long otherTripExpense) {
		this.otherTripExpense = otherTripExpense;
	}
	/**
	 * @return the totalRenvenue
	 */
	public long getTotalRenvenue() {
		return totalRevenue;
	}
	/**
	 * @param totalRenvenue the totalRevenue to set
	 */
	public void setTotalRenvenue(long totalRevenue) {
		this.totalRevenue = totalRevenue;
	}
	/**
	 * @return the totalExpense
	 */
	public long getTotalExpense() {
		return totalExpense;
	}
	/**
	 * @param totalExpense the totalExpense to set
	 */
	public void setTotalExpense(long totalExpense) {
		this.totalExpense = totalExpense;
	}
	/**
	 * @return the profitLoss
	 */
	
	public long getProfitLoss() {
		return profitLoss;
	}
	/**
	 * @param profitLoss the profitLoss to set
	 */
	public void setProfitLoss(long profitLoss) {
		this.profitLoss = profitLoss;
	}
}
