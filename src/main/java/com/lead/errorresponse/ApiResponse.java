package com.lead.errorresponse;

public class ApiResponse {
	
	 private String status;
	    private String data;
	    
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getData() {
			return data;
		}
		public void setData(String data) {
			this.data = data;
		}
		public ApiResponse(String status, String data) {
			super();
			this.status = status;
			this.data = data;
		}
		

}
