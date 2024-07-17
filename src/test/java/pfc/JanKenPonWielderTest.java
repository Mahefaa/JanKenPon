package pfc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static pfc.TestUtils.getCiseaux;
import static pfc.TestUtils.getFeuilles;
import static pfc.fighter.Fighter.FightResult.WIN;

import org.junit.jupiter.api.Test;
import pfc.fighter.Fighter;
import pfc.fighter.JanKenPonWielder;
import pfc.fighter.notHuman.JanKenPon;

class JanKenPonWielderTest {

	@Test
	void attacker_beats_defender_ok() {
		JanKenPonWielder attacker = new JanKenPonWielder("Tom", (JanKenPon) getCiseaux());
		JanKenPonWielder defender = new JanKenPonWielder("Jerry", (JanKenPon) getFeuilles());

		Fighter.FightResult result = attacker.fight(defender);
		System.out.println(attacker.getName());
		System.out.println(attacker.getName());

		assertEquals(WIN, result);
	}
}
