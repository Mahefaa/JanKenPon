package pfc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static pfc.TestUtils.getCiseaux;
import static pfc.TestUtils.getFeuilles;
import static pfc.TestUtils.getPierres;

import java.util.List;
import org.junit.jupiter.api.Test;
import pfc.arena.Arena;
import pfc.arena.EvenEqualsAttackerDefeatArena;
import pfc.arena.EvenEqualsAttackerVictoryArena;
import pfc.fighter.Fighter;

class JanKenPonArenaTest {
	private static final Arena DRAWN_WIN_ARENA = new EvenEqualsAttackerVictoryArena();
	private static final Arena DRAWN_LOSS_ARENA = new EvenEqualsAttackerDefeatArena();
	private static final List<Fighter> fighters = List.of(
		getPierres(), getPierres(), getPierres(), getFeuilles(), getCiseaux(), getPierres(), getFeuilles(), getCiseaux()
	);

	@Test
	void win_from_even_equals_victory_arena_ok() {
		var winner = DRAWN_WIN_ARENA.stageFights(fighters);

		assertEquals(getCiseaux(), winner);
	}

	@Test
	void win_from_even_equals_defeat_arena_ok() {
		var winner = DRAWN_LOSS_ARENA.stageFights(fighters);

		assertEquals(getCiseaux(), winner);
	}
}
