package com.PDF.Artifacts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PdfReaderController {
	@Autowired
	PdfReader pdf;
	
	@GetMapping("/readPdf/{filename}")
	public String ReadPdf(@PathVariable String filename)
	{
	
		return "Success: "+filename + pdf.ReadPdf(filename);
	}
	
	@GetMapping("/Report")
	public String Report(@PathVariable String filename)
	{
	
		return "/index";
	}
/*
 * 	
@GetMapping("/currency-exchange/from/{from}/to/{to}")	
	public ExchangeValue retrieveExchangeValue(@PathVariable String from,@PathVariable String to)
	{*/
}
