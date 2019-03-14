package in.amee.coaching.model;

public class Response {
      private String message;
      private boolean status;
      private Object data;
	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Response(String message, boolean status, Object data) {
		super();
		this.message = message;
		this.status = status;
		this.data = data;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "Response [message=" + message + ", status=" + status + ", data=" + data + "]";
	}
      
      
}
