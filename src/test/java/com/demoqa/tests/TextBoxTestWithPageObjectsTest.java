package com.demoqa.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.demoqa.pages.RegistrationFormPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxTestWithPageObjectsTest {

    RegistrationFormPage registrationFormPage = new RegistrationFormPage();
    @BeforeAll
    static void setUp() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
  //      Configuration.holdBrowserOpen = true;
    }

    @Test
    void fillFormTest() {
        registrationFormPage.openPage()
                .setFirstName("Ivan")
                .setLastName("Ivanov")
                .setEmail("ivanivanov@gmail.com")
                .setGender("Male")
                .setNumber("8800555353")
                .setBirthDate("19", "February", "1971")
                .setSubjects("Computer Science")
                .setHobbies("Sports")
                .setPicture("image.jpg")
                .setAddress("Calgary", "NCR", "Delhi")
                .clickSubmit();

        registrationFormPage.checkResultsTableVisible()
                        .checkResult("Student Name", "Ivan Ivanov")
                        .checkResult("Student Email", "ivanivanov@gmail.com")
                        .checkResult("Gender", "Male")
                        .checkResult("Mobile", "8800555353")
                        .checkResult("Date of Birth", "19 February,1971")
                        .checkResult("Subjects", "Computer Science")
                        .checkResult("Hobbies", "Sports")
                        .checkResult("Picture", "image.jpg")
                        .checkResult("Address", "Calgary")
                        .checkResult("State and City", "NCR Delhi");

    }

}
