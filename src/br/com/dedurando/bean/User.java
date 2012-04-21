package br.com.dedurando.bean;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity(name="user")
@Table(name="DDR_USER")
@SequenceGenerator(name="SEQ_GEN_USER", sequenceName="SEQ_USER", allocationSize=1)
public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator="SEQ_GEN_USER", strategy=GenerationType.SEQUENCE)
	@Column(name="USER_ID")
	private Long userId;
	
	@Column(name="STATUS")
	private char status;
	
	@Column(name="MAIL")
	private String mail;
	
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="IP_ADRESS")
	private String ipAddress;
	
	@Column(name="RESET_PASSWORD_TOKEN")
	private String resetPasswordToken;
	
	@Column(name="CONFIRMATION_TOKEN")
	private String confirmation_token;
	
	@Column(name="PHOTO")
	private byte[] photo;
	
	@Column(name="PHONE")
	private String phone;
	
	@Column(name="CITY")
	private String city;
	
	@Column(name="COUNTRY")
	private String country;
	
	@Column(name="CREATED_AT")
	private Calendar created_at;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getResetPasswordToken() {
		return resetPasswordToken;
	}

	public void setResetPasswordToken(String resetPasswordToken) {
		this.resetPasswordToken = resetPasswordToken;
	}

	public String getConfirmation_token() {
		return confirmation_token;
	}

	public void setConfirmation_token(String confirmation_token) {
		this.confirmation_token = confirmation_token;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Calendar getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Calendar created_at) {
		this.created_at = created_at;
	}
	
	
	
}
