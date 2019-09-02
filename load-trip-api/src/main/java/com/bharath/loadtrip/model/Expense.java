package com.bharath.loadtrip.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "expense")
public class Expense {

	public Expense(long id, Trip trip, long rateBasedOnAgreement, long loadingCharge, long unloadingCharge, String invoiceRefNo,
			Date endBranchDate, String gasIndent, long gasCash, long startODO, long endODO, long driverAllowance,
			long parking, long metroCharges, long trafficPolice, long otherTripExpense, long totalRevenue,
			long totalExpense, long profitLoss) {
		super();
		this.id = id;
		this.trip = trip;
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
	public Expense() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, updatable = false, nullable = false)
	private long id;
	
	// Association to Trip
	@OneToOne
	@JoinColumn(name = "TRIP_ID", nullable = false)
	private Trip trip;
	
	@Column(name = "rate_based_on_agreement")
	private long rateBasedOnAgreement;
	
	@Column(name = "loading_charge")
	private long loadingCharge;
	
	@Column(name = "unloading_charge")
	private long unloadingCharge;
	
	@Column(name = "invoice_ref_no")
	private String invoiceRefNo;
	
	@Column(name = "end_branch_date")
	private Date endBranchDate;
	
	@Column(name = "gas_indent", nullable = false)
	private String gasIndent;
	
	@Column(name = "gas_cash")
	private long gasCash;
	
	@Column(name = "start_odo")
	private long startODO;
	
	@Column(name = "end_odo")
	private long endODO;
	
	@Column(name = "driver_allowance", nullable = false)
	private long driverAllowance;
	
	@Column(name = "parking")
	private long parking;
	
	@Column(name = "metro_charges")
	private long metroCharges;
	
	@Column(name = "traffic_police")
	private long trafficPolice;
	
	@Column(name = "other_trip_expense")
	private long otherTripExpense;
	
	@Column(name = "total_revenue")	
	private long totalRevenue;
	
	@Column(name = "total_expense")
	private long totalExpense;
	
	@Column(name = "profit_loss")
	private long profitLoss;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the trip
	 */
	public Trip getTrip() {
		return trip;
	}
	/**
	 * @param trip the trip to set
	 */
	public void setTrip(Trip trip) {
		this.trip = trip;
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
