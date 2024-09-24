package com.rodrigo.gadda.demo.service;

import com.rodrigo.gadda.demo.dto.LoginResponseDTO;
import com.rodrigo.gadda.demo.dto.RegisterRequestDTO;
import com.rodrigo.gadda.demo.dto.RegisterResponseDTO;
import com.rodrigo.gadda.demo.exception.SuperErrorException;

public interface UserService {

	RegisterResponseDTO signUp (RegisterRequestDTO request) throws SuperErrorException;

	LoginResponseDTO login (String token) throws SuperErrorException;

}
