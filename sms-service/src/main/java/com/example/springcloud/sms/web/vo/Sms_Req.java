package com.example.springcloud.sms.web.vo;

import lombok.Data;

@Data
public class Sms_Req {

	private String 	phoneNumber;
	private String  message;
}
