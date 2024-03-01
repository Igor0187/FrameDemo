package listeners;

import com.codeborne.selenide.Screenshots;
import com.google.common.io.Files;
import io.qameta.allure.Attachment;
import lombok.SneakyThrows;
import org.apache.commons.io.FileUtils;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;

public class TestListeners implements ITestListener {
    @SneakyThrows
    @Attachment(value = "Page screenshot", type = "image/png")
    private byte[] captureScreen() {
        File screenshot = Screenshots.takeScreenShotAsFile();
        FileUtils.copyFile(screenshot, new File("./target/allure-results//" + screenshot.getName()));
        System.out.println("Screenshot taken:" + screenshot.getName());
        return Files.toByteArray(screenshot);
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Method failed"+ result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Method skipped"+ result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Method passed"+ result.getName());
    }
}