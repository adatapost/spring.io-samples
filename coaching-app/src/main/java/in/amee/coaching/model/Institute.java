package in.amee.coaching.model;

import java.sql.Blob;

public class Institute {
	private int instId;
	private String title;
	private String postalCode;
	private String address;
	private Blob logo;
	private int createdBy;
	private int cityId;
	private int domainId;
	private String email;
	private String phone1;
	private String phone2;
	private String fax;
	private UserProfile userProfile;
	private BusinessDomain domain;
	private City city;

	public Institute() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Institute(int instId, String title, String postalCode, String address, Blob logo, int createdBy, int cityId,
			int domainId, String email, String phone1, String phone2, String fax) {
		super();
		this.instId = instId;
		this.title = title;
		this.postalCode = postalCode;
		this.address = address;
		this.logo = logo;
		this.createdBy = createdBy;
		this.cityId = cityId;
		this.domainId = domainId;
		this.email = email;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.fax = fax;
	}

	public int getInstId() {
		return instId;
	}

	public void setInstId(int instId) {
		this.instId = instId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Blob getLogo() {
		return logo;
	}

	public void setLogo(Blob logo) {
		this.logo = logo;
	}

	public int getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public int getDomainId() {
		return domainId;
	}

	public void setDomainId(int domainId) {
		this.domainId = domainId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getPhone2() {
		return phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public UserProfile getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}

	public BusinessDomain getDomain() {
		return domain;
	}

	public void setDomain(BusinessDomain domain) {
		this.domain = domain;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

}
