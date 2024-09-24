package com.rodrigo.gadda.demo.exception;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ErrorException {

	private Timestamp timestamp;
	private int codigo;
	private String detail;

}
