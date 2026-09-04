public class Operators {
    public static void main(String[] args) {

        // Arithmetic Operators

        int solvedThisWeek = 25;
        int solvedLastWeek = 15;

        int total = solvedThisWeek + solvedLastWeek;
        int difference = solvedLastWeek - solvedThisWeek;
        int projected = solvedThisWeek * 4;
        int average = solvedThisWeek / 7;
        int remainder = solvedThisWeek % 7;

        System.out.println(total);
        System.out.println(difference);
        System.out.println(projected);
        System.out.println(average);
        System.out.println(remainder);

        // Relational Operators

        int currentStreak = 45;
        int targetStreak = 50;

        System.out.println(currentStreak == targetStreak);
        System.out.println(currentStreak != targetStreak);
        System.out.println(currentStreak > targetStreak);
        System.out.println(currentStreak < targetStreak);
        System.out.println(currentStreak >= targetStreak);
        System.out.println(currentStreak <= targetStreak);

        // Logical Operators

        boolean completedDSA = true;
        boolean completedCore = false;

        System.out.println(completedDSA && completedCore);
        System.out.println(completedDSA || completedCore);
        System.out.println(!completedCore);

        //Assignment Operators

        int ratingPoints = 100;
        System.out.println(ratingPoints);

        ratingPoints += 20;
        System.out.println(ratingPoints);

        ratingPoints -= 10;
        System.out.println(ratingPoints);

        ratingPoints *= 2;
        System.out.println(ratingPoints);

        ratingPoints /= 4;
        System.out.println(ratingPoints);

        ratingPoints %= 30;
        System.out.println(ratingPoints);




    }
}
