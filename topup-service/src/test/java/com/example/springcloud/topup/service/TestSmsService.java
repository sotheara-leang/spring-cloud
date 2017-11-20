package com.example.springcloud.topup.service;

import java.net.URISyntaxException;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.web.client.RestClientException;

import com.example.springcloud.topup.AbstractApplicationTest;
import com.example.springcloud.topup.dto.SmsDto;

@DirtiesContext
@AutoConfigureStubRunner(ids = { "com.example.springcloud:sms-service:+:stubs:8082" }, workOffline = true)
public class TestSmsService extends AbstractApplicationTest {

	@Autowired
	private SmsService smsService;
	
	@Test
	public void testSendingSmsWithSuccess() throws RestClientException, URISyntaxException {
		SmsDto smsDto = new SmsDto();
		smsDto.setPhoneNumber("012555444");
		
		smsService.sendSMS(smsDto);
	}
	
	@Test
	public void testSendingSmsWithInvalidNumber() throws RestClientException, URISyntaxException {
		SmsDto smsDto = new SmsDto();
		smsDto.setPhoneNumber("012444444");
		
		smsService.sendSMS(smsDto);
	}
}
