package edu.wctc;

public class FloridaFormatter implements DriversLicenseFormatter {

    @Override
    public String formatLicenseNumber(DriversLicense driversLicense) {
        //Uses the getter methods of the driver's license object to retrieve the components of the license number. Returns them in a String in the format of SSSS-FFF-YY-DDD-N
        return String.format("%s-%s-%s-%03d-0", driversLicense.getSoundexCode(),
                driversLicense.getFirstNameMiddleInitial(), driversLicense.getBirthYear(),
                driversLicense.getBirthMonthDayGender());
    }
}
