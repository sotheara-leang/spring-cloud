package com.example.springcloud.topup.web.controller;

import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;

import com.example.springcloud.topup.dto.SmsDto;
import com.example.springcloud.topup.dto.TopUpDto;
import com.example.springcloud.topup.service.SmsService;
import com.example.springcloud.topup.service.TopUpService;
import com.example.springcloud.topup.web.vo.TopUp_Req;
import com.example.springcloud.topup.web.vo.TopUp_Res;

@RestController("/api/topup")
public class TopUpRestController {
	
	@Autowired
	private TopUpService topUpService;
	
	@Autowired
	private SmsService smsService;

	@PostMapping
	public TopUp_Res topUp(@RequestBody TopUp_Req topUp_Req) throws RestClientException, URISyntaxException {
		TopUpDto topUpDto = new TopUpDto();
		topUpDto.setAccountNo(topUp_Req.getAccountNo());
		topUpDto.setAmount(topUp_Req.getAmount());
		topUpService.topup(topUpDto);
		
		SmsDto smsDto = new SmsDto();
		smsDto.setPhoneNumber("");
		smsDto.setMessage("Successfuly topup");
		smsService.sendSMS(smsDto);
		
		TopUp_Res topUp_Res = new TopUp_Res();
		topUp_Res.setResultCode("0000");
		topUp_Res.setResultMessage("Success");
		
		return topUp_Res;
	}
}
