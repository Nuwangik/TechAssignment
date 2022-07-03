/*
 This class include Request and Response specification builders
 */

package api;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;


public class SpecBuilder {

    // Request
    public static RequestSpecification getRequestSpec(){
        return new RequestSpecBuilder().
                setBaseUri(Route.BASE_URI).
                setBasePath(Route.BASE_PATH).
                log(LogDetail.ALL).
                build();
    }

    public static RequestSpecification getReqSpecCatDetails(String catID, String qKey, String qValue){
        return new RequestSpecBuilder().
                setBaseUri(Route.BASE_URI).
                setBasePath(Route.getCategoryDetailPath(catID,qKey, qValue)).
                log(LogDetail.ALL).
                build();
    }

    //Response

    public static ResponseSpecification getResponseSpec(){
        return new ResponseSpecBuilder().
                expectStatusCode(200).
                expectContentType(ContentType.JSON).
                log(LogDetail.ALL).
                build();
    }

}
