package com.rodrigo.gadda.demo.dto;


import java.io.Serializable;
import java.sql.Timestamp;

import com.rodrigo.gadda.demo.exception.SuperErrorException;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@lombok.Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ErrorValidacionDTO extends SuperErrorException {

	private static final long serialVersionUID = 1L;

	private Timestamp timestamp;
	private int codigo;
	private String detail;

	public ErrorValidacionDTO(int codigo, String detail) {
		super();
		this.codigo = codigo;
		this.detail = detail;
	}



}
