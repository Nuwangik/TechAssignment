/*
 This class include the test cases with assertions
 */
package test;

import api.applicationApi.CategoryDetailApi;

import groovy.cli.Option;
import helpers.Utils;
import io.qameta.allure.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import javax.xml.bind.annotation.XmlElement;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;

public class TestCategoryDetail {
    Response response;
    @Story("Verify the Category Details endpoint for category id : 6327")
    @Parameters ({"catID", "QueryKey", "QueryValue"})
    @Test
    public void test_GetCatergodyDetails(@Optional("6327") String catID, @Optional("catalogue") String qKey, @Optional("false") String qValue) {

        System.out.println("catID" + catID);
        CategoryDetailApi categoryDetailApi = new CategoryDetailApi();
        response = categoryDetailApi.getCategoryDetails(catID, qKey, qValue);

        // Assert the response code is 200
        assertThat(response.statusCode(), equalTo(200));

    }


    //======== 1st assertion - Assert the Category Name ===========
    //======== As per given task Name =  "Carbon credits" =========
    @Step
    @Parameters({"Name"})
    public void VerifyCategoryName(@Optional("Carbon credits") String Name){
        Utils utils = new Utils();
        assertEquals(utils.getJsonPath(response,"Name"),Name);
    }



    //========= 2nd Assertion - CanRelist = true ==============
   @Step
    public void VerifyCanReListIsTrue(){
        Utils utils = new Utils();
        assertEquals(utils.getJsonPath(response,"CanRelist"),"true");
    }



    // ============ 3rd Asserstion - Check Promotion element with Name and Description =============
    // As per given task The Promotions element with Name = "Gallery" has a Descriptio that contains the text "Good position in category"
    // Approach : Check the promotion name , if it is equal to expected then check the description

   @Step
    @Parameters({"PromotionName", "PromotionDescription"})
    public void VerifyPromotionElementAndDescription(@Optional("Gallery") String PromotionName, @Optional("Good position in category") String PromotionDescription){
        JsonPath js = new JsonPath(response.asString());
        int noOfPromotions  = js.get("Promotions.size()");

        for(int i=0; i<noOfPromotions; i++){
            String promotionName  = js.get("Promotions["+i+"].Name");

            if(promotionName.equals(PromotionName)){
                Utils utils = new Utils();
                String promotionDes = "Promotions["+i+"].Description";

                assertEquals(utils.getJsonPath(response,promotionDes),PromotionDescription);

            }

        }
    }



    }




