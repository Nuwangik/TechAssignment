/*
* This class is specific to GET Category detail endpoint and all specific methods related to
* enpoints are listed here.
 */
package api.applicationApi;

import api.ReusableRest;
import io.restassured.response.Response;

public class CategoryDetailApi {
    public Response getCategoryDetails(String catID, String qKey, String qValue){
        return ReusableRest.getIdAndParam(catID, qKey, qValue);
    }
}
