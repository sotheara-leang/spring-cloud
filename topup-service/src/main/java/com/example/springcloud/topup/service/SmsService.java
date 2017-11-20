package com.example.springcloud.topup.service;

import java.net.URISyntaxException;

import org.springframework.web.client.RestClientException;

import com.example.springcloud.topup.dto.SmsDto;
import com.example.springcloud.topup.dto.SmsResultDto;

public interface SmsService {

	SmsResultDto sendSMS(SmsDto smsDto) throws RestClientException, URISyntaxException;
}
