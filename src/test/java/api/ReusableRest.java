/*
 This class include the resuable methods of Rest Assured
 */
package api;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class ReusableRest {
    public static Response getIdAndParam(String Id, String qKey, String qValue){
        return given(SpecBuilder.getRequestSpec()).
                when().get(Route.getCategoryDetailPath(Id, qKey, qValue)).
                then().spec(SpecBuilder.getResponseSpec()).
                extract().
                response();

    }
}
