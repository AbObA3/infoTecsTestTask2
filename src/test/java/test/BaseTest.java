package test;

import Client.FTPClient;
import Client.FTPClientImpl;
import DataManipulation.DataManipulation;
import DataManipulation.DataManipulationImpl;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.net.URISyntaxException;

public class BaseTest {
    protected static FTPClient ftpClient;
    protected static DataManipulation dataManipulation;
    protected static SoftAssert softAssert;

    @BeforeSuite(description = "initialize ftpclient and datManipulation")
    public void init() throws IOException, URISyntaxException {
        ftpClient = new FTPClientImpl("127.0.0.1", 21, "myUser", "12345", 1);
        dataManipulation = new DataManipulationImpl(ftpClient);
        ftpClient.open();
        softAssert = new SoftAssert();
    }

    @AfterSuite(description = "close connection")
    public void teardown() throws IOException {
        ftpClient.close();
    }
}