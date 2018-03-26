Feature: To validate MyRetail API functionality

	@restservice
	Scenario Outline: To check whether MyRetail GET service returns successful response
	Given the API with the header information as
		|Accept|application/json|
		|Content-Type|application/json|
	When the Client sends request to web service "<ServiceURL>" using GET
	Then the response status code should be "<statusCode>"
	
		Examples:
			|ServiceURL|statusCode|
			|/product/15117729|200|
			|/product/151177291|404|
			

	@restservice
	Scenario Outline: To check whether MyRetail PUT service returns successful response
	Given the API with the header information as
		|Accept|application/json|
		|Content-Type|application/json|
	When the Client sends request "<request>" to web service "<ServiceURL>" using PUT
	Then the response status code should be "<statusCode>"
	
		Examples:
			|request|ServiceURL|statusCode|
			|{"id":15117729,"name":"The Big Lebowski (Blu-ray) (Widescreen)","current_price":{"value":9999,"currency_code":"US"}}|/product/15117729|200|
			|{"id":151177291,"name":"The Big Lebowski (Blu-ray) (Widescreen)","current_price":{"value":9999,"currency_code":"US"}}|/product/151177291|404|
			|{"id":151177291,"name":"The Big Lebowski (Blu-ray) (Widescreen)","current_price":{"value":99h99,"currency_code":"US"}}|/product/151177291|400|
			|{"id":151177291,"name":"The Big Lebowski (Blu-ray) (Widescreen)","current_price":{"currency_code":"US"}}|/product/151177291|400|
