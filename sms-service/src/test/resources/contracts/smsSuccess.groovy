package contracts;
org.springframework.cloud.contract.spec.Contract.make {
	request {
		method 'POST'
		url '/sms'
		body(
			"phoneNumber": "012555444"
		)
		headers { 
			contentType('application/json') 
		}
	}
	response {
		status 200
		headers { 
			contentType('application/json') 
		}
		body(
			"resultCode": "0000",
			"resultMessage": "Success"
		)
	}
}