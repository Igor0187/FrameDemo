package testcases;

import org.testng.annotations.BeforeSuite;
import utils.SuiteConfiguration;

import java.io.IOException;


public class ApiTestInit extends BaseTest{
    private SuiteConfiguration conf;

    @BeforeSuite
    public void setParam() throws IOException {
        this.conf = new SuiteConfiguration();
    }

}