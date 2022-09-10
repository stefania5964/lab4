package hangman.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class GameScoreTest {
    /**
     * OriginalScore
     * -10|(-inf,0)|invalido
     * 20|[0,100)|valido
     *
     * BonusScore
     *-5(-inf,0)|invalido
     * 25|[0,100)|valido
     *
     * PowerScore
     * -3(-inf,0)|invalido
     * 25|[0,500)|valido
     * 501(500,inf)|invalido
     */
    @Test
    public void OriginalScore_without_going_out_of_range_valid() throws ScoreException{
        //arrange
        int correctCount =10;
        int incorrectCount = 2;
        int expected = 80;
        //act
        GameScore original = new OriginalScore();
        //assert
        assertEquals(expected, original.calculateScore(correctCount, incorrectCount));
    }
    @Test
    public void OriginalScore_went_out_of_range_invalid() throws ScoreException{
        //arrange
        int correctCount =3;
        int incorrectCount = 11;
        int expected = -10;
        //act
        GameScore original = new OriginalScore();
        //assert
        assertEquals(expected, original.calculateScore(correctCount, incorrectCount));
    }
    @Test
    public void BonusScore_without_going_out_of_range_valid() throws ScoreException{
        //arrange
        int correctCount =1;
        int incorrectCount = 1;
        int expected = 5;
        //act
        GameScore original = new OriginalScore();
        //assert
        assertEquals(expected, original.calculateScore(correctCount, incorrectCount));
    }
    @Test
    public void BonusScore_went_out_of_range_invalid() throws ScoreException{
        //arrange
        int correctCount =1;
        int incorrectCount = 3;
        int expected = -5;
        //act
        GameScore original = new OriginalScore();
        //assert
        assertEquals(expected, original.calculateScore(correctCount, incorrectCount));
    }
    @Test
    public void PowerScore_without_going_out_of_range_valid() throws ScoreException{
        //arrange
        int correctCount =3;
        int incorrectCount = 1;
        int expected = 117;
        //act
        GameScore original = new OriginalScore();
        //assert
        assertEquals(expected, original.calculateScore(correctCount, incorrectCount));
    }
    @Test
    public void PowerScore_went_out_of_range_invalid_negative() throws ScoreException{
        //arrange
        int correctCount =1;
        int incorrectCount = 1;
        int expected = -3;
        //act
        GameScore original = new OriginalScore();
        //assert
        assertEquals(expected, original.calculateScore(correctCount, incorrectCount));
    }
    @Test
    public void PowerScore_went_out_of_range_invalid() throws ScoreException{
        //arrange
        int correctCount =4;
        int incorrectCount = 3;
        int expected = 601;
        //act
        GameScore original = new OriginalScore();
        //assert
        assertEquals(expected, original.calculateScore(correctCount, incorrectCount));
    }
}
