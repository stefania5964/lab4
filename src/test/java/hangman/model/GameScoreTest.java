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
        GameScore original = new OriginalScore();
        assertEquals(80, original.calculateScore(10, 2));
    }
    @Test
    public void OriginalScore_went_out_of_range_invalid() throws ScoreException{
        GameScore original = new OriginalScore();
        assertEquals(-10, original.calculateScore(3, 11));
    }
    @Test
    public void BonusScore_without_going_out_of_range_valid() throws ScoreException{
        GameScore original = new OriginalScore();
        assertEquals(5, original.calculateScore(1, 1));
    }
    @Test
    public void BonusScore_went_out_of_range_invalid() throws ScoreException{
        GameScore original = new OriginalScore();
        assertEquals(-5, original.calculateScore(1, 3));
    }
    @Test
    public void PowerScore_without_going_out_of_range_valid() throws ScoreException{
        GameScore original = new OriginalScore();
        assertEquals(117, original.calculateScore(3, 1));
    }
    @Test
    public void PowerScore_went_out_of_range_invalid_negative() throws ScoreException{
        GameScore original = new OriginalScore();
        assertEquals(-3, original.calculateScore(1, 1));
    }
    @Test
    public void PowerScore_went_out_of_range_invalid() throws ScoreException{
        GameScore original = new OriginalScore();
        assertEquals(601, original.calculateScore(4, 3));
    }
}
