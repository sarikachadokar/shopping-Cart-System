package io.ProductService.product.dto;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.http.HttpStatus;

import lombok.Data;
@Data
public class APIError {
	private HttpStatus status;
	private List<String> errors;
	private LocalDateTime timestamp;
	private String pathUrl;
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	public List<String> getErrors() {
		return errors;
	}
	public void setErrors(List<String> errors) {
		this.errors = errors;
	}
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	public String getPathUrl() {
		return pathUrl;
	}
	public void setPathUrl(String pathUrl) {
		this.pathUrl = pathUrl;
	}

	

}
