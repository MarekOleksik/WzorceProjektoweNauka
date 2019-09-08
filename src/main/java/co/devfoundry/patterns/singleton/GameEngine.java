package co.devfoundry.patterns.singleton;

import java.io.Serializable;

public class GameEngine implements Serializable {
    private static final long serialVersionUID = 23232323;

    private int hp = 100;
    private String characterName = "";

    private static GameEngine instance = new GameEngine();

    private GameEngine() {

    }

    public void run() {
        while (true) {
            //czekamy na input gracza
            //zmieniamy stan gry
            //renderujemy grafikę
        }
    }

    public static GameEngine getInstance() {
       /* if (instance == null) {
            synchronized (GameEngine.class) {
                if (instance == null) {
                    instance = new GameEngine();
                }
            }
        }*/
        return instance;
    }
    protected Object readResolve(){
        return getInstance();
    }
}
