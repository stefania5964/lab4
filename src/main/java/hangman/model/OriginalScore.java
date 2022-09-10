package hangman.model;

public class OriginalScore implements GameScore{
    /**juego del modo original
     * el juego empieza con100 puntos y se penaliza una palabra incorrecta con -10
     * @pre 100
     * @pos 100-(10*incorrectCount)
     * en la calculadora entra la cuenta de las palabras correctas y de las palabras incorrectas,si se sale de rango
     * se va a realizar una excepcion
     * @param correctCount
     * @param incorrectCount
     * @throws ScoreException
     */

    @Override
    public int calculateScore(int correctCount, int incorrectCount) throws ScoreException{
        return 0;
    }
}
