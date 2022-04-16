package com.cricket.CricketProject.model;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="event")
public class EventModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="eventId")
	private int eventId;
	@Column(name="eventName")
	private String eventName;
	@Column(name="applicantName")
	private String applicantName;
	@Column(name="ApplicantAddress")
	private String ApplicantAddress;
	@Column(name="applicantMobile")
	private String applicantMobile;
	@Column(name="applicantEmail")
	private String applicantEmail;
	@Column(name="eventFromDate")
	private Date eventFromDate;
	@Column(name="EventToDate")
	private Date EventToDate;
	@Column(name="addonId")
	private int addonId;
	
	public EventModel(EventModel eventmodel) {
		
	}

	public EventModel(int eventId, String eventName, String applicantName, String applicantAddress,
			String applicantMobile, String applicantEmail, Date eventFromDate, Date eventToDate, int addonId) {
		super();
		this.eventId = eventId;
		this.eventName = eventName;
		this.applicantName = applicantName;
		ApplicantAddress = applicantAddress;
		this.applicantMobile = applicantMobile;
		this.applicantEmail = applicantEmail;
		this.eventFromDate = eventFromDate;
		EventToDate = eventToDate;
		this.addonId = addonId;
	}
	@Override
	public String toString() {
		return "EventModel [eventId=" + eventId + ", eventName=" + eventName + ", applicantName=" + applicantName
				+ ", ApplicantAddress=" + ApplicantAddress + ", applicantMobile=" + applicantMobile
				+ ", applicantEmail=" + applicantEmail + ", eventFromDate=" + eventFromDate + ", EventToDate="
				+ EventToDate + ", addonId=" + addonId + "]";
	}

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public String getApplicantAddress() {
		return ApplicantAddress;
	}

	public void setApplicantAddress(String applicantAddress) {
		ApplicantAddress = applicantAddress;
	}

	public String getApplicantMobile() {
		return applicantMobile;
	}

	public void setApplicantMobile(String applicantMobile) {
		this.applicantMobile = applicantMobile;
	}

	public String getApplicantEmail() {
		return applicantEmail;
	}

	public void setApplicantEmail(String applicantEmail) {
		this.applicantEmail = applicantEmail;
	}

	public Date getEventFromDate() {
		return eventFromDate;
	}

	public void setEventFromDate(Date eventFromDate) {
		this.eventFromDate = eventFromDate;
	}

	public Date getEventToDate() {
		return EventToDate;
	}

	public void setEventToDate(Date eventToDate) {
		EventToDate = eventToDate;
	}

	public int getAddonId() {
		return addonId;
	}

	public void setAddonId(int addonId) {
		this.addonId = addonId;
	}
}
