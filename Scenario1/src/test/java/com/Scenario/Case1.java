package com.Scenario;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Case1 {
	
	@Test
	public void Case1() throws IOException
	{
		FileInputStream fs = new FileInputStream(new File(".\\JsonFileInput\\JsonFile.json"));
		Response postResponse = RestAssured.given().auth().none().
				header("Content-Type","application/json")
				.contentType(ContentType.JSON)
				.when()
				.body(IOUtils.toString(fs,"UTF-8"))
				.post("https://petrol.office.microsoft.com/v1/feedback");
		
		//For checking the Status Code
		Assert.assertEquals(200, postResponse.getStatusCode());
		System.out.println("Post Response Status Code is:"+postResponse.getStatusCode());
	}

}
