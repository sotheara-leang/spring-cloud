package com.example.springcloud.topup.web.vo;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class TopUp_Req {

	private String		accountNo;
	private String 		phoneNumber;
	private BigDecimal 	amount;
}
