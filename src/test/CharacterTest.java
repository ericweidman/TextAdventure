import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ericweidman on 2/11/16.
 */
public class CharacterTest {

    @Test
    public void testBattle() throws Exception {
        Player player = new Player();
        player.name = "Test Player";
        Enemy dummy = new Enemy("Target Dummy", 5, 5);
        player.battle(dummy);
        assertTrue(player.health > 0);
        assertTrue(dummy.health <= 0);
    }
}