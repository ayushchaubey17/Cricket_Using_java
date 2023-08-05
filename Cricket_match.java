import java.util.Random;
import java.util.Scanner;

public class Cricket_match {
    public static void main(String[] args) {
        rule();
        toss();

    }

    //method declare for rule
    public static void rule() {
        System.out.println("RULES OF CRICKET GAME");
        System.out.println("Rule 1....here you are playing with computer ");
        System.out.println("Rule 2....you will get no run,one ,two ,three ,four and 6 runs");
        System.out.println("rule 3....wide ball will give you an extra run");
        System.out.println("rule 4....no ball will give you an extra ball with an extra run ");
        System.out.println("rule 5....match will be of two overs");
        System.out.println("rule 6.... no wicket limit\n");
    }

    // method for toss....
    public static void toss() {
        Scanner sc1 = new Scanner(System.in);
        Random rn1 = new Random();
        System.out.println("enter your name ");
        String name = sc1.nextLine();
        System.out.println("welcome captain " + name + "... lets go for the toss");
        System.out.println("whats your call for toss captain  " + name + "\n head \n tail");
        System.out.println("press 0 for head and 1 for tail");
        int ytoss = sc1.nextInt();
        int ctoss = rn1.nextInt(2);
        if (ctoss == 0) {
            System.out.println("it is head");
        } else {
            System.out.println("it is tail");
        }


        if (ytoss == ctoss) {
            System.out.println("you won the toss");
            System.out.println("you won the toss..........select your decision\n press 1 for batting and 2 for bowling..");
            int ydec = sc1.nextInt();

            switch (ydec) {
                case 1: {
                    System.out.println("you have choosen for batting");
                    int target = battingFirst() + 1;
                    System.out.println("opponent need " + target + " run in 2 over");
                    bowlingLast(target);
                    break;


                }
                case 2: {
                    System.out.println("you have choosen for bowling");
                    int target = bowlingFirst() + 1;
                    System.out.println("you need " + target + "run in 2 over");
                    battingLast(target);


                }

            }


        } else {

            System.out.println("you loss the toss");
            int com_dec = rn1.nextInt(2);
            if (com_dec == 0) {
                System.out.println("computer chooses for bowling......get ready for bat first");
                int target = battingFirst() + 1;
                System.out.println("opponent need " + target + " run in 2 over");
                bowlingLast(target);

            } else {
                System.out.println("computer chooses for batting.....get ready for bowl first");
                int target = bowlingFirst() + 1;
                System.out.println("you need " + target + "run in 2 over");
                battingLast(target);
            }
        }
    }

    // player is batting and computer is bowling
    public static int battingFirst() {
        System.out.println("now get ready for batting....... ");
        Scanner sc2 = new Scanner(System.in);
        Random rn2 = new Random();
        int run = 0;
        int over = 0;
        int ball = 0;
        int score = 0;
        int wicket = 0;
        while (over < 2) {
            System.out.println(" score " + run + "-" + wicket + " (" + over + "." + ball + ")");
            System.out.println("\n" + (ball + 1) + " delivery of  over " + (over + 1));
            System.out.println("press enter to play the ball");
            String p1 = sc2.nextLine();
            int s1 = rn2.nextInt(19);
            switch (s1) {
                case 0 -> {
                    System.out.println("you are bowled!!!! .. its the ball of 148.6 km/hr");
                    ball++;
                    wicket++;
                }


                case 1 -> {
                    System.out.println("dot ball ....batsman is under pressure");
                    ball++;
                }
                case 2 -> {
                    System.out.println("1 run on the mid off");
                    run++;
                    ball++;
                }
                case 3 -> {
                    System.out.println("upper cut for 4 run");
                    run += 4;
                    ball++;

                }
                case 4 -> {
                    System.out.println("6 run the ball is out of stadium");
                    run += 6;
                    ball++;
                }
                case 5 -> {
                    System.out.println("misfield for 2 run");
                    run += 2;
                    ball++;
                }
                case 6 -> {
                    System.out.println("caught by wicket kipper");
                    wicket++;
                    ball++;
                }
                case 7 -> {
                    System.out.println("6 run and it is the hellii short");
                    run += 6;
                    ball++;
                }
                case 8 -> {
                    System.out.println("4 runs by pull short");
                    run += 4;
                    ball++;
                }
                case 9 -> {
                    System.out.println("wide ball ....baller under pressure");
                    run += 1;

                }
                case 10 -> {
                    System.out.println("leg by apeal to impire but not out 2 runs to the batsman");
                    run += 2;
                    ball++;
                }
                case 11 -> {
                    System.out.println("6 from pull shott...");
                    run += 6;
                    ball++;
                }
                case 12 -> {
                    System.out.println("no ball .......its big mistake....");
                    run += 1;
                    ball--;
                }
                case 13 -> {
                    System.out.println("its for four run");
                    run += 4;
                    ball++;
                }
                case 14 -> {
                    System.out.println("its for 2 run leg by");
                    run += 2;
                    ball++;
                }
                case 15 -> {
                    System.out.println("its for 6 run");
                    run += 6;
                    ball++;
                }
                case 16 -> {
                    System.out.println("4 run by sweep sort");
                    run += 4;
                    ball++;
                }
                case 17 -> {
                    System.out.println("danger and rocket throw----RUN OUT");
                    wicket += 1;
                    ball++;
                }
                case 18 -> {
                    System.out.println("ohh sitt miss bowndary riders miss the catch 4 run in batsman account");
                    run += 4;
                    ball++;
                }
            }

            if (ball == 6) {
                ball = 0;
                over++;
            }
        }
        System.out.println(" score " + run + "-" + wicket + " (" + over + "." + ball + ")");

        return (run);

    }


    // player is bowling and computer is batting
    public static void bowlingLast(int target) {
        Scanner sc3 = new Scanner(System.in);
        Random rn3 = new Random();

        System.out.println("now gets ready for the bowlling");

        int runn = 0;
        int overr = 0;
        int balll = 0;

        int wickett = 0;
        while (overr < 2 && runn < target) {
            System.out.println(" score " + runn + "-" + wickett + " (" + overr + "." + balll + ")");
            System.out.println("\n now the delivery of " + (balll + 1) + " ball of over " + (overr + 1));
            System.out.println("press enter to throw the ball");
            String p2 = sc3.nextLine();
            int s1 = rn3.nextInt(19);
            switch (s1) {
                case 0 -> {
                    System.out.println("you have clean bowled!!!! .. its the ball of 148.6 km/hr");
                    balll++;
                    wickett++;
                }


                case 1 -> {
                    System.out.println("dot ball ....batsman is under pressure keep it up");
                    balll++;
                }
                case 2 -> {
                    System.out.println("1 run on the mid off maintain the pressure");
                    runn++;
                    balll++;
                }
                case 3 -> {
                    System.out.println("upper cut for 4 run......dont worry");
                    runn += 4;
                    balll++;

                }
                case 4 -> {
                    System.out.println("6 run the ball is out of stadium .back to the good length");
                    runn += 6;
                    balll++;
                }
                case 5 -> {
                    System.out.println("misfield for 2 run......dont misfield...");
                    runn += 2;
                    balll++;
                }
                case 6 -> {
                    System.out.println("caught by wicket kipper......now it was done");
                    wickett++;
                    balll++;
                }
                case 7 -> {
                    System.out.println("6 run and it is the hellii short....its unbelieveble");
                    runn += 6;
                    balll++;
                }
                case 8 -> {
                    System.out.println("4 runs by pull short......ohhh yrr");
                    runn += 4;
                    balll++;
                }
                case 9 -> {
                    System.out.println("wide ball ....you under pressure");
                    runn += 1;

                }
                case 10 -> {
                    System.out.println("leg by apeal to impire but not out 2 runs to the batsman");
                    runn += 2;
                    balll++;
                }
                case 11 -> {
                    System.out.println("6 from pull shott.....damped ");
                    runn += 6;
                    balll++;
                }
                case 12 -> {
                    System.out.println("no ball .......its big mistake by you....");
                    runn += 1;
                    balll--;
                }
                case 13 -> {
                    System.out.println("its for four run dont worry");
                    runn += 4;
                    balll++;
                }
                case 14 -> {
                    System.out.println("its for 2 run leg by");
                    runn += 2;
                    balll++;
                }
                case 15 -> {
                    System.out.println("its for 6 run.........damped...");
                    runn += 6;
                    balll++;
                }
                case 16 -> {
                    System.out.println("4 run by sweep sort");
                    runn += 4;
                    balll++;
                }
                case 17 -> {
                    System.out.println("danger and rocket throw----RUN OUT...yes its " +
                            "you");
                    wickett += 1;
                    balll++;
                }
                case 18 -> {
                    System.out.println("ohh sitt miss bowndary riders miss the catch 4 run in batsman account");
                    runn += 4;
                    balll++;
                }
            }

            if (balll == 6) {
                balll = 0;
                overr++;
            }
        }
        System.out.println(" score " + runn + "-" + wickett + " (" + overr + "." + balll + ")");

        if (runn >= target) {
            System.out.println("the target i chased");
        } else {
            System.out.println("you defended");
        }
    }


    // player is bowling and computer is  batting
    public static int bowlingFirst() {
        Scanner sc3 = new Scanner(System.in);
        Random rn3 = new Random();

        System.out.println("now gets ready for the bowlling");

        int runn = 0;
        int overr = 0;
        int balll = 0;

        int wickett = 0;
        while (overr < 2) {
            System.out.println(" score " + runn + "-" + wickett + " (" + overr + "." + balll + ")");
            System.out.println("\n now the delivery of " + (balll + 1) + " ball of over " + (overr + 1));
            System.out.println("press enter to throw the ball");
            String p2 = sc3.nextLine();
            int s1 = rn3.nextInt(19);
            switch (s1) {
                case 0 -> {
                    System.out.println("you have clean bowled!!!! .. its the ball of 148.6 km/hr");
                    balll++;
                    wickett++;
                }


                case 1 -> {
                    System.out.println("dot ball ....batsman is under pressure keep it up");
                    balll++;
                }
                case 2 -> {
                    System.out.println("1 run on the mid off maintain the pressure");
                    runn++;
                    balll++;
                }
                case 3 -> {
                    System.out.println("upper cut for 4 run......dont worry");
                    runn += 4;
                    balll++;

                }
                case 4 -> {
                    System.out.println("6 run the ball is out of stadium .back to the good length");
                    runn += 6;
                    balll++;
                }
                case 5 -> {
                    System.out.println("misfield for 2 run......dont misfield...");
                    runn += 2;
                    balll++;
                }
                case 6 -> {
                    System.out.println("caught by wicket kipper......now it was done");
                    wickett++;
                    balll++;
                }
                case 7 -> {
                    System.out.println("6 run and it is the hellii short....its unbelieveble");
                    runn += 6;
                    balll++;
                }
                case 8 -> {
                    System.out.println("4 runs by pull short......ohhh yrr");
                    runn += 4;
                    balll++;
                }
                case 9 -> {
                    System.out.println("wide ball ....you under pressure");
                    runn += 1;

                }
                case 10 -> {
                    System.out.println("leg by apeal to impire but not out 2 runs to the batsman");
                    runn += 2;
                    balll++;
                }
                case 11 -> {
                    System.out.println("6 from pull shott.....damped ");
                    runn += 6;
                    balll++;
                }
                case 12 -> {
                    System.out.println("no ball .......its big mistake by you....");
                    runn += 1;
                    balll--;
                }
                case 13 -> {
                    System.out.println("its for four run dont worry");
                    runn += 4;
                    balll++;
                }
                case 14 -> {
                    System.out.println("its for 2 run leg by");
                    runn += 2;
                    balll++;
                }
                case 15 -> {
                    System.out.println("its for 6 run.........damped...");
                    runn += 6;
                    balll++;
                }
                case 16 -> {
                    System.out.println("4 run by sweep sort");
                    runn += 4;
                    balll++;
                }
                case 17 -> {
                    System.out.println("danger and rocket throw----RUN OUT...yes its " +
                            "you");
                    wickett += 1;
                    balll++;
                }
                case 18 -> {
                    System.out.println("ohh sitt miss bowndary riders miss the catch 4 run in batsman account");
                    runn += 4;
                    balll++;
                }
            }

            if (balll == 6) {
                balll = 0;
                overr++;
            }
        }
        System.out.println(" score " + runn + "-" + wickett + " (" + overr + "." + balll + ")");

        return runn;

    }


    // player is batting and computer is bowling
    public static void battingLast(int target) {
        System.out.println("now get ready for batting....... ");
        Scanner sc2 = new Scanner(System.in);
        Random rn2 = new Random();
        int run = 0;
        int over = 0;
        int ball = 0;
        int score = 0;
        int wicket = 0;
        while (over < 2 && run < target) {
            System.out.println(" score " + run + "-" + wicket + " (" + over + "." + ball + ")");
            System.out.println("\n" + (ball + 1) + " delivery of  over " + (over + 1));
            System.out.println("press enter to play the ball");
            String p1 = sc2.nextLine();
            int s1 = rn2.nextInt(19);
            switch (s1) {
                case 0 -> {
                    System.out.println("you are bowled!!!! .. its the ball of 148.6 km/hr");
                    ball++;
                    wicket++;
                }


                case 1 -> {
                    System.out.println("dot ball ....batsman is under pressure");
                    ball++;
                }
                case 2 -> {
                    System.out.println("1 run on the mid off");
                    run++;
                    ball++;
                }
                case 3 -> {
                    System.out.println("upper cut for 4 run");
                    run += 4;
                    ball++;

                }
                case 4 -> {
                    System.out.println("6 run the ball is out of stadium");
                    run += 6;
                    ball++;
                }
                case 5 -> {
                    System.out.println("misfield for 2 run");
                    run += 2;
                    ball++;
                }
                case 6 -> {
                    System.out.println("caught by wicket kipper");
                    wicket++;
                    ball++;
                }
                case 7 -> {
                    System.out.println("6 run and it is the hellii short");
                    run += 6;
                    ball++;
                }
                case 8 -> {
                    System.out.println("4 runs by pull short");
                    run += 4;
                    ball++;
                }
                case 9 -> {
                    System.out.println("wide ball ....baller under pressure");
                    run += 1;

                }
                case 10 -> {
                    System.out.println("leg by apeal to impire but not out 2 runs to the batsman");
                    run += 2;
                    ball++;
                }
                case 11 -> {
                    System.out.println("6 from pull shott...");
                    run += 6;
                    ball++;
                }
                case 12 -> {
                    System.out.println("no ball .......its big mistake....");
                    run += 1;
                    ball--;
                }
                case 13 -> {
                    System.out.println("its for four run");
                    run += 4;
                    ball++;
                }
                case 14 -> {
                    System.out.println("its for 2 run leg by");
                    run += 2;
                    ball++;
                }
                case 15 -> {
                    System.out.println("its for 6 run");
                    run += 6;
                    ball++;
                }
                case 16 -> {
                    System.out.println("4 run by sweep sort");
                    run += 4;
                    ball++;
                }
                case 17 -> {
                    System.out.println("danger and rocket throw----RUN OUT");
                    wicket += 1;
                    ball++;
                }
                case 18 -> {
                    System.out.println("ohh sitt miss bowndary riders miss the catch 4 run in batsman account");
                    run += 4;
                    ball++;
                }
            }

            if (ball == 6) {
                ball = 0;
                over++;
            }
        }
        System.out.println(" score " + run + "-" + wicket + " (" + over + "." + ball + ")");
        if (run >= target) {
            System.out.println(" you won....you chased the target....");
        } else {
            System.out.println(" you defeat....opponent defended the target....");
        }
    }

}
