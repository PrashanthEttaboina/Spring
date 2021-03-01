package com.motivity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="appointment")
public class AppointmentBean {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="aid")
	private int id;
	@Column(name="pname")
	private String pname;
	@Column(name="phone")
	private String phone;
	@Column(name="email")
	private String email;
	@Column(name="gender")
	private String gender;
	@Column(name="blood_group")
	private String blood_group;
	@Column(name="specialist")
	private String specialist;
	@Column(name="date_of_appointment")
	private String date_of_appointment;
	@Column(name="time_of_appointment")
	private String time_of_appointment;
	@Column(name="dname")
	private String dname="none";
	@Column(name="status")
	private String status="none";
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "pid")
	private PatientBean patient;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBlood_group() {
		return blood_group;
	}
	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}
	public String getSpecialist() {
		return specialist;
	}
	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
	public String getDate_of_appointment() {
		return date_of_appointment;
	}
	public void setDate_of_appointment(String date_of_appointment) {
		this.date_of_appointment = date_of_appointment;
	}
	public String getTime_of_appointment() {
		return time_of_appointment;
	}
	public void setTime_of_appointment(String time_of_appointment) {
		this.time_of_appointment = time_of_appointment;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public PatientBean getPatient() {
		return patient;
	}
	public void setPatient(PatientBean patient) {
		this.patient = patient;
	}
	
}