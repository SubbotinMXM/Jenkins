package com.api;
import org.junit.jupiter.api.*;

@Tag("smoke")
public class SimpleTests {

    @Test
    void test1(){
        Assertions.assertTrue(true);
    }
    @Test
    void test2(){
        Assertions.assertTrue(true);
    }
    @Test
    void test3(){
        Assertions.assertTrue(true);
    }
    @Test
    void test4(){
        Assertions.assertTrue(true);
    }
    @Test
    void test5(){
        Assertions.assertTrue(true);
    }
    @Test
    void test6(){
        Assertions.assertTrue(false);
    }
    @Test
    void test7(){
        Assertions.assertTrue(false);
    }
    @Test
    void test8(){
        Assertions.assertTrue(false);
    }

    @Test
    @Disabled
    void test9(){
        Assertions.assertTrue(false);
    }
    @Test
    @Disabled
    void test10(){
        Assertions.assertTrue(false);
    }
}
