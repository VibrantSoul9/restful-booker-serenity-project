package restful.booker.bookinginfo;/**
 * @author VibrantSoul
 */

import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import restful.booker.constants.EndPoints;
import restful.booker.model.AuthPojo;

/**
 *@author VibrantSoul
 */
public class AuthSteps {
    @Step
    public ValidatableResponse createToken(String userName, String password) {
        AuthPojo authPojo = new AuthPojo();
        authPojo.setUsername(userName);
        authPojo.setPassword(password);

        return SerenityRest.given().log().all()
                .contentType(ContentType.JSON)
                .body(authPojo)
                .when()
                .post(EndPoints.GET_TOKEN)
                .then().log().all();}
}
