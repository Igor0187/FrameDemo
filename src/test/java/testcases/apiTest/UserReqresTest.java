package testcases.apiTest;

import api.apicalls.ApiUserCalls;
import api.pojo.requests.UserBuilder;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import testcases.ApiTestInit;

public class UserReqresTest extends ApiTestInit {

    private final UserBuilder userBody = UserBuilder.builder().build();
    private final ApiUserCalls apiPetCalls = new ApiUserCalls(BASE_URL_API);

    String expectedName = "Denis";
    @Test
    @Description("Pet store api test")
    public void userReqresTest() {
        String createdName = apiPetCalls.createUser(userBody, 201).getName();
        softAssert.assertEquals( createdName, expectedName, "Name is'nt correct");
    }
}
