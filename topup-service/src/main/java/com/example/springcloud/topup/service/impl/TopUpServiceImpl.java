package com.example.springcloud.topup.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.springcloud.topup.dto.TopUpDto;
import com.example.springcloud.topup.service.TopUpService;

@Service
public class TopUpServiceImpl implements TopUpService {

	private final static Logger logger = LoggerFactory.getLogger(TopUpServiceImpl.class);
	
	@Override
	public void topup(TopUpDto topUpDto) {
		logger.debug("Process topup");
	}
}
