package com.demoqa.tests;

import com.codeborne.selenide.Configuration;
import com.demoqa.utils.RandomUtils;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeAll;

import java.util.Locale;

public class TestBase {

    @BeforeAll
    static void setUp() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
    }
}
