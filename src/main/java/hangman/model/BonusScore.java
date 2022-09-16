package hangman.model;

public class BonusScore implements GameScore{
    /**
     * El juego inicia en 0 puntos.
     * Se bonifica con 10 puntos cada letra correcta.
     * Se penaliza con 5 puntos cada letra incorrecta.
     * @pre ScoreCalculated = 0
     * @pos ScoreCalculated (10*correctCount-5*incorrectCount).
     *
     * @param correctCount
     * @param incorrectCount
     *
     */
    private int result = 0;
    @Override
    public int calculateScore(int correctCount, int incorrectCount){


        result = correctCount*10-incorrectCount*5;
        if(result-(incorrectCount*5)<0){
            return 0;
        }else
            return result;


    }
}
