package com.demoqa.tests;

import com.demoqa.pages.RegistrationFormPage;
import org.junit.jupiter.api.Test;

public class TextBoxTestWithNewDataTest extends TestBase {

    RegistrationFormPage registrationFormPage = new RegistrationFormPage();

    TestData testData = new TestData();

    @Test
    void fillFormTest() {
        registrationFormPage.openPage()
                .setFirstName(testData.firstName)
                .setLastName(testData.lastName)
                .setEmail(testData.email)
                .setGender(testData.gender)
                .setNumber(testData.number)
                .setBirthDate(testData.day, testData.month, testData.year)
                .setSubjects(testData.subjects)
                .setHobbies(testData.hobbies)
                .setPicture(testData.picture)
                .setAddress(testData.address, testData.state, testData.city)
                .clickSubmit();

        registrationFormPage.checkResultsTableVisible()
                        .checkResult("Student Name", testData.firstName + " " + testData.lastName)
                        .checkResult("Student Email", testData.email)
                        .checkResult("Gender", testData.gender)
                        .checkResult("Mobile", testData.number)
                        .checkResult("Date of Birth", testData.day + " " + testData.month + "," + testData.year)
                        .checkResult("Subjects", testData.subjects)
                        .checkResult("Hobbies", testData.hobbies)
                        .checkResult("Picture", testData.picture)
                        .checkResult("Address", testData.address)
                        .checkResult("State and City", testData.state + " " + testData.city);

    }

}
