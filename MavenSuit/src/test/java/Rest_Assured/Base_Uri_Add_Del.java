package Rest_Assured;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static Rest_Assured_Resorces.GernircClass_RestAssured.*;
import java.io.FileInputStream;
import java.util.Properties;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
/*Case 1 =    Fetch the response
 * Case 2 =  Grab the place id from response
 * Case 3 =  place this placeId in delete request 
 * */
	public class Base_Uri_Add_Del {
	Properties prop = new Properties();
	@BeforeTest
	public void getData() throws Exception
	{
		FileInputStream fis = new FileInputStream("D://March_Batch//MavenSuit//src//test//java//Rest_Assured_Resorces//env.properties");
		prop.load(fis);
	}
	@Test
	public void test1()
	{
		String str = body();
		//Create response
		RestAssured.baseURI = prop.getProperty("HOST");
		//Case 1 = Fetch the response
		Response res = 
				given().
					queryParam("key" ,"qaclick123" ).
					body(str).
				when().
					post("/maps/api/place/add/json").
				then().
					assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
					body("status",equalTo("OK")).extract().response();
		//Case 2 = Grab the place id from response
		String response = res.asString();
		System.out.println(response);
		//convert String to Json 
		JsonPath js = new JsonPath(response);
		String placeId = js.get("place_id");
		//print Status Id
		System.out.println(placeId);

		//Case 3 place this placeId in delete request 
		given().
		queryParam("key" ,"qaclick123" ).
		body("{"+
				"\"place_id\" : \""+placeId+"\""
				+"}").
		when().
		post("/maps/api/place/delete/json").
		then().
		assertThat().statusCode(200);
	}
}
