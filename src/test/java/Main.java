import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        XmlSuite suite = new XmlSuite();
        suite.setName("FullSuite");

        XmlTest test = new XmlTest(suite);
        test.setName("AllTests");
        List<XmlClass> classes = new ArrayList<XmlClass>();
        classes.add(new XmlClass("test.BaseTest"));
        classes.add(new XmlClass("test.first.checkDownload"));
        classes.add(new XmlClass("test.second.checkList"));
        classes.add(new XmlClass("test.third.checkStudentInfo"));
        classes.add(new XmlClass("test.fourth.checkAdd"));
        classes.add(new XmlClass("test.fifth.checkDelete"));
        test.setXmlClasses(classes) ;

        List<XmlSuite> suites = new ArrayList<XmlSuite>();
        suites.add(suite);
        TestNG tng = new TestNG();
        tng.setXmlSuites(suites);
        tng.run();
    }

}
