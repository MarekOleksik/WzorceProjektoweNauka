package homework.patterns.singleton;

import java.io.Serializable;
import java.util.Random;
import java.util.Scanner;

public class GuessGame implements Serializable {
    private static final long serialVersionUID = 23232323;
    
    private static GuessGame instance = new GuessGame();
    private int score=0;
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);

    private GuessGame() {
    }

    public void play() {
        for(int i  = 0; i<10; i++) {
            int number = random.nextInt(9);
            System.out.print("Zgadnij cyfre: ");
            int quess = scanner.nextInt();

            if(number==quess) {
                System.out.println("Udalo sie!");
                score++;
            } else {
                System.out.println("Przykro mi, myslalem o " + number);
            }
        }

        System.out.println("Twoj wynik: " + score);
    }

    public static GuessGame getInstance(){
        return instance;
    }

    protected Object readResolve(){
        return getInstance();
    }

    public int getScore() {
        return score;
    }
}
