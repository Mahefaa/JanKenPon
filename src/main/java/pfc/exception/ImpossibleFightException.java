package pfc.exception;

import pfc.fighter.Fighter;

public class ImpossibleFightException extends RuntimeException {
	private static final String ERROR_FORMAT = "%s cannot fight %s";

	public ImpossibleFightException(Fighter fighter1, Fighter fighter2) {
		super(computeMessage(fighter1, fighter2));
	}

	private static String computeMessage(Fighter fighter1, Fighter fighter2) {
		return String.format(ERROR_FORMAT, fighter1.toString(), fighter2.toString());
	}
}
