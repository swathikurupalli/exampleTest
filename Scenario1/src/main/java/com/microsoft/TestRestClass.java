package com.microsoft;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class TestRestClass {
	
	int statuscode;
	    public int httpResponseCodeViaGet(String url) 
	    {
	            return RestAssured.get(url).statusCode();
	    }

	    public int httpResponseCodeViaPost(String url) 
	    {
	        return RestAssured.post(url).statusCode();
	    }

	    @Test
	    public  void testing() {
	    	statuscode = new TestRestClass().httpResponseCodeViaGet("https://petrol.office.microsoft.com/v1/feedback");
	        System.out.println("status response........"+statuscode);
	    
	    }
	}

