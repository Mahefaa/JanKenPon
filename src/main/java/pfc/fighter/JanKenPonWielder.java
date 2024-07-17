package pfc.fighter;

import pfc.exception.ImpossibleFightException;
import pfc.fighter.notHuman.JanKenPon;

public record JanKenPonWielder(String name, JanKenPon janKenPon) implements Fighter {
	@Override
	public FightResult fight(Fighter fighter) throws ImpossibleFightException {
		if (!canFight(fighter)) {
			throw new ImpossibleFightException(this, fighter);
		}
		JanKenPonWielder defender = (JanKenPonWielder) fighter;
		return this.janKenPon.fight(defender.janKenPon);
	}

	@Override
	public boolean canFight(Fighter fighter) {
		return fighter instanceof JanKenPonWielder;
	}

	@Override
	public String getName() {
		return name;
	}
}
