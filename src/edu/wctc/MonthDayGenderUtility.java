package edu.wctc;

import java.time.DateTimeException;
import java.time.LocalDate;

public class MonthDayGenderUtility {
    private final int MOD_MALE = 0;
    private final int MOD_FEMALE = 500;
    private final char CODE_MALE = 'M';
    private final char CODE_FEMALE = 'F';

    public int encodeMonthDayGender(int year, int month, int day, char genderCode) throws InvalidBirthdayException, UnknownGenderCodeException {
        //If the gender code does not match one of the constants, an UnknownGenderCodeException is thrown. If the year,
        // month, and day of birth do not constitute a valid date (such as February 31st or December 47th), an InvalidBirthdayException is thrown.
        if (genderCode == CODE_FEMALE || genderCode == CODE_MALE) {
            if (validateDate(year, month, day)) {
                //Returns (month - 1) * 40 + day + genderModConstant.
                return ((month - 1) * 40 + day + genderCode == CODE_FEMALE ? MOD_FEMALE : MOD_MALE);
            } else {
                throw new InvalidBirthdayException(year, month, day);
            }
        } else {
            throw new UnknownGenderCodeException(genderCode);
        }
    }

    public static boolean validateDate(int year, int month, int day) {
        boolean validDate = true;
        try {
            LocalDate.of(year, month, day);
        } catch (DateTimeException e) {
            validDate = false;
        }
        return validDate;
    }

}
