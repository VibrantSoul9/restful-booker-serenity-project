package restful.booker.testbase;/**
 * @author VibrantSoul
 */

import io.restassured.RestAssured;
import org.junit.BeforeClass;

/**
 *@author VibrantSoul
 */
public class TestBase {
    public static PropertyReader propertyReader;

    @BeforeClass
    public static void init() {
        propertyReader = PropertyReader.getInstance();
        RestAssured.baseURI = propertyReader.getProperty("baseUrl");
        //RestAssured.port = Integer.parseInt(propertyReader.getProperty("port"));
        //RestAssured.basePath = Path.STUDENT;
    }
}
