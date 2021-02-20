package by.academy.hw.hw3.deal.products.helpers;

public enum Gender {
    FEMALE("FEMALE"), MALE("MALE");

    private final String gender;

    Gender(final String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return this.gender;
    }
}
