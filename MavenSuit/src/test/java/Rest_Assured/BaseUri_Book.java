package Rest_Assured;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import Rest_Assured_Resorces.GernircClass_RestAssured;
import io.restassured.RestAssured;
import io.restassured.response.Response;
public class BaseUri_Book  {
	@Test
	public void test1 ()
	{
		RestAssured.baseURI = "http://216.10.245.166";
		Response res=	
				given().
							header("Content-Type","application/json").
							body("{\"name\":\"LearnAppiufsfmAutomationwithJava\",\"isbn\":\"nndd1da452\",\"aisle\":\"21452\",\"author\":\"ManojBhole\"}").
				when().
							post("/Library/Addbook.php").
				then().
							assertThat().statusCode(200).extract().response();
		GernircClass_RestAssured obj = new GernircClass_RestAssured();
		obj.raw_To_Json(res);
		System.out.println(obj.raw_To_Json(res));
	}
}


