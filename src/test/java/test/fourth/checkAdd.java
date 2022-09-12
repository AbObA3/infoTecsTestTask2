package test.fourth;

import Students.Students;
import org.testng.annotations.Test;
import test.BaseTest;

import java.io.IOException;
import java.net.URISyntaxException;

public class checkAdd extends BaseTest {

    @Test
    public void checkAddStudents() throws IOException, URISyntaxException {
        String name = "Vladimir";
        dataManipulation.addStudentToList(name);
        Students students = dataManipulation.initStudents();
        softAssert.assertNotNull(students.getStudents().stream()
                .filter(s ->name.equals(s.getName())).findFirst().orElse(null));
        softAssert.assertAll();
    }
}
