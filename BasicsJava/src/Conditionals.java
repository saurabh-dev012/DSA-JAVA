import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        // If Statement


        int dailyPractice = 12;

        if (dailyPractice >= 10) {
            System.out.println("Good consistency!");
        }

        // If-else


        int age = 16;

        if (age > 18) {
            System.out.println("You are eligible to vote");
        }
        else {
            System.out.println("You are not eligible to vote");
        }

        int score = 42;

        if (score >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        // If-else-if ladder


        int accuracy = 78;

        if (accuracy >= 90) {
            System.out.println("Excellent");
        }
        else if (accuracy >= 75) {
            System.out.println("Good");
        }
        else if (accuracy >= 60) {
            System.out.println("Average");
        }
        else {
            System.out.println("Needs Improvement");
        }


        // Nested If-else


        boolean hasSubscription = true;
        int solvedProblems = 220;

        if (hasSubscription) {

            if (solvedProblems >= 200) {
                System.out.println("Unlock Advanced Sheet");
            } else {
                System.out.println("Practice More Problems");
            }

        } else {
            System.out.println("Upgrade to Premium");
        }


        // Ternary Operator


        int streakDays = 35;

        String status = (streakDays >= 30) ? "Consistent" : "Irregular";

        System.out.println(status);

        //Switch Case


        int dayNumber = 3;

                switch (dayNumber) {
                    case 1:
                        System.out.println("Monday");
                        break;

                    case 2:
                        System.out.println("Tuesday");
                        break;

                    case 3:
                        System.out.println("Wednesday");
                        break;

                    default:
                        System.out.println("Invalid day");
                }

                System.out.println("Enter the value for day: ");
                Scanner sc = new Scanner(System.in);
                int day = sc.nextInt();

                switch (day) {
                    case 1:
                        System.out.println("Monday");
                        break;
                        case 2:
                            System.out.println("Tuesday");
                            break;
                            case 3:
                            System.out.println("Wednesday");
                            break;
                            case 4:
                            System.out.println("Thursday");
                            break;
                            case 5:
                            System.out.println("Friday");
                            break;
                            case 6:
                                System.out.println("Saturday");
                                break;
                                case 7:
                                    System.out.println("Sunday");
                                    break;
                                    default:
                                        System.out.println("Invalid day");
                }

            }
        }
