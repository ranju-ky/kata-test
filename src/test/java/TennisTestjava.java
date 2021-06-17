import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class TennisTestjava {

    @Test
    void registroLaPuntuacionActual() {
        TennisGame game = new TennisGame();
        game.wonPoint("player 2");
        assertThat(game.getScore(), equalTo("0-15"));
    }

    @Test
    void registroLaPuntuacionActual2() {
        TennisGame game = new TennisGame();
        game.wonPoint("player 1");
        assertThat(game.getScore(), equalTo("15-0"));
    }

    @Test
    void registroLaPuntuacionActual2() {
        TennisGame game = new TennisGame();
        game.wonPoint("player 1");
        assertThat(game.getScore(), equalTo("15-0"));
    }

}
