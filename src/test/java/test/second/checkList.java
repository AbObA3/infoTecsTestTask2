package test.second;

import Students.Students;
import org.testng.annotations.Test;
import test.BaseTest;

import java.io.IOException;
import java.net.URISyntaxException;

public class checkList extends BaseTest {

    @Test
    public void checkStudentsList() throws URISyntaxException, IOException {
        Students students = dataManipulation.initStudents();
        String result = dataManipulation.getAllStudentsByName();
        students.getStudents().forEach(s -> softAssert.assertTrue(result.lastIndexOf(s.getName()) != -1));
        softAssert.assertAll();
    }
}
