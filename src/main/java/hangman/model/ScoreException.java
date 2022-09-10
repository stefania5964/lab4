package hangman.model;

public class ScoreException extends Exception{

    public static final String NUM_NEGATIVO= "Numero Negativo";
    public static final String PUNTOS_INVALIDOS = "Game Over";
    public static final String PUNTOS_SUPERADOS = "Superaste la Meta FELICIDADES,vuelve a jugar";
    public ScoreException(String e){
        super(e);
    }
}
