package in.amee.coaching.model;

public class BusinessDomain {
       private int domainId;
       private String name;
	public BusinessDomain() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BusinessDomain(int domainId, String name) {
		super();
		this.domainId = domainId;
		this.name = name;
	}
	
	public BusinessDomain(int domainId) {
		super();
		this.domainId = domainId;
	}
	public int getDomainId() {
		return domainId;
	}
	public void setDomainId(int domainId) {
		this.domainId = domainId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
       
       
}
