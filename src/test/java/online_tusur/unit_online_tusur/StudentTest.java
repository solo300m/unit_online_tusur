package online_tusur.unit_online_tusur;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    public static Student[] testArr = new Student[3];

    @BeforeAll
    static void beforeAll() {
        testArr[0] = new Student("Ivan","Ivanov",12);
        testArr[1] = new Student("petr","Petrov",50);
        testArr[2] = new Student("Masha","Mashina",18);
    }

    @Test
    @Tag("positive")
    void getFirstName() {
        String firstAss = testArr[0].getFirstName();
        String firstIn = "Ivan";
        Assertions.assertEquals(firstIn,firstAss);
    }
    @Test
    @Tag("negative")
    void getFirstNameNG() {
        String actual = testArr[1].getFirstName();
        String expect = "petr";
        Assertions.assertEquals(expect,actual);
    }

    @Test
    @Tag("positive")
    void setFirstName() {
        String expect = "Somova";
        testArr[2].setFirstName(expect);
        String actual = testArr[2].getFirstName();
        Assertions.assertEquals(expect,actual);
    }

    @Test
    @Tag("negative")
    void setFirstNameNG() {
        String expect = "masha";
        testArr[2].setFirstName(expect);
        String actual = testArr[2].getFirstName();
        Assertions.assertEquals(expect,actual);
    }

    @Test
    @Tag("negative")
    void setFirstNameNG2() {
        String enter = "masha angella";
        String expect = "Masha Angella";
        testArr[2].setFirstName(enter);
        String actual = testArr[2].getFirstName();
        Assertions.assertEquals(expect,actual);
    }

    @Test
    @Tag("positive")
    void getLastName() {
        String actual = testArr[1].getLastName();
        String expect = "Petrov";
        Assertions.assertEquals(expect,actual);
    }
    @Test
    @Tag("negative")
    void getLastNameNG() {
        String actual = testArr[1].getLastName();
        String expect = "petrov";
        Assertions.assertEquals(expect,actual);
    }

    @Test
    @Tag("positive")
    void setLastName() {
        String expect = "Somova";
        testArr[2].setLastName(expect);
        String actual = testArr[2].getLastName();
        Assertions.assertEquals(expect,actual);
    }
    @Test
    @Tag("negative")
    void setLastNameNG() {
        String expect = "mashina";
        testArr[2].setLastName(expect);
        String actual = testArr[2].getLastName();
        Assertions.assertEquals(expect,actual);
    }


    @Test
    @Tag("positive")
    void getAge() {
        int expect = 18;
        int actual = testArr[0].getAge();
        Assertions.assertEquals(expect,actual);
    }
    @Test
    @Tag("negative")
    void getAgeNG() {
        int expect = 52;
        int actual = testArr[1].getAge();
        Assertions.assertEquals(expect,actual);
    }

    @Test
    @Tag("positive")
    void setAge() {
        int setAge = 10;
        int expect = 18;
        testArr[1].setAge(setAge);
        int actual = testArr[1].getAge();
        Assertions.assertEquals(expect,actual);
    }

    @Test
    @Tag("negative")
    void setAgeNG() {
        int setAge = 10;
        int expect = 10;
        testArr[1].setAge(setAge);
        int actual = testArr[1].getAge();
        Assertions.assertEquals(expect,actual);
    }

    @Test
    @Tag("negative")
    void getFullNameNG() {
        String expect = "Petrov petr";
        String actual =  testArr[1].getFullName();
        Assertions.assertEquals(expect,actual);
    }

    @Test
    @Tag("positive")
    void getFullName() {
        String expect = "Ivanov Ivan";
        String actual =  testArr[0].getFullName();
        Assertions.assertEquals(expect,actual);
    }

    @Test
    @Tag("positive")
    void avgAge() {
        int expect = (18+18+18)/3;
        int actual = Student.avgAge(testArr);
        Assertions.assertEquals(expect,actual);
    }
    @Test
    @Tag("negative")
    void avgAgeNG() {
        int expect = (18+50+18)/3;
        int actual = Student.avgAge(testArr);
        Assertions.assertEquals(expect,actual);
    }

    @Test
    @Tag("positive")
    void minAge() {
        int expect = 18;
        int actual = Student.minAge(testArr);
        Assertions.assertEquals(expect,actual);
    }

    @Test
    @Tag("positive")
    void maxAge() {
        int expect = 18;
        int actual = Student.maxAge(testArr);
        Assertions.assertEquals(expect,actual);
    }

    @Test
    @Tag("positive")
    void maxAgeNG() {
        int expect = 50;
        int actual = Student.maxAge(testArr);
        Assertions.assertEquals(expect,actual);
    }
}