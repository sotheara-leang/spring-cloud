package com.example.springcloud.topup.dto;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class TopUpDto {

	private String		accountNo;
	private String 		phoneNumber;
	private BigDecimal 	amount;
}
