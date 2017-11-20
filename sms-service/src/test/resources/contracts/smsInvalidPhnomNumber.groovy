package contracts;
org.springframework.cloud.contract.spec.Contract.make {
	request {
		method 'POST'
		url '/sms'
		body(
			"phoneNumber": "012444444"
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
			"resultCode": "0001",
			"resultMessage": "Invalid phnom number"
		)
	}
}