package com.demoqa.tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class JunitDemoTest {

    @BeforeAll
    static void setUp() {
        System.out.println("### @BeforeAll !");
    }

    @Test
    void simpleTest1() {
        System.out.println("###     @Test simpleTest1() !");
        Assertions.assertTrue(3>2);
    }

    @Test
    void simpleTest2() {
        System.out.println("###     @Test simpleTest2() !");
        Assertions.assertTrue(3>1);
    }

    @AfterAll
    static void tearDown() {
        System.out.println("### @AfterAll !");
    }
}
