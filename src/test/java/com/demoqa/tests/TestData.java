package com.demoqa.tests;

import com.github.javafaker.Faker;

import java.util.Locale;

public class TestData {

    Faker faker = new Faker(new Locale("sv"));
    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String email = faker.internet().emailAddress();
    String gender = faker.demographic().sex();
    String number = faker.phoneNumber().subscriberNumber(10);
    String day = String.valueOf(faker.number().numberBetween(10, 30));
    String month = "March";
    String year = String.valueOf(faker.number().numberBetween(1900, 2010));
    String subjects = "Computer Science";
    String hobbies = "Sports";
    String picture = "image.jpg";
    String address = faker.address().fullAddress();
    String state = "NCR";
    String city = "Delhi";

}
