package in.amee.coaching.model;

public class Country {
       private int countryId;
       private String countryName;
	
       public Country() {
		      super();
       }
	
       public Country(int countryId, String countryName) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
	  }
	
       public Country(int countryId) {
		super();
		this.countryId = countryId;
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
