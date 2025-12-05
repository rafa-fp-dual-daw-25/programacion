package com.personajes.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.classic.Logger;
import jakarta.servlet.http.HttpServletRequest;

@RequestMapping("/")
@RestController
public class JuegoRestController {

	// Declare variables
	String personaje = "Surfista Plateado";

	@GetMapping("/")
	public String saludar() {
		return "Adivina el personaje";
	}

	@GetMapping("/pista1")
	public String pista1(HttpServletRequest request) {
		getIp(request);
		return "Su nombre real es Norrin Radd.";
	}

	@GetMapping("/pista2")
	public String pista2(HttpServletRequest request) {
		getIp(request);
		return "Viaja por el cosmos sobre una tabla de surf cósmica.";
	}

	@GetMapping("/pista3")
	public String pista3(HttpServletRequest request) {
		getIp(request);
		return "Es conocido por su aspecto metálico y su poder inmenso.";
	}

	@GetMapping("/resolver/{name}")
	public boolean pista1Resolver(@PathVariable String name) {
		System.out.println(personaje);
		if (name.equals(personaje)) {
			return true;
		} else {
			return false;
		}
	}

	@GetMapping("/resolver/{name}")
	public boolean pista2Resolver(@PathVariable String name) {
		return true;
	}

	@GetMapping("/resolver/{name}")
	public boolean pista3Resolver(@PathVariable String name) {
		return true;
	}

	public void getIp(HttpServletRequest request) {
		String ip = request.getHeader("X-Forwarded-For");
		if (ip == null) {
			ip = request.getRemoteAddr();
		}
		System.out.println("IP de la request: " + ip);
	}

}
