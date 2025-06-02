package org.example;

public enum  Day {
    MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);
    private final int dayNumber;

    Day(int i) {
        this.dayNumber = i;
    }

    public boolean isWeekend(){
        return dayNumber == 6 || dayNumber == 7;
    }

    @Override
    public String toString() {
        return this.name();
    }
}
