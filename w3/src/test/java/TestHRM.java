import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TestHRM {
    HRM person = new HRM();
    @Test
    void test1(){
        assertEquals(person.hrm(new Age(-1)),"Khong hop le");
    }
    @Test
    void test2(){
        assertEquals(person.hrm(new Age(15)),"Khong thue");
    }
    @Test
    void test3(){
        assertEquals(person.hrm(new Age(17)),"Thue dang ban thoi gian");
    }
    @Test
    void test4(){
        assertEquals(person.hrm(new Age(18)),"Thue toan thoi gian");
    }
    @Test
    void test5(){
        assertEquals(person.hrm(new Age(55)),"Khong thue");
    }
    @Test
    void test6(){
        assertEquals(person.hrm(new Age(100)),"Khong hop le");
    }
}