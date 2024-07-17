package pfc.arena;

import java.util.List;
import pfc.fighter.Fighter;

public class EvenEqualsAttackerVictoryArena implements Arena {
	@Override
	public Fighter stageFights(List<Fighter> fighters) {
		var winner = fighters.getFirst();
		for (int i = 1; i < fighters.size(); i++) {
			var defender = fighters.get(i);
			winner = determineWinner(winner, defender);
		}
		return winner;
	}

	@Override
	public Fighter determineWinner(Fighter attacker, Fighter defender) {
		var result = attacker.fight(defender);
		return switch (result) {
			case WIN, DRAW -> attacker;
			case LOSS -> defender;
		};
	}
}
