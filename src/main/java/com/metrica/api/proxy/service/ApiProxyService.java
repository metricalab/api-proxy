package com.metrica.api.proxy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.metrica.api.proxy.configuration.Endpoint;
import com.metrica.api.proxy.pojo.DeleteRefranResponse;
import com.metrica.api.proxy.pojo.NewRefranPetition;
import com.metrica.api.proxy.pojo.NewRefranResponse;
import com.metrica.api.proxy.pojo.NumRefranesDTO;
import com.metrica.api.proxy.pojo.RefranDTO;

@Service
public class ApiProxyService implements IApiProxyService {
	@Autowired
	RestTemplate restTemplate;
	@Autowired
	Endpoint endpoint;

	@Override
	public RefranDTO getRandomRefran() {
		final RefranDTO miRefran = restTemplate.getForObject(endpoint.getRandom(), RefranDTO.class);
		miRefran.setColor();
		return miRefran;
	}

	@Override
	public RefranDTO getBestRefran() {
		final RefranDTO miRefran = restTemplate.getForObject(endpoint.getBest(), RefranDTO.class);
		miRefran.setColor();
		return miRefran;
	}

	@Override
	public NumRefranesDTO getNumRefranes() {
		final NumRefranesDTO numRefranes = restTemplate.getForObject(endpoint.getNumber(), NumRefranesDTO.class);
		return numRefranes;
	}

	@Override
	public RefranDTO getRefranById(final Integer id) {
		final RefranDTO miRefran = restTemplate.getForObject(endpoint.getById() + "/" + id, RefranDTO.class);
		miRefran.setColor();
		return miRefran;
	}

	@Override
	public NewRefranResponse newRefran(final NewRefranPetition myPetition) {
		final HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		final HttpEntity<NewRefranPetition> request = new HttpEntity<NewRefranPetition>(myPetition, headers);
		final NewRefranResponse myNewRefranDTO = restTemplate.postForObject(endpoint.newRefran(), request,
				NewRefranResponse.class);
		return myNewRefranDTO;
	}

	@Override
	public DeleteRefranResponse deleteRefran(final Integer id) {
//		final HttpHeaders headers = new HttpHeaders();
//		headers.setContentType(MediaType.APPLICATION_JSON);
//		final HttpEntity<Integer> request = new HttpEntity<Integer>(id);
		restTemplate.delete(endpoint.getDelete(id));
//		return request;
		return new DeleteRefranResponse(id);
	}
}
