package cardgame.cards.effects;

import java.util.List;
import java.util.Optional;

import cardgame.cards.Minion;
import cardgame.cards.Targetable;

public class MinionDestroyEffect extends Effect {

	public MinionDestroyEffect() {
		super("minion destroy", EffectArea.ONE_MINION);
		isTargetRequired = true;
	}

	@Override
	public void realizeEffect(Optional<List<Targetable>> targets) {
		if (targets.isPresent()) {
			List<Targetable> myTargets = targets.get();

			for (Targetable minion : myTargets) {
				((Minion) minion).setHealth(0);
			}
		}
	}
}
