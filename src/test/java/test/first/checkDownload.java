package test.first;

import org.testng.Assert;
import org.testng.annotations.Test;
import test.BaseTest;

import java.io.File;
import java.io.IOException;

public class checkDownload extends BaseTest {

    @Test
    public void checkDownloadFile() throws IOException {
        ftpClient.downloadFile();
        softAssert.assertTrue(new File("students.json").exists());
        softAssert.assertAll();
    }
}
