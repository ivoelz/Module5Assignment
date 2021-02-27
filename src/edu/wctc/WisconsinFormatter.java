package edu.wctc;

public class WisconsinFormatter implements DriversLicenseFormatter {

    @Override
    public String formatLicenseNumber(DriversLicense driversLicense) throws MissingNameException {
        //Uses the getter methods of the driver's license object to retrieve the components of the license number.
        // Returns them in a String in the format of SSSS-FFF-YY-DDD-N
        return String.format("%s-%s%c-%c%03d-00", driversLicense.getSoundexCode(),
                driversLicense.getFirstNameMiddleInitial(), driversLicense.getBirthYear(),
                driversLicense.getBirthYear(), driversLicense.getBirthMonthDayGender());
    }
}
