package test.third;

import Students.Student;
import org.testng.annotations.Test;
import test.BaseTest;

import java.io.IOException;

public class checkStudentInfo extends BaseTest {

    @Test
    public void checkStudentInfoById() throws IOException {
        int id = 1;
        Student student = dataManipulation.initStudents().getStudents()
                .stream().filter(s -> s.getId() == id).findFirst().orElse(null);
        softAssert.assertNotNull(student);
        softAssert.assertTrue(dataManipulation.getStudentById(id).lastIndexOf(student.getName()) != -1);
        softAssert.assertAll();
    }
}
