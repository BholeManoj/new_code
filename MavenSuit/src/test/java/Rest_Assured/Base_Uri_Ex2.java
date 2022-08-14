package Rest_Assured;

import io.restassured.RestAssured;
import static  io.restassured.RestAssured.*;
public class Base_Uri_Ex2 {

	public static void main(String[] args) {
//http://universities.hipolabs.com/search?country=United+States
		RestAssured.baseURI = "http://universities.hipolabs.com";
		given().
				param("country" ,"United+States" ).
		when().
				get("/search").
		then().assertThat().statusCode(200);
	}


}
