package in.amee.coaching.model;

public class City {
	private int cityId;
	private String cityName;
	private int stateId;
	private String stateName;
	private int countryId;
	private String countryName;
	public City() {
		super();
	}
	public City(int cityId, String cityName, int stateId, String stateName, int countryId, String countryName) {
		super();
		this.cityId = cityId;
		this.cityName = cityName;
		this.stateId = stateId;
		this.stateName = stateName;
		this.countryId = countryId;
		this.countryName = countryName;
	}
	public City(int cityId) {
		super();
		this.cityId = cityId;
	}
	public City(String cityName, int stateId,int countryId) {
		super();
		this.cityName = cityName;
		this.stateId = stateId;
		this.countryId = countryId;
	}
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public int getStateId() {
		return stateId;
	}
	public void setStateId(int stateId) {
		this.stateId = stateId;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public int getCountryId() {
		return countryId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
}
