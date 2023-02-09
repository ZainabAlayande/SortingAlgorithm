package tdd;

public class HeartRates {

        private String firstName;
        private String lastName;
        private String dateOfBirth;

        public HeartRates(String firstName, String lastName, String dateOfBirth) {
                this.firstName = firstName;
                this.lastName = lastName;
                this.dateOfBirth = dateOfBirth;
        }

        public void setFirstName(String firstName) {
                this.firstName = firstName;
        }

        public String getFirstName() {
                return firstName;
        }

        public void setLastName(String lastName) {
                this.lastName = lastName;
        }

        public String getLastName() {
                return lastName;
        }

        public void setDateOfBirth(String dateOfBirth) {
                this.dateOfBirth = dateOfBirth;
        }

        public String getDateOfBirth() {
                return dateOfBirth;
        }


        public int calculateAgeInYears(int currentYear, int age) {
                int dateOfBirth = currentYear - age;
                return dateOfBirth;
        }


        public int calculateMaximumHeartRate(int age) {
                int maximumHeartRate = 220 - age;
                return maximumHeartRate;
        }

        public double checkTargetHeartRate(int age) {
                int heartRate = 220 - age;
                double targetHeartRate = 0.5 * heartRate;
                return targetHeartRate;
        }

        public double checkSecondTargetHeartRate(int age) {
                int heartRate = 220 - age;
                double targetHeartRate2 = 0.85 * heartRate;
                return targetHeartRate2;
        }

}


