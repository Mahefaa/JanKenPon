package pfc.fighter;

import pfc.exception.ImpossibleFightException;

public interface Fighter {
	FightResult fight(Fighter fighter) throws ImpossibleFightException;

	boolean canFight(Fighter fighter);

	String getName();

	enum FightResult {
		WIN, LOSS, DRAW;
	}
}
