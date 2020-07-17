package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;



@RestController
@RequestMapping(value = "/api/v1",produces = MediaType.APPLICATION_JSON_VALUE)
public class MyRestController {

	@RequestMapping(value = "/hello",method = RequestMethod.GET)
	public void myApiCall() {
		System.out.println("First API");
	}

}
