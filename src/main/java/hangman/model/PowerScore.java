package hangman.model;

public class PowerScore implements GameScore{
    /**juego del modo poweBonusScore
     * el juego empieza con 0 puntos y va aumentando 5 ala i-esima
     * siendo i numero de letras,sem penaliza con 8puntos palabra incorrecta
     * puntaje minimo 0 y el maximo es 500
     * en la calculadora entra la cuenta de las palabras correctas y de las palabras incorrectas,si se sale de rango
     * se va a realizar una excepcion
     * @pre ScoreCalculated = 0
     * @pos ScoreCalculated se calcula asi (5^i-8*incorrectCount)
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
