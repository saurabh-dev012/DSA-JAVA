public class Loops {
    public static void main(String[] args) {

        //For Loop

        for (int value = 2; value <= 20; value += 2) {
            System.out.println(value);
        }

        for (int attempt = 1; attempt <= 3; attempt++) {
            System.out.println("Keep practicing on CodeHelp ONE");
        }

        // Nested Loop

        for (int i = 0; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.println(" * ");
            }
            System.out.println();
                
        }

        for (int i = 1; i <= 3;  i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println(" i = " + i + " j = " + j);
            }
        }

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }


        // While Loop

        int count = 1;
        while (count <= 5) {
            System.out.println(count);
            count++;
        }

        int modulesLeft = 4;
        while (modulesLeft >= 1) {
            System.out.println("Modules left: " + modulesLeft);
            modulesLeft--;
        }


        // Do-while Loop


        int revisionRound = 1;

                do {
                    System.out.println("Revision Round: " + revisionRound);
                    revisionRound++;
                } while (revisionRound <= 3);

    }
}
