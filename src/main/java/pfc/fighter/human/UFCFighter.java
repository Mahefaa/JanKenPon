package pfc.fighter.human;

import static pfc.fighter.Fighter.FightResult.DRAW;
import static pfc.fighter.Fighter.FightResult.LOSS;
import static pfc.fighter.Fighter.FightResult.WIN;

import pfc.exception.ImpossibleFightException;
import pfc.fighter.Fighter;

public record UFCFighter(int power, String name) implements Fighter {
	@Override
	public FightResult fight(Fighter fighter) throws ImpossibleFightException {
		if (!canFight(fighter)) {
			throw new ImpossibleFightException(this, fighter);
		}
		return this.fight((UFCFighter) fighter);
	}

	private FightResult fight(UFCFighter UFCFighter) {
		if (this.power > UFCFighter.power) return WIN;
		if (this.power < UFCFighter.power) return LOSS;
		else return DRAW;
	}

	@Override
	public boolean canFight(Fighter fighter) {
		return fighter instanceof UFCFighter;
	}

	@Override
	public String getName() {
		return this.name;
	}
}
