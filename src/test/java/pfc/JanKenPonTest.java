package pfc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static pfc.TestUtils.getCiseaux;
import static pfc.TestUtils.getFeuilles;
import static pfc.TestUtils.getPierres;
import static pfc.fighter.Fighter.FightResult.DRAW;
import static pfc.fighter.Fighter.FightResult.LOSS;
import static pfc.fighter.Fighter.FightResult.WIN;

import org.junit.jupiter.api.Test;
import pfc.exception.ImpossibleFightException;
import pfc.fighter.Fighter;
import pfc.fighter.human.UFCFighter;

class JanKenPonTest {
	@Test
	void pierre_beats_ciseau_and_reciproque_ok() {
		Fighter pierres = getPierres();
		Fighter ciseaux = getCiseaux();

		Fighter.FightResult fight = pierres.fight(ciseaux);
		Fighter.FightResult inverseFight = ciseaux.fight(pierres);

		assertEquals(WIN, fight);
		assertEquals(LOSS, inverseFight);
	}

	@Test
	void ciseau_beats_feuilles_and_reciproque_ok() {
		Fighter ciseaux = getCiseaux();
		Fighter feuilles = getFeuilles();

		Fighter.FightResult fight = ciseaux.fight(feuilles);
		Fighter.FightResult inverseFight = feuilles.fight(ciseaux);

		assertEquals(WIN, fight);
		assertEquals(LOSS, inverseFight);
	}

	@Test
	void feuilles_beats_pierre_and_reciproque_ok() {
		Fighter pierres = getPierres();
		Fighter ciseaux = getCiseaux();

		Fighter.FightResult fight = pierres.fight(ciseaux);
		Fighter.FightResult inverseFight = ciseaux.fight(pierres);

		assertEquals(WIN, fight);
		assertEquals(LOSS, inverseFight);
	}

	@Test
	void feuilles_draws_feuille_ok() {
		Fighter feuilles = getFeuilles();
		Fighter feuilles2 = getFeuilles();

		Fighter.FightResult fight = feuilles.fight(feuilles2);

		assertEquals(DRAW, fight);
	}

	@Test
	void fighter_of_different_race_cannot_fight() {
		assertThrows(ImpossibleFightException.class, () -> getPierres().fight(new UFCFighter(999, "Mahefa")));
	}
}
