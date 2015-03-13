package pow.actions;

import pow.basic.Board;
import pow.cards.Creature;

/**
 * Created by Olymp on 13.03.15.
 */
public interface AttackReactionInterface {
    void attackReaction(Creature attacker, Creature defender, Board board);

    void attackReaction(AttackAction action, Board board);
}