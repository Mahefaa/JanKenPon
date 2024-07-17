package pfc;

import static pfc.fighter.notHuman.JanKenPon.CISEAUX;
import static pfc.fighter.notHuman.JanKenPon.FEUILLES;
import static pfc.fighter.notHuman.JanKenPon.PIERRES;

import pfc.fighter.Fighter;

public class TestUtils {
	public static Fighter getPierres() {
		Fighter fighter;
		{
			fighter = PIERRES;
		}
		return fighter;
	}

	public static Fighter getFeuilles() {
		Fighter fighter;
		{
			fighter = FEUILLES;
		}
		return fighter;
	}

	public static Fighter getCiseaux() {
		Fighter fighter;
		{
			fighter = CISEAUX;
		}
		return fighter;
	}
}
