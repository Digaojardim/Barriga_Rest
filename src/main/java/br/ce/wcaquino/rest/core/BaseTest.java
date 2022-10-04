package br.ce.wcaquino.rest.core;

import org.junit.BeforeClass;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;

public class BaseTest implements Constantes {

	@BeforeClass
	public static void setup() {
	//	System.out.println("passou aqui");
		RestAssured.baseURI = APP_BASE_URL;
		RestAssured.port = APP_PORT;
		RestAssured.basePath = APP_BASE_PATH;
		
		RequestSpecBuilder reBuilder = new RequestSpecBuilder();
		reBuilder.setContentType(APP_CONTENT_TYPE);
		RestAssured.requestSpecification = reBuilder.build();
		
		RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
	}
}
