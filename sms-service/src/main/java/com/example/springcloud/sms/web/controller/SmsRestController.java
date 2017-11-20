package com.example.springcloud.sms.web.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springcloud.sms.web.vo.Sms_Req;
import com.example.springcloud.sms.web.vo.Sms_Res;

@RestController
public class SmsRestController {

	@PostMapping ("/sms")
	public Sms_Res sms(@RequestBody Sms_Req sms_Req) {
		Sms_Res sms_Res = new Sms_Res();
		sms_Res.setResultCode("0000");
		sms_Res.setResultMessage("Success");
		return sms_Res;
	}
}
