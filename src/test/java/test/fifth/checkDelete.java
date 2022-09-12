package test.fifth;

import Students.Student;
import org.testng.annotations.Test;
import test.BaseTest;

import java.io.IOException;
import java.net.URISyntaxException;

public class checkDelete extends BaseTest {

    @Test
    public void checkDeleteStudent() throws IOException, URISyntaxException {
        int id = 1;
        Student student = dataManipulation.initStudents().getStudents()
                .stream().filter(s -> s.getId() == id).findFirst().orElse(null);
        softAssert.assertNotNull(student);
        dataManipulation.deleteStudentById(id);
        dataManipulation.initStudents().getStudents()
                .forEach(s -> softAssert.assertTrue(!student.getName().equals(s.getName())));
        softAssert.assertAll();

    }
}
