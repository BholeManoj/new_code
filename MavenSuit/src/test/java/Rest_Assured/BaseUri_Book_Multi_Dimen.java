package Rest_Assured;
import static io.restassured.RestAssured.given;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Rest_Assured_Resorces.GernircClass_RestAssured;
import io.restassured.RestAssured;
import io.restassured.response.Response;
public class BaseUri_Book_Multi_Dimen  {
	@Test(dataProvider="bookdata")
	public void test1 (String one ,String two)
	//http://216.10.245.166/Library/Addbook.php
	{
		RestAssured.baseURI = "http://216.10.245.166";
		Response res=	given().header("Content-Type","application/json").
				body(GernircClass_RestAssured.json_To_String(one, two)).
				when().
				post("/Library/Addbook.php").
				then().assertThat().statusCode(200).extract().response();
		GernircClass_RestAssured obj = new GernircClass_RestAssured();
		obj.raw_To_Json(res);
		System.out.println(obj.raw_To_Json(res));
	}
	//Multi-Dimentional Array
	@DataProvider(name="bookdata")
	public Object [] []  getData()
	{
		return new Object [] [] 
	{ 	{"om","1325"},{"namh","12354"},{"shivay","45837"}  };
	}
}


