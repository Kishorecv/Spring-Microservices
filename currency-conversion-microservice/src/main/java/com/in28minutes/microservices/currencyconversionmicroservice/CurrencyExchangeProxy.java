package com.in28minutes.microservices.currencyconversionmicroservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

//@FeignClient(name = "currency-exchange", url = "localhost:8000")
@FeignClient(name = "currency-exchange")
public interface CurrencyExchangeProxy {

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	@ResponseBody
	public CurrencyConversion retrieveExchangeValue(@PathVariable(value = "from") String from,
			@PathVariable(value = "to") String to);

}
