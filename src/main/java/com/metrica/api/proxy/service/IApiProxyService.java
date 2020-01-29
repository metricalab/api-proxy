package com.metrica.api.proxy.service;

import com.metrica.api.proxy.pojo.DeleteRefranResponse;
import com.metrica.api.proxy.pojo.NewRefranPetition;
import com.metrica.api.proxy.pojo.NewRefranResponse;
import com.metrica.api.proxy.pojo.NumRefranesDTO;
import com.metrica.api.proxy.pojo.RefranDTO;

public interface IApiProxyService {

	public RefranDTO getRandomRefran();

	public RefranDTO getBestRefran();

	public RefranDTO getRefranById(Integer id);

	public NumRefranesDTO getNumRefranes();

	public NewRefranResponse newRefran(final NewRefranPetition miRefran);

	public DeleteRefranResponse deleteRefran(final Integer id);

}
