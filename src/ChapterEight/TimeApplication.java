package ChapterEight;

public class TimeApplication {
    private int hour;
    private int minute;
    private int second;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        validateHour(hour);
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        validateMinute(minute);
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        validateSecond(second);
        this.second = second;
    }

    public TimeApplication(int hour, int minute, int second) {
        validate(hour, minute, second);

        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }

    private void validate(int hour, int second, int minute) {
        validateHour(hour);
        validateSecond(second);
        validateMinute(minute);
    }



    private static void validateSecond(int second) {
        boolean secondIsValid = second < 0 || second > 59;
        if (secondIsValid) {
            throw new IllegalArgumentException("Second is Invalid");
        }
    }



    private void validateHour(int hour) {
        boolean hoursIsValid = hour < 0 || hour > 23;
        if (hoursIsValid) {
            throw new IllegalArgumentException("Hours is Invalid");
        }
    }


    private void validateMinute(int minute) {
        boolean minuteIsValid = minute < 0 || minute > 59;
        if (minuteIsValid) {
            throw new IllegalArgumentException("Minute is Invalid");
        }
    }



    public String toUniversalString() {

        return String.format("%02d:%02d:%02d", hour, minute, second);
    }



    public String toString() {
        return String.format("%d:%02d:%02d %s",
                ((hour == 0 || hour == 12) ? 12 : hour % 12),
                minute,second, (hour < 12 ? "AM" : "PM"));
    }
}

