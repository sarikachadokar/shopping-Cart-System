package io.ProductService.product.service;


import java.time.LocalDateTime;
import java.util.Arrays;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.ServletWebRequest;

import io.ProductService.product.dto.APIError;

@ControllerAdvice     //it is goingto take care of the global exception 
public class CustomExceptionHandler {

	@ExceptionHandler({OfferNotValidException.class})
	 ResponseEntity<?> offerNotValidHandler(Exception e, ServletWebRequest  request){
		 APIError apiError =new APIError();
		 apiError.setTimestamp(LocalDateTime.now());
		 apiError.setPathUrl(request.getDescription(true));
		 apiError.setStatus(HttpStatus.BAD_REQUEST);
		 apiError.setErrors(Arrays.asList(e.getClass() +" : " +e.getMessage()));
		 return new ResponseEntity(apiError, new HttpHeaders(), apiError.getStatus());
	 }   
}
