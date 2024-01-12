package com.lead.errorresponse;

public class ErrorResponse {
	
	 private String status;
	    private ApiError errorResponse;
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public ApiError getErrorResponse() {
			return errorResponse;
		}
		public void setErrorResponse(ApiError errorResponse) {
			this.errorResponse = errorResponse;
		}
		public ErrorResponse(String status, ApiError errorResponse) {
			super();
			this.status = status;
			this.errorResponse = errorResponse;
		}
	    

}
