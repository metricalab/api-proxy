package com.metrica.api.proxy.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.metrica.api.proxy.pojo.DeleteRefranResponse;
import com.metrica.api.proxy.pojo.NewRefranPetition;
import com.metrica.api.proxy.pojo.NewRefranResponse;
import com.metrica.api.proxy.pojo.NumRefranesDTO;
import com.metrica.api.proxy.pojo.RefranDTO;
import com.metrica.api.proxy.service.IApiProxyService;

@RestController
public class ApiProxyControlller {

	private static final String hardcode = "{'%s':'%s'}";

	@Autowired
	IApiProxyService myService;

	/**
	 * <h1>Test</h1>
	 * <p>
	 * Con esta llamada al endpoint http://localhost:8080/test obtenemos un JSON con
	 * una clave y un valor
	 * </p>
	 * <p>
	 * por ejemplo:
	 * </p>
	 * {@code
	 * http://localhost:8080/test?paramName=mivalor&paramValue=valeEsto
	 * }
	 * <p>
	 * nos devolverá
	 * </p>
	 * {'mivalor':'valeEsto'}
	 *
	 * @param paramName
	 * @param paramValue
	 * @return JSON object String @
	 */
	@GetMapping("/test")
	public String test(@RequestParam(value = "paramName", defaultValue = "this") final String name,
			@RequestParam(value = "paramValue", defaultValue = "is a hardcoded JSON") final String value) {
		return new String(String.format(hardcode, name, value));
	}

	@GetMapping("/random")
	public RefranDTO randomRefran() {
		return myService.getRandomRefran();
	}

	@GetMapping("/best")
	public RefranDTO bestRefran() {
		return myService.getBestRefran();
	}

	@GetMapping("/byId/{id}")
	public RefranDTO getRefranById(@PathVariable final Integer id) {
		return myService.getRefranById(id);
	}

	@GetMapping("/numRefranes")
	public NumRefranesDTO getNumRefranes() {
		return myService.getNumRefranes();
	}

	@PostMapping(value = "/new", consumes = "application/json", produces = "application/json")
	public NewRefranResponse newRefran(@Valid @RequestBody final NewRefranPetition miPeticion) {
		return myService.newRefran(miPeticion);
	}

	@DeleteMapping(value = "/{id}", consumes = "application/json", produces = "application/json")
	public DeleteRefranResponse deleteRefran(@PathVariable final Integer id) {
		return myService.deleteRefran(id);
	}
}
