package in.amee.coaching.model;

public class State {
	private int stateId;
	private String stateName;
	private int countryId;
	private String countryName;

	public State() {
		super();
	}

	public State(int stateId, String stateName, int countryId, String countryName) {
		super();
		this.stateId = stateId;
		this.stateName = stateName;
		this.countryId = countryId;
		this.countryName = countryName;
	}

	public State(int stateId) {
		super();
		this.stateId = stateId;
	}

	public State(String stateName, int countryId) {
		super();
		this.stateName = stateName;
		this.countryId = countryId;
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
