package pack;

import org.junit.jupiter.api.Test;

class DemoTest {

    @Test
    void testGetGPA() {
        MyClass myClass = new MyClass("a", 2);
        System.out.println(Demo.getGPA(myClass.getScore(), myClass.getCredit()));
        myClass = new MyClass("a-", 2);
        System.out.println(Demo.getGPA(myClass.getScore(), myClass.getCredit()));
        myClass = new MyClass("b+", 2);
        System.out.println(Demo.getGPA(myClass.getScore(), myClass.getCredit()));
        myClass = new MyClass("b", 2);
        System.out.println(Demo.getGPA(myClass.getScore(), myClass.getCredit()));
        myClass = new MyClass("b-", 2);
        System.out.println(Demo.getGPA(myClass.getScore(), myClass.getCredit()));
        myClass = new MyClass("C+", 2);
        System.out.println(Demo.getGPA(myClass.getScore(), myClass.getCredit()));
        myClass = new MyClass("c", 2);
        System.out.println(Demo.getGPA(myClass.getScore(), myClass.getCredit()));
        myClass = new MyClass("c-", 2);
        System.out.println(Demo.getGPA(myClass.getScore(), myClass.getCredit()));
        myClass = new MyClass("d+", 2);
        System.out.println(Demo.getGPA(myClass.getScore(), myClass.getCredit()));
        myClass = new MyClass("d", 2);
        System.out.println(Demo.getGPA(myClass.getScore(), myClass.getCredit()));
        myClass = new MyClass("f", 2);
        System.out.println(Demo.getGPA(myClass.getScore(), myClass.getCredit()));
        myClass = new MyClass("f", -1);
        System.out.println(Demo.getGPA(myClass.getScore(), myClass.getCredit()));
    }

    @Test
    void testGetGPA1() {
        MyClass myClass = new MyClass(95.0, 1);
        System.out.println(Demo.getGPA(myClass.getScore(), myClass.getCredit()));
        myClass = new MyClass(101.0, 2);
        System.out.println(Demo.getGPA(myClass.getScore(), myClass.getCredit()));
        myClass = new MyClass(86.0, 2);
        System.out.println(Demo.getGPA(myClass.getScore(), myClass.getCredit()));
        myClass = new MyClass(82.0, 2);
        System.out.println(Demo.getGPA(myClass.getScore(), myClass.getCredit()));
        myClass = new MyClass(79.0, 2);
        System.out.println(Demo.getGPA(myClass.getScore(), myClass.getCredit()));
        myClass = new MyClass(76.0, 2);
        System.out.println(Demo.getGPA(myClass.getScore(), myClass.getCredit()));
        myClass = new MyClass(72.0, 2);
        System.out.println(Demo.getGPA(myClass.getScore(), myClass.getCredit()));
        myClass = new MyClass(70.0, 2);
        System.out.println(Demo.getGPA(myClass.getScore(), myClass.getCredit()));
        myClass = new MyClass(66.0, 2);
        System.out.println(Demo.getGPA(myClass.getScore(), myClass.getCredit()));
        myClass = new MyClass(62.0, 2);
        System.out.println(Demo.getGPA(myClass.getScore(), myClass.getCredit()));
        myClass = new MyClass(60.0, 2);
        System.out.println(Demo.getGPA(myClass.getScore(), myClass.getCredit()));
        myClass = new MyClass(55.0, 2);
        System.out.println(Demo.getGPA(myClass.getScore(), myClass.getCredit()));
        myClass = new MyClass(0.0, 2);
        System.out.println(Demo.getGPA(myClass.getScore(), myClass.getCredit()));
        myClass = new MyClass(-12.0, 2);
        System.out.println(Demo.getGPA(myClass.getScore(), myClass.getCredit()));
        myClass = new MyClass(82.0, -2);
        System.out.println(Demo.getGPA(myClass.getScore(), myClass.getCredit()));
    }
}