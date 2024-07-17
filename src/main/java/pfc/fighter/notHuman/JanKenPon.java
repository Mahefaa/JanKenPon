package pfc.fighter.notHuman;

import static pfc.fighter.Fighter.FightResult.LOSS;
import static pfc.fighter.Fighter.FightResult.DRAW;
import static pfc.fighter.Fighter.FightResult.WIN;

import pfc.exception.ImpossibleFightException;
import pfc.fighter.Fighter;

public enum JanKenPon implements Fighter {
	PIERRES {
		@Override
		public FightResult combattrePfc(JanKenPon janKenPon) {
			return switch (janKenPon) {
				case PIERRES -> DRAW;
				case CISEAUX -> WIN;
				case FEUILLES -> LOSS;
			};
		}
	}, FEUILLES {
		@Override
		public FightResult combattrePfc(JanKenPon janKenPon) {
			return switch (janKenPon) {
				case PIERRES -> WIN;
				case FEUILLES -> DRAW;
				case CISEAUX -> LOSS;
			};
		}
	}, CISEAUX {
		@Override
		public FightResult combattrePfc(JanKenPon janKenPon) {
			return switch (janKenPon) {
				case PIERRES -> LOSS;
				case CISEAUX -> DRAW;
				case FEUILLES -> WIN;
			};
		}
	};

	public abstract FightResult combattrePfc(JanKenPon janKenPon);

	@Override
	public final FightResult fight(Fighter fighter) {
		if (!canFight(fighter)) {
			throw new ImpossibleFightException(this, fighter);
		}
		JanKenPon janKenPon = (JanKenPon) fighter;
		return this.combattrePfc(janKenPon);
	}

	@Override
	public boolean canFight(Fighter fighter) {
		return fighter instanceof JanKenPon;
	}

	@Override
	public final String toString() {
		return this.name();
	}

	@Override
	public final String getName() {
		return this.name();
	}
}
