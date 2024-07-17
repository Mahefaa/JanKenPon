package pfc.arena;

import java.util.List;
import pfc.fighter.Fighter;

public interface Arena {
	Fighter stageFights(List<Fighter> fighters);

	Fighter determineWinner(Fighter attacker, Fighter defender);
}
