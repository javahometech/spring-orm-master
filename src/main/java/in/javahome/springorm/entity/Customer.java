package in.javahome.springorm.entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMERS123")
public class Customer implements Serializable{
	@Column(name = "CUSTOMER_ID")
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer custId;
	@Column(name = "CUSTOMER_NAME")
	private String name;
	@Column(name = "CUSTOMER_PHONE")
	private String phone;
	public Integer getCustId() {
		return custId;
	}
	public void setCustId(Integer custId) {
		this.custId = custId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}

