package tdd;

public class HekkaParcels {

    public int calculateLessThanFiftyPercentBonus(int collectionRate) {

        if (collectionRate < 50) {
            return collectionRate * 0;
        }
        return 0;
    }


        public int calculateFiftyToFiftyNinePercentBonus(int collectionRate){

            if (collectionRate >= 50 && collectionRate <= 59) {
                return collectionRate * 200;
            }
            return collectionRate * 200;
        }

        public int calculateSixtyToSixtyNinePercentBonus(int collectionRate){
            int secondCollectionRate = collectionRate * 250;

            if (collectionRate >= 60 && collectionRate <= 69) {
            }
            return secondCollectionRate;
        }

        public int calculateSeventyToSeventyNinePercentBonus ( int collectionRate){
            if (collectionRate >= 70) {
                return collectionRate * 500;
            }
            return collectionRate;
        }
    }

