/*
 This class include all the route urls references for end points.
 */
package api;

public class Route {
    public  static  final  String BASE_URI="https://api.tmsandbox.co.nz";
    public static final String BASE_PATH="/v1";
    public static  String CATERGORY_DETAILS_PATH;


    public static String getCategoryDetailPath(String catID, String qKey, String qValue){

        CATERGORY_DETAILS_PATH = "/v1/Categories/" + catID + "/Details.json?" + qKey + "="+ qValue ;

        return CATERGORY_DETAILS_PATH;
    }


}
