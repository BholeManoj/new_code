package Rest_Assured;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
public class Base_Uri_Ex1 {
	@Test
public void one()
{
	RestAssured.baseURI = "http://universities.hipolabs.com";
	given().
			param("country" ,"United+States" ).
	when().
			get("/search").
	then().assertThat().statusCode(240);
	
}
	



}
