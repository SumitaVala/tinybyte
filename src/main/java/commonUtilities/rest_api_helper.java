package commonUtilities;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class rest_api_helper {

	public static String get_responsemsg;
	public static int get_responsecode;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	public static void rest_getAPI(String url, boolean auth) {
		RequestSpecification httprequest = RestAssured.given();

		if (auth) {
			System.out.println("Inside Auth");
//			httprequest.auth().basic("UserName", "Password");
		}
		Response res = httprequest.get(url);

		get_responsemsg= res.asString();
		get_responsecode= res.getStatusCode();

		System.out.println("Inside get common method >> Response code =" + get_responsecode + ", response message= " + get_responsemsg);

	}
	
	public static void reset_postAPI_string(String url, String data, boolean auth) {
		RequestSpecification httprequest = RestAssured.given();
		
		if (auth) {
			System.out.println("Inside Auth");
//			httprequest.auth().basic("UserName", "Password");
		}
		
		httprequest.header("content-type","application/json", new Object[0]);
		httprequest.body(data);
		Response res = httprequest.post(url);
		get_responsemsg= res.asString();
		get_responsecode= res.getStatusCode();
		System.out.println("Inside post common method >> Response code =" + get_responsecode + ", response message= " + get_responsemsg);
	}
	public static void rest_putAPI_string(String url,String updateddata,boolean auth) {
		//PUT REST API METHOD
			
				RequestSpecification httprequest = RestAssured.given();
				if (auth) {
					System.out.println("Inside Auth");
//					httprequest.auth().basic("UserName", "Password");
				}
				httprequest.header("content-type","application/json", new Object[0]);
				httprequest.body(updateddata);
				Response res = httprequest.put(url);
				get_responsemsg= res.asString();
				get_responsecode= res.getStatusCode();
				System.out.println("Inside put common method >> Response code =" + get_responsecode + ", response message= " + get_responsemsg);

	}

	public static void rest_deleteAPI_string(String url, boolean auth) {
		//PUT REST API METHOD
			
				RequestSpecification httprequest = RestAssured.given();
				if (auth) {
					System.out.println("Inside Auth");
//					httprequest.auth().basic("UserName", "Password");
				}
				httprequest.header("content-type","application/json" );
				Response res = httprequest.delete(url);
				get_responsemsg= res.asString();
				get_responsecode= res.getStatusCode();
				System.out.println("Inside delete common method >> Response code =" + get_responsecode + ", response message= " + get_responsemsg);

	}
}
