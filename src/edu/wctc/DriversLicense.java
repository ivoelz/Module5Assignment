package edu.wctc;

public class DriversLicense {

    private String soundexCode;
    private int firstNameMiddleInitial;
    private int birthYear;
    private int birthMonthDayGender;
    private int overflow;

    public String getSoundexCode() {
        return soundexCode;
    }

    public void setSoundexCode(String SSSS) {
        soundexCode = SSSS;
    }

    public int getFirstNameMiddleInitial() {
        return firstNameMiddleInitial;
    }

    public void setFirstNameMiddleInitial(int FFF) {
        firstNameMiddleInitial = FFF;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int YY) {
        birthYear = YY;
    }

    public int getBirthMonthDayGender() {
        return birthMonthDayGender;
    }

    public void setBirthMonthDayGender(int DDD) {
        birthMonthDayGender = DDD;
    }

    public int getOverflow() {
        return overflow;
    }

    public void setOverflow(int NN) {
        overflow = NN;
    }
}