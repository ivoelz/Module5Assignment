package edu.wctc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Prompts the user for first name, middle initial, last name, year, month, and day of birth, gender code (M or F)
        System.out.println("Enter your first name: ");
        String firstName = sc.nextLine();
        System.out.println("Enter your middle initial: ");
        String middleInitial = sc.nextLine();
        System.out.println("Enter your last name: ");
        String lastName = sc.nextLine();
        System.out.println("Enter your birth year(example: 2000): ");
        String birthYear = sc.nextLine();
        System.out.println("Enter your birth month(example: 5): ");
        String birthMonth = sc.nextLine();
        System.out.println("Enter your birth day(example: 23) ");
        String birthDay = sc.nextLine();
        System.out.println("Enter your sex (M or F): ");
        String gender = sc.nextLine();

        // Within a try/catch block:
        try {
            // Create a new DriversLicense object
            DriversLicense driversLicense = new DriversLicense();
            new FirstNameUtility().encodeFirstName(firstName, middleInitial);
            new MonthDayGenderUtility().encodeMonthDayGender(Integer.parseInt(birthYear),
                    Integer.parseInt(birthMonth), Integer.parseInt(birthDay), gender.charAt(0));

            // Uses the utility classes to and the five setter methods to fill the object with data
            driversLicense.setBirthYear(Integer.parseInt(birthYear.substring(birthYear.length() - 2)));
            driversLicense.setSoundexCode(LastNameUtility.encodeLastName(lastName));
            driversLicense.setFirstNameMiddleInitial(new FirstNameUtility().encodeFirstName(firstName, middleInitial));
            driversLicense.setBirthMonthDayGender(new MonthDayGenderUtility().encodeMonthDayGender(Integer.parseInt(birthYear),
                    Integer.parseInt(birthMonth), Integer.parseInt(birthDay), gender.charAt(0)));
            WisconsinFormatter wi = new WisconsinFormatter();
            FloridaFormatter fl = new FloridaFormatter();
            // Uses the two formatter objects to print the driver's license numbers for Florida and Wisconsin
            System.out.println("Wisconsin: " + wi.formatLicenseNumber(driversLicense));
            System.out.println("Florida: " + fl.formatLicenseNumber(driversLicense));
            // If an exception is thrown, print the exception message and exit the program.
        } catch (MissingNameException | InvalidBirthdayException | UnknownGenderCodeException e) {
            e.printStackTrace();
        }
    }
}
