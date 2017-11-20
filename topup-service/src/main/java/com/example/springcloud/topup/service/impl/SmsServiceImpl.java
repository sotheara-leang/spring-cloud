package com.example.springcloud.topup.service.impl;

import java.net.URISyntaxException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.example.springcloud.topup.dto.SmsDto;
import com.example.springcloud.topup.dto.SmsResultDto;
import com.example.springcloud.topup.service.SmsService;

@Service
public class SmsServiceImpl implements SmsService {

	private final static Logger logger = LoggerFactory.getLogger(SmsServiceImpl.class);
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public SmsResultDto sendSMS(SmsDto smsDto) throws RestClientException, URISyntaxException {
		logger.debug("Process sending sms");
		
		SmsResultDto smsResultDto = restTemplate.postForObject("http://sms-service/sms", smsDto, SmsResultDto.class);
		
		logger.debug("Response sending sms: {}", smsResultDto);
		
		return smsResultDto;
	}
}
