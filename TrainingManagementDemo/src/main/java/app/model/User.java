package app.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="user")
public class User implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_id")
	private Integer id;
	@Column
	private String prn;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column
	private String email;
	@Column(name="contact_number")
	private String contactNumber;
	@Column
	private String password;
	@Transient
	private String confirmPassword;
	@Column
	private boolean active;
	@Column
	private String role;
	@Column(name="user_type") 
	private String userType;
	
	
	public User() {
	
	}


	public User(Integer id, String prn, String firstName, String lastName, String email, String contactNumber,
			String password, String confirmPassword, boolean active, String role, String userType) {
		super();
		this.id = id;
		this.prn = prn;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.contactNumber = contactNumber;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.active = active;
		this.role = role;
		this.userType = userType;
	}


	public User(String prn, String firstName, String lastName, String email, String contactNumber, String password,
			String confirmPassword, boolean active, String role, String userType) {
		super();
		this.prn = prn;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.contactNumber = contactNumber;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.active = active;
		this.role = role;
		this.userType = userType;
	}


	public User(User user) {
		super();
		this.id = user.getId();
		this.prn = user.getPrn();
		this.firstName = user.getFirstName();
		this.lastName = user.getLastName();
		this.email = user.getEmail();
		this.contactNumber = user.getContactNumber();
		this.password = user.getPassword();
		this.confirmPassword = user.getConfirmPassword();
		this.active = user.isActive();
		this.role = user.getRole();
		this.userType = user.getUserType();
	}
	

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getPrn() {
		return prn;
	}


	public void setPrn(String prn) {
		this.prn = prn;
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getContactNumber() {
		return contactNumber;
	}


	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getConfirmPassword() {
		return confirmPassword;
	}


	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}


	public boolean isActive() {
		return active;
	}


	public void setActive(boolean active) {
		this.active = active;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public String getUserType() {
		return userType;
	}


	public void setUserType(String userType) {
		this.userType = userType;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", prn=" + prn + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", contactNumber=" + contactNumber + ", password=" + password + ", confirmPassword="
				+ confirmPassword + ", active=" + active + ", role=" + role + ", userType=" + userType + "]";
	}
	
	
}
