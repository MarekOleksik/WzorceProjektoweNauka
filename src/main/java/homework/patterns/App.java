package homework.patterns;

import homework.patterns.singleton.GuessGame;

public class App {
    public static void main(String[] args) {
        GuessGame game = GuessGame.getInstance();

        game.play();

        int score = game.getScore();
        GuessGame anotherGameReference = GuessGame.getInstance();

        if(game==anotherGameReference){
            System.out.println("Singleton!");
            if(score==anotherGameReference.getScore()){
                System.out.println("I punkty się zgadzają");
            }
        }
    }
}
