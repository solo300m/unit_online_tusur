package online_tusur.unit_online_tusur;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StudentTestFactory {
    @TestFactory
    Collection<DynamicTest> dynamicTestFromCollection(){
        List<DynamicTest>dynamicTests = new ArrayList<>();
        List<Student>studentList = new ArrayList<>();
        studentList.add(new Student("Ivan","Ivanov",12));
        studentList.add(new Student("petr","Petrov",50));
        studentList.add(new Student("Masha","Mashina",18));
        String[]expect = {"Ivan","petr","Masha"};
        String[]expectLast = {"Ivanov","petrov","Mashina"};
        int[]expectAge = {12,50,18};
        for(int i = 0; i < studentList.size(); i++){
            Student j = studentList.get(i);
            String d = expect[i];
            String l = expectLast[i];
            int a = expectAge[i];
            DynamicTest dTest = DynamicTest.dynamicTest("Dynamic Test for Student.getFirstName()",
                    ()->{
                        Assertions.assertEquals(d,j.getFirstName());
                    });
            DynamicTest lTest = DynamicTest.dynamicTest("Dynamic Test for Student.getLastName()",
                    ()->{
                        Assertions.assertEquals(l,j.getLastName());
                    });
            DynamicTest aTest = DynamicTest.dynamicTest("Dynamic Test for Student.getAge()",
                    ()->{
                        Assertions.assertEquals(a,j.getAge());
                    });
            dynamicTests.add(dTest);
            dynamicTests.add(lTest);
            dynamicTests.add(aTest);
        }
        return dynamicTests;
    }
}
