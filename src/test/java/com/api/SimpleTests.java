package com.api;
import org.junit.jupiter.api.*;


public class SimpleTests {

    @Tag("smoke")
    @Test
    void test1(){
        Assertions.assertTrue(true);
    }
    @Tag("smoke")
    @Test
    void test2(){
        Assertions.assertTrue(true);
    }

    @Tag("web")
    @Test
    void test3(){
        Assertions.assertTrue(true);
    }
    @Tag("web")
    @Test
    void test4(){
        Assertions.assertTrue(true);
    }
    @Tag("web")
    @Test
    void test5(){
        Assertions.assertTrue(true);
    }
    @Tag("prod")
    @Test
    void test6(){
        Assertions.assertTrue(false);
    }
    @Tag("prod")
    @Test
    void test7(){
        Assertions.assertTrue(false);
    }
    @Tag("prod")
    @Test
    void test8(){
        Assertions.assertTrue(false);
    }
    @Tag("prod")
    @Test
    @Disabled
    void test9(){
        Assertions.assertTrue(false);
    }
    @Tag("smoke")
    @Test
    @Disabled
    void test10(){
        Assertions.assertTrue(false);
    }
}
