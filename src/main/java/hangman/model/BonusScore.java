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
     * @throws ScoreException
     */

    @Override
    public int calculateScore(int correctCount, int incorrectCount){
        return 0;
    }
}
