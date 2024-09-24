package com.rodrigo.gadda.demo.controller.impl;

import com.rodrigo.gadda.demo.dto.LoginResponseDTO;
import com.rodrigo.gadda.demo.dto.RegisterRequestDTO;
import com.rodrigo.gadda.demo.dto.RegisterResponseDTO;
import com.rodrigo.gadda.demo.exception.SuperErrorException;
import com.rodrigo.gadda.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequiredArgsConstructor
@Slf4j
public class UserControllerImpl{

	@Autowired
	private UserService userService;

	@PostMapping("/sign-up")
	public RegisterResponseDTO signUp(@RequestBody RegisterRequestDTO request) throws SuperErrorException {

		log.info("sign-up - Inicio ControllerImpl");

		RegisterResponseDTO response = userService.signUp(request);

		log.info("sign-up - Fin ControllerImpl");

		return response;
	}

	@GetMapping("/login")
	public LoginResponseDTO login(@RequestParam String token) throws SuperErrorException {

		log.info("login - Inicio ControllerImpl");

		LoginResponseDTO response = userService.login(token);

		log.info("login - Fin ControllerImpl");

		return response;
	}

}
