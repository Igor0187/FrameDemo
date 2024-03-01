package api.apicalls;

import api.BaseApiCall;
import api.pojo.requests.UserBuilder;
import api.pojo.responses.UserResponse;
import io.qameta.allure.Step;

import static io.restassured.RestAssured.given;

public class ApiUserCalls extends BaseApiCall {

    public ApiUserCalls(String url) {
        super(url);
    }

    @Step("Add pet to store")
    public UserResponse createUser(UserBuilder userBody, int expectedStatusCode) {
        return given()
                .spec(requestSpec)
                .when()
                .body(userBody)
                .post("/api/users")
                .then()
                .statusCode(expectedStatusCode)
                .log()
                .body()
                .extract().as(UserResponse.class);
    }
}
