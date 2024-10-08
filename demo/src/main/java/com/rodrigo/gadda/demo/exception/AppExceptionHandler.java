package com.rodrigo.gadda.demo.exception;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.ArrayList;

import com.rodrigo.gadda.demo.dto.ErrorGeneralDTO;
import com.rodrigo.gadda.demo.dto.ErrorValidacionDTO;
import com.rodrigo.gadda.demo.dto.RegisterRequestDTO;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AppExceptionHandler {

	@ExceptionHandler(value = {ErrorValidacionDTO.class})
	public ResponseEntity<Object> handleErrorDTOException (ErrorValidacionDTO errorDTO){

		Instant instanteActual = Instant.now();

		ErrorException errorTechnicalException = new ErrorException(Timestamp.from(instanteActual),errorDTO.getCodigo(),errorDTO.getDetail());
		ErrorGeneralException technicalException = new ErrorGeneralException();
		technicalException.setError(new ArrayList<>());
		technicalException.getError().add(errorTechnicalException);
		return new ResponseEntity<>(technicalException,new HttpHeaders(), HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(value = {ErrorGeneralDTO.class})
	public ResponseEntity<Object> handleErrorDTOException (ErrorGeneralDTO errorDTO){

		Instant instanteActual = Instant.now();

		ErrorException errorTechnicalException = new ErrorException(Timestamp.from(instanteActual),errorDTO.getCodigo(),errorDTO.getDetail());
		ErrorGeneralException technicalException = new ErrorGeneralException();
		technicalException.setError(new ArrayList<>());
		technicalException.getError().add(errorTechnicalException);
		return new ResponseEntity<>(technicalException,new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
