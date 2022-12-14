package online_tusur.unit_online_tusur;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentParameterizedTest {
    public static List<Student> testArr = new ArrayList<Student>();

    @ParameterizedTest
    @CsvSource({"Ivan,Ivanov,18", "Peotr,Petrov,45", "Masha,Mashina,35"})
    void avgAge(String first, String last, String age) {
        Student student = new Student(first,last,Integer.parseInt(age));
        testArr.add(student);
        Student[]arr = new Student[testArr.size()];
        for(int i = 0; i<testArr.size(); i++){
            arr[i] = testArr.get(i);
        }
        int sum = 0;
        int count = 0;
        for(Student s : arr) {
            sum += s.getAge();
            count++;
            //System.out.println(s.getFirstName() + " " + s.getLastName() + " " + s.getAge());
        }
        int extent = (int)(sum/count);
        System.out.println("Тестовое значение - "+extent+" Значение тестируемого метода - "+Student.avgAge(arr)+";");
        Assertions.assertEquals(extent,Student.avgAge(arr),"Тестовое значение - "+extent+" Значение тестируемого метода - "+Student.avgAge(arr)+";");
    }
}