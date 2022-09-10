package hangman.model;

public class ScoreException extends Exception{

    public static final String NUM_NEGATIVO= "Numero Negativo";
    public static final String PUNTOS_INVALIDOS = "Punto Invalido";

    public ScoreException(String e){
        super(e);
    }
}
